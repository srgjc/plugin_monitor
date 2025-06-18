/**
 * 
 */
package org.tzi.use.plugins.monitor;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.tzi.use.config.Options;
import org.tzi.use.plugins.monitor.vm.adapter.VMAdapter;
import org.tzi.use.plugins.monitor.vm.adapter.jvm.JVMAdapter;

/**
 * @author Lars Hamann
 *
 */
public class AdapterRegistry {
	
	private static VMAdapter[] adapters = null;
	
	public VMAdapter[] loadAvailableAdapter() {
		
		if (adapters != null)
			return adapters;
		
		List<VMAdapter> result = new ArrayList<VMAdapter>();
		
		// Built-in is JVMAdapter
		result.add(new JVMAdapter());		
		
		// Read all jars which are named "MonitorAdapter_*.jar"
		File pluginDir = null;
		try {
			pluginDir = new File(new URI("file:///" + Options.pluginDir + "/monitor_adapter" ));
		} catch (URISyntaxException e) {
			// Cannot happen, runtime is already up
		}
		
		if (!pluginDir.exists())
			return result.toArray(new VMAdapter[1]);
		
		File[] adapterJars = pluginDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.startsWith("MonitorAdapter_") && name.endsWith(".jar");
			}
		});
		
		URL[] jarURLs = new URL[adapterJars.length];
		for (int i = 0; i < adapterJars.length; ++i) {
			try {
				jarURLs[i] = adapterJars[i].toURI().toURL();
			} catch (MalformedURLException e) { }
		}
		
		ClassLoader loader = URLClassLoader.newInstance( jarURLs, getClass().getClassLoader());
		
		for (File file : adapterJars) {
			JarFile jarFile;
			try {
				jarFile = new JarFile(file);
			} catch (IOException e) {
				continue;
			}
			
			Enumeration<JarEntry> enumEntries = jarFile.entries();
			while(enumEntries.hasMoreElements()) {
				JarEntry entry = enumEntries.nextElement();
				if (!entry.isDirectory() && entry.getName().endsWith(".class")) {
					String rawName = entry.getName();
					if (rawName.startsWith("META-INF/versions/")) {
						// Remove "META-INF/versions/<version>/"
						rawName = rawName.substring(rawName.indexOf('/', "META-INF/versions/".length()) + 1);
					}
					String className = rawName.replace('/', '.').replace(".class", "");
					// Skip descriptor classes
					if (className.endsWith("module-info") || className.endsWith("package-info")) {
						continue;
					}
					try {
						Class<?> clazz = Class.forName(className, true, loader);
						Class<? extends VMAdapter> adapterClass = clazz.asSubclass(VMAdapter.class);

						Constructor<? extends VMAdapter> ctor = adapterClass.getConstructor();
						VMAdapter adapter = ctor.newInstance();
						result.add(adapter);
					} catch (ClassNotFoundException | InvocationTargetException | ClassCastException |
                             IllegalAccessException | InstantiationException | IllegalArgumentException |
                             NoSuchMethodException | SecurityException ignored) {
					}
                }
				
			}
		}
		
		adapters = result.toArray(new VMAdapter[result.size()]);
		return adapters;
	}

	/**
	 * @return
	 */
	public VMAdapter getAdapterByName(String name) {
		VMAdapter[] adapter = loadAvailableAdapter();
		for (int i = 0; i < adapter.length; ++i) {
			if (adapter[i].toString().equals(name))
				return adapter[i];
		}
		
		return null;
	}
	
}

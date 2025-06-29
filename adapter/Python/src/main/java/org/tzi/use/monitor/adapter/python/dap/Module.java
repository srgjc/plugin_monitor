package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * A Module object represents a row in the modules view.
 * The `id` attribute identifies a module in the modules view and is used in a `module`
 * event for identifying a module for adding, updating or deleting.
 * The `name` attribute is used to minimally render the module in the UI.
 *
 * Additional attributes can be added to the module. They show up in the module view if they
 * have a corresponding `ColumnDescriptor`.
 *
 * To avoid an unnecessary proliferation of additional attributes with similar semantics but
 * different names, we recommend to re-use attributes from the 'recommended' list below
 * first, and only introduce new attributes if nothing appropriate could be found.
 *
 * The new, changed, or removed module. In case of `removed` only the module id is used.
 */
public class Module {
    private String addressRange;
    private String dateTimeStamp;
    private IDUnion id;
    private Boolean isOptimized;
    private Boolean isUserCode;
    private String name;
    private String path;
    private String symbolFilePath;
    private String symbolStatus;
    private String version;

    /**
     * Address range covered by this module.
     */
    @JsonProperty("addressRange")
    public String getAddressRange() { return addressRange; }
    @JsonProperty("addressRange")
    public void setAddressRange(String value) { this.addressRange = value; }

    /**
     * Module created or modified, encoded as a RFC 3339 timestamp.
     */
    @JsonProperty("dateTimeStamp")
    public String getDateTimeStamp() { return dateTimeStamp; }
    @JsonProperty("dateTimeStamp")
    public void setDateTimeStamp(String value) { this.dateTimeStamp = value; }

    /**
     * Unique identifier for the module.
     */
    @JsonProperty("id")
    public IDUnion getID() { return id; }
    @JsonProperty("id")
    public void setID(IDUnion value) { this.id = value; }

    /**
     * True if the module is optimized.
     */
    @JsonProperty("isOptimized")
    public Boolean getIsOptimized() { return isOptimized; }
    @JsonProperty("isOptimized")
    public void setIsOptimized(Boolean value) { this.isOptimized = value; }

    /**
     * True if the module is considered 'user code' by a debugger that supports 'Just My Code'.
     */
    @JsonProperty("isUserCode")
    public Boolean getIsUserCode() { return isUserCode; }
    @JsonProperty("isUserCode")
    public void setIsUserCode(Boolean value) { this.isUserCode = value; }

    /**
     * A name of the module.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * Logical full path to the module. The exact definition is implementation defined, but
     * usually this would be a full path to the on-disk file for the module.
     */
    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    /**
     * Logical full path to the symbol file. The exact definition is implementation defined.
     */
    @JsonProperty("symbolFilePath")
    public String getSymbolFilePath() { return symbolFilePath; }
    @JsonProperty("symbolFilePath")
    public void setSymbolFilePath(String value) { this.symbolFilePath = value; }

    /**
     * User-understandable description of if symbols were found for the module (ex: 'Symbols
     * Loaded', 'Symbols not found', etc.)
     */
    @JsonProperty("symbolStatus")
    public String getSymbolStatus() { return symbolStatus; }
    @JsonProperty("symbolStatus")
    public void setSymbolStatus(String value) { this.symbolStatus = value; }

    /**
     * Version of Module.
     */
    @JsonProperty("version")
    public String getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(String value) { this.version = value; }
}

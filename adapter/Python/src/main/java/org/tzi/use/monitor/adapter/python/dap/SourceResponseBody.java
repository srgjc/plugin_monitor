package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class SourceResponseBody {
    private String content;
    private String mimeType;

    /**
     * Content of the source reference.
     */
    @JsonProperty("content")
    public String getContent() { return content; }
    @JsonProperty("content")
    public void setContent(String value) { this.content = value; }

    /**
     * Content type (MIME type) of the source.
     */
    @JsonProperty("mimeType")
    public String getMIMEType() { return mimeType; }
    @JsonProperty("mimeType")
    public void setMIMEType(String value) { this.mimeType = value; }
}

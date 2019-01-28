package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcAssetOptionsRate extends GxcEntity{

    @JsonProperty("base")
    private GxcAmount base;

    @JsonProperty("quote")
    private GxcAmount quote;

    public GxcAmount getBase() {
        return base;
    }

    public void setBase(GxcAmount base) {
        this.base = base;
    }

    public GxcAmount getQuote() {
        return quote;
    }

    public void setQuote(GxcAmount quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"base\":").append(base);
        sb.append(", \"quote\":").append(quote);
        sb.append('}');
        return sb.toString();
    }
}

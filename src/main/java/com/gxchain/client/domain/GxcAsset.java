package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcAsset extends GxcEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("symbol")
    private String symbol;


    @JsonProperty("precision")
    private Integer precision;

    @JsonProperty("issuer")
    private String issuer;

    @JsonProperty("options")
    private GxcAssetOptions options;

    @JsonProperty("dynamic_asset_data_id")
    private String dynamicAssetDataId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public GxcAssetOptions getOptions() {
        return options;
    }

    public void setOptions(GxcAssetOptions options) {
        this.options = options;
    }

    public String getDynamicAssetDataId() {
        return dynamicAssetDataId;
    }

    public void setDynamicAssetDataId(String dynamicAssetDataId) {
        this.dynamicAssetDataId = dynamicAssetDataId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"").append(id).append('\"');
        sb.append(", \"symbol\":\"").append(symbol).append('\"');
        sb.append(", \"precision\":").append(precision);
        sb.append(", \"issuer\":\"").append(issuer).append('\"');
        sb.append(", \"options\":").append(options);
        sb.append(", \"dynamicAssetDataId\":\"").append(dynamicAssetDataId).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

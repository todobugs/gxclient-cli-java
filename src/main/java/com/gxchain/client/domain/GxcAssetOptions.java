package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcAssetOptions extends GxcEntity {

    @JsonProperty("max_supply")
    private String maxSupply;

    @JsonProperty("market_fee_percent")
    private String marketFeePercent;

    @JsonProperty("max_market_fee")
    private String maxMarketFee;

    @JsonProperty("issuer_permissions")
    private String issuerPermissions;

    @JsonProperty("flags")
    private Integer flags;

    @JsonProperty("core_exchange_rate")
    private GxcAssetOptionsRate coreExchangeEate;

    /**
     * 不知名数组类型
     */
    @JsonProperty("whitelist_authorities")
    private Object whitelistAuthorities;

    /**
     * 不知名数组类型
     */
    @JsonProperty("blacklist_authorities")
    private Object blacklistAuthorities;

    /**
     * 不知名数组类型
     */
    @JsonProperty("whitelist_markets")
    private Object whitelistMarkets;

    /**
     * 不知名数组类型
     */
    @JsonProperty("blacklist_markets")
    private Object blacklistMarkets;

    @JsonProperty("description")
    private String description;

    /**
     * 不知名数组类型
     */
    @JsonProperty("extensions")
    private Object extensions;

    public String getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
    }

    public String getMarketFeePercent() {
        return marketFeePercent;
    }

    public void setMarketFeePercent(String marketFeePercent) {
        this.marketFeePercent = marketFeePercent;
    }

    public String getMaxMarketFee() {
        return maxMarketFee;
    }

    public void setMaxMarketFee(String maxMarketFee) {
        this.maxMarketFee = maxMarketFee;
    }

    public String getIssuerPermissions() {
        return issuerPermissions;
    }

    public void setIssuerPermissions(String issuerPermissions) {
        this.issuerPermissions = issuerPermissions;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public GxcAssetOptionsRate getCoreExchangeEate() {
        return coreExchangeEate;
    }

    public void setCoreExchangeEate(GxcAssetOptionsRate coreExchangeEate) {
        this.coreExchangeEate = coreExchangeEate;
    }

    public Object getWhitelistAuthorities() {
        return whitelistAuthorities;
    }

    public void setWhitelistAuthorities(Object whitelistAuthorities) {
        this.whitelistAuthorities = whitelistAuthorities;
    }

    public Object getBlacklistAuthorities() {
        return blacklistAuthorities;
    }

    public void setBlacklistAuthorities(Object blacklistAuthorities) {
        this.blacklistAuthorities = blacklistAuthorities;
    }

    public Object getWhitelistMarkets() {
        return whitelistMarkets;
    }

    public void setWhitelistMarkets(Object whitelistMarkets) {
        this.whitelistMarkets = whitelistMarkets;
    }

    public Object getBlacklistMarkets() {
        return blacklistMarkets;
    }

    public void setBlacklistMarkets(Object blacklistMarkets) {
        this.blacklistMarkets = blacklistMarkets;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getExtensions() {
        return extensions;
    }

    public void setExtensions(Object extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"maxSupply\":\"").append(maxSupply).append('\"');
        sb.append(", \"marketFeePercent\":\"").append(marketFeePercent).append('\"');
        sb.append(", \"maxMarketFee\":\"").append(maxMarketFee).append('\"');
        sb.append(", \"issuerPermissions\":\"").append(issuerPermissions).append('\"');
        sb.append(", \"flags\":").append(flags);
        sb.append(", \"coreExchangeEate\":").append(coreExchangeEate);
        sb.append(", \"whitelistAuthorities\":").append(whitelistAuthorities);
        sb.append(", \"blacklistAuthorities\":").append(blacklistAuthorities);
        sb.append(", \"whitelistMarkets\":").append(whitelistMarkets);
        sb.append(", \"blacklistMarkets\":").append(blacklistMarkets);
        sb.append(", \"description\":\"").append(description).append('\"');
        sb.append(", \"extensions\":").append(extensions);
        sb.append('}');
        return sb.toString();
    }
}

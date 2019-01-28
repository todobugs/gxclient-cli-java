package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcProxyTransferParams {

    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    @JsonProperty("proxyAccount")
    private String proxyAccount;

    @JsonProperty("amount")
    private GxcAmount amount;

    @JsonProperty("percentage")
    private Integer  percentage;

    @JsonProperty("memo")
    private String memo;

    @JsonProperty("expiration")
    private String expiration;

    @JsonProperty("signatures")
    private List<String> signatures;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getProxyAccount() {
        return proxyAccount;
    }

    public void setProxyAccount(String proxyAccount) {
        this.proxyAccount = proxyAccount;
    }

    public GxcAmount getAmount() {
        return amount;
    }

    public void setAmount(GxcAmount amount) {
        this.amount = amount;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"from\":\"").append(from).append('\"');
        sb.append(", \"to\":\"").append(to).append('\"');
        sb.append(", \"proxyAccount\":\"").append(proxyAccount).append('\"');
        sb.append(", \"amount\":").append(amount);
        sb.append(", \"percentage\":").append(percentage);
        sb.append(", \"memo\":\"").append(memo).append('\"');
        sb.append(", \"expiration\":\"").append(expiration).append('\"');
        sb.append(", \"signatures\":").append(signatures);
        sb.append('}');
        return sb.toString();
    }
}

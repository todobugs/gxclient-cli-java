package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcVestingBalance extends GxcEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("balance")
    private GxcAmount balance;

    @JsonProperty("policy")
    private JsonNode policy;

    @JsonProperty("allowed_withdraw")
    private GxcAmount allowedWithdraw;

    @JsonProperty("allowed_withdraw_time")
    private String allowedWithdrawTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public GxcAmount getBalance() {
        return balance;
    }

    public void setBalance(GxcAmount balance) {
        this.balance = balance;
    }

    public JsonNode getPolicy() {
        return policy;
    }

    public void setPolicy(JsonNode policy) {
        this.policy = policy;
    }

    public GxcAmount getAllowedWithdraw() {
        return allowedWithdraw;
    }

    public void setAllowedWithdraw(GxcAmount allowedWithdraw) {
        this.allowedWithdraw = allowedWithdraw;
    }

    public String getAllowedWithdrawTime() {
        return allowedWithdrawTime;
    }

    public void setAllowedWithdrawTime(String allowedWithdrawTime) {
        this.allowedWithdrawTime = allowedWithdrawTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"").append(id).append('\"');
        sb.append(", \"owner\":\"").append(owner).append('\"');
        sb.append(", \"balance\":").append(balance);
        sb.append(", \"policy\":").append(policy);
        sb.append(", \"allowedWithdraw\":").append(allowedWithdraw);
        sb.append(", \"allowedWithdrawTime\":\"").append(allowedWithdrawTime).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

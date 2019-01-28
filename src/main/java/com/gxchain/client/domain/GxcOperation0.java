package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Description: 转账operation
 * @Author: mingyi
 * @Date: 2019-01-08 16:13
 * @package: com.mingyi.gxclient.chain.domain
 * @name: GxcOperation0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcOperation0 extends GxcEntity {

    @JsonProperty("fee")
    private GxcAmount fee;

    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    @JsonProperty("amount")
    private GxcAmount amount;

    /**
     * 待确认列表类型
     */
    @JsonProperty("extensions")
    private List<String> extensions;

    public GxcAmount getFee() {
        return fee;
    }

    public void setFee(GxcAmount fee) {
        this.fee = fee;
    }

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

    public GxcAmount getAmount() {
        return amount;
    }

    public void setAmount(GxcAmount amount) {
        this.amount = amount;
    }

    public List<String> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<String> extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"fee\":").append(fee);
        sb.append(", \"from\":\"").append(from).append('\"');
        sb.append(", \"to\":\"").append(to).append('\"');
        sb.append(", \"amount\":").append(amount);
        sb.append(", \"extensions\":").append(extensions);
        sb.append('}');
        return sb.toString();
    }
}

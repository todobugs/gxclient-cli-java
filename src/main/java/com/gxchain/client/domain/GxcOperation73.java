package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Description: 代理转账operation
 * @Author: mingyi
 * @Date: 2019-01-08 16:13
 * @package: com.mingyi.gxclient.chain.domain
 * @name: GxcOperation73
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcOperation73 extends GxcEntity {

    @JsonProperty("proxy_memo")
    private String proxyMemo;

    @JsonProperty("fee")
    private GxcAmount fee;


    @JsonProperty("request_params")
    private GxcOperation73RequestParams requestParams;
    /**
     * 待确认列表类型
     */
    private List<String> extensions;

    public String getProxyMemo() {
        return proxyMemo;
    }

    public void setProxyMemo(String proxyMemo) {
        this.proxyMemo = proxyMemo;
    }

    public GxcAmount getFee() {
        return fee;
    }

    public void setFee(GxcAmount fee) {
        this.fee = fee;
    }

    public GxcOperation73RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(GxcOperation73RequestParams requestParams) {
        this.requestParams = requestParams;
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
        sb.append("\"proxyMemo\":\"").append(proxyMemo).append('\"');
        sb.append(", \"fee\":").append(fee);
        sb.append(", \"requestParams\":").append(requestParams);
        sb.append(", \"extensions\":").append(extensions);
        sb.append('}');
        return sb.toString();
    }
}

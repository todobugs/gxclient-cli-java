package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

/**
 * @Title: GxcTransaction
 * @Description: 交易信息
 * @Author: mingyi
 * @created 2018年4月14日 下午2:54:45
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcTransaction extends GxcEntity {

    @JsonProperty("ref_block_num")
    private Long refBlockNum;

    @JsonProperty("ref_block_prefix")
    private Long refBlockPrefix;

    @JsonProperty("expiration")
    private String expiration;

    @JsonProperty("operations")
    private JsonNode operations;

    @JsonProperty("extensions")
    private Object extensions;

    @JsonProperty("signatures")
    private List<String> signatures;

    @JsonProperty("operation_results")
    private Object operationResults;

    public Long getRefBlockNum() {
        return refBlockNum;
    }

    public void setRefBlockNum(Long refBlockNum) {
        this.refBlockNum = refBlockNum;
    }

    public Long getRefBlockPrefix() {
        return refBlockPrefix;
    }

    public void setRefBlockPrefix(Long refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public JsonNode getOperations() {
        return operations;
    }

    public void setOperations(JsonNode operations) {
        this.operations = operations;
    }

    public Object getExtensions() {
        return extensions;
    }

    public void setExtensions(Object extensions) {
        this.extensions = extensions;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public Object getOperationResults() {
        return operationResults;
    }

    public void setOperationResults(Object operationResults) {
        this.operationResults = operationResults;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"refBlockNum\":").append(refBlockNum);
        sb.append(", \"refBlockPrefix\":").append(refBlockPrefix);
        sb.append(", \"expiration\":\"").append(expiration).append('\"');
        sb.append(", \"operations\":").append(operations);
        sb.append(", \"extensions\":").append(extensions);
        sb.append(", \"signatures\":").append(signatures);
        sb.append(", \"operationResults\":").append(operationResults);
        sb.append('}');
        return sb.toString();
    }
}

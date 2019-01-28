package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GxcAccountRecord extends GxcEntity {
    
    @JsonProperty("memo")
    private String memo;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("op")
    private GxcMainOp gxsMainOp;
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public GxcMainOp getGxsMainOp() {
        return gxsMainOp;
    }
    public void setGxsMainOp(GxcMainOp gxsMainOp) {
        this.gxsMainOp = gxsMainOp;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
    
}

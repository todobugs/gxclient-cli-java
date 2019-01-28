package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcMainOp extends GxcEntity {

    @JsonProperty("id")
    private String opId;
    
//    private List<GxcOperation0> operations;
//    json节点数据
    @JsonProperty("op")
    private JsonNode operations;
    
    @JsonProperty("result")
    private JsonNode result;
    
    @JsonProperty("block_num")
    private Integer blockNum;
    
    @JsonProperty("trx_in_block")
    private Integer trxInBlock;
    
    @JsonProperty("op_in_trx")
    private Integer opInTrx;
    
    @JsonProperty("virtual_op")
    private Integer virtualOp;

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public JsonNode getOperations() {
        return operations;
    }

    public void setOperations(JsonNode operations) {
        this.operations = operations;
    }

    public JsonNode getResult() {
        return result;
    }

    public void setResult(JsonNode result) {
        this.result = result;
    }

    public Integer getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public Integer getTrxInBlock() {
        return trxInBlock;
    }

    public void setTrxInBlock(Integer trxInBlock) {
        this.trxInBlock = trxInBlock;
    }

    public Integer getOpInTrx() {
        return opInTrx;
    }

    public void setOpInTrx(Integer opInTrx) {
        this.opInTrx = opInTrx;
    }

    public Integer getVirtualOp() {
        return virtualOp;
    }

    public void setVirtualOp(Integer virtualOp) {
        this.virtualOp = virtualOp;
    }
    
}

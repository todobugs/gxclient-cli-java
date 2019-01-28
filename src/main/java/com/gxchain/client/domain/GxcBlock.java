package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Title: GxcBlock
 * @Description: 公信股区块对象
 * @Author: mingyi
 * @created 2018年4月13日 上午11:25:13
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GxcBlock extends GxcEntity {
    
    private String previous;
    
    private String timestamp;
    
    private String witness;
    
    @JsonProperty("transaction_merkle_root")
    private String transactionMerkleRoot;
    
    private List<String> extensions;
    
    @JsonProperty("witness_signature")
    private String witnessSignature;

    @JsonProperty("transactions")
    private List<GxcTransaction> transactions;
    
    @JsonProperty("block_id")
    private String blockId;
    
    @JsonProperty("signing_key")
    private String signingKey;
    
    @JsonProperty("transaction_ids")
    private List<String> transactionIds;
    
    public String getPrevious() {
        return previous;
    }
    public void setPrevious(String previous) {
        this.previous = previous;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getWitness() {
        return witness;
    }
    public void setWitness(String witness) {
        this.witness = witness;
    }
    public String getTransactionMerkleRoot() {
        return transactionMerkleRoot;
    }
    public void setTransactionMerkleRoot(String transactionMerkleRoot) {
        this.transactionMerkleRoot = transactionMerkleRoot;
    }
    public List<String> getExtensions() {
        return extensions;
    }
    public void setExtensions(List<String> extensions) {
        this.extensions = extensions;
    }
    public String getWitnessSignature() {
        return witnessSignature;
    }
    public void setWitnessSignature(String witnessSignature) {
        this.witnessSignature = witnessSignature;
    }

    public List<GxcTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<GxcTransaction> transactions) {
        this.transactions = transactions;
    }

    public String getBlockId() {
        return blockId;
    }
    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }
    public String getSigningKey() {
        return signingKey;
    }
    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }
    public List<String> getTransactionIds() {
        return transactionIds;
    }
    public void setTransactionIds(List<String> transactionIds) {
        this.transactionIds = transactionIds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"previous\":\"").append(previous).append('\"');
        sb.append(", \"timestamp\":\"").append(timestamp).append('\"');
        sb.append(", \"witness\":\"").append(witness).append('\"');
        sb.append(", \"transactionMerkleRoot\":\"").append(transactionMerkleRoot).append('\"');
        sb.append(", \"extensions\":").append(extensions);
        sb.append(", \"witnessSignature\":\"").append(witnessSignature).append('\"');
        sb.append(", \"transactions\":").append(transactions);
        sb.append(", \"blockId\":\"").append(blockId).append('\"');
        sb.append(", \"signingKey\":\"").append(signingKey).append('\"');
        sb.append(", \"transactionIds\":").append(transactionIds);
        sb.append('}');
        return sb.toString();
    }
}

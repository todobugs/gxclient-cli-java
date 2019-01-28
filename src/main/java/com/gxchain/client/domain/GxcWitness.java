package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcWitness extends GxcEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("witness_account")
    private String witnessAccount;

    @JsonProperty("last_aslot")
    private Long last_aslot;

    @JsonProperty("signing_key")
    private String signingKey;

    @JsonProperty("pay_vb")
    private String payVb;

    @JsonProperty("vote_id")
    private String voteId;

    @JsonProperty("total_votes")
    private String totalVotes;

    @JsonProperty("url")
    private String url;

    @JsonProperty("total_missed")
    private Integer totalMissed;

    @JsonProperty("last_confirmed_block_num")
    private Long lastConfirmedBlockNum;

    @JsonProperty("is_valid")
    private String isValid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWitnessAccount() {
        return witnessAccount;
    }

    public void setWitnessAccount(String witnessAccount) {
        this.witnessAccount = witnessAccount;
    }

    public Long getLast_aslot() {
        return last_aslot;
    }

    public void setLast_aslot(Long last_aslot) {
        this.last_aslot = last_aslot;
    }

    public String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    public String getPayVb() {
        return payVb;
    }

    public void setPayVb(String payVb) {
        this.payVb = payVb;
    }

    public String getVoteId() {
        return voteId;
    }

    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    public String getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(String totalVotes) {
        this.totalVotes = totalVotes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getTotalMissed() {
        return totalMissed;
    }

    public void setTotalMissed(Integer totalMissed) {
        this.totalMissed = totalMissed;
    }

    public Long getLastConfirmedBlockNum() {
        return lastConfirmedBlockNum;
    }

    public void setLastConfirmedBlockNum(Long lastConfirmedBlockNum) {
        this.lastConfirmedBlockNum = lastConfirmedBlockNum;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"").append(id).append('\"');
        sb.append(", \"witnessAccount\":\"").append(witnessAccount).append('\"');
        sb.append(", \"last_aslot\":").append(last_aslot);
        sb.append(", \"signingKey\":\"").append(signingKey).append('\"');
        sb.append(", \"payVb\":\"").append(payVb).append('\"');
        sb.append(", \"voteId\":\"").append(voteId).append('\"');
        sb.append(", \"totalVotes\":\"").append(totalVotes).append('\"');
        sb.append(", \"url\":\"").append(url).append('\"');
        sb.append(", \"totalMissed\":").append(totalMissed);
        sb.append(", \"lastConfirmedBlockNum\":").append(lastConfirmedBlockNum);
        sb.append(", \"isValid\":\"").append(isValid).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

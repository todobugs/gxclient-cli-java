package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GxcOptions extends GxcEntity {
    
    @JsonProperty("memo_key")
    private String memoKey; 
    
    @JsonProperty("voting_account")
    private String  votingAccount;
    
    @JsonProperty("num_witness")
    private Integer numWitness;
    
    @JsonProperty("num_committee")
    private Integer numCommittee;
    
    @JsonProperty("votes")
    private List<String> votes;
    
    @JsonProperty("extensions")
    private List<String> extensions;

    public String getMemoKey() {
        return memoKey;
    }

    public void setMemoKey(String memoKey) {
        this.memoKey = memoKey;
    }

    public String getVotingAccount() {
        return votingAccount;
    }

    public void setVotingAccount(String votingAccount) {
        this.votingAccount = votingAccount;
    }

    public Integer getNumWitness() {
        return numWitness;
    }

    public void setNumWitness(Integer numWitness) {
        this.numWitness = numWitness;
    }

    public Integer getNumCommittee() {
        return numCommittee;
    }

    public void setNumCommittee(Integer numCommittee) {
        this.numCommittee = numCommittee;
    }

    public List<String> getVotes() {
        return votes;
    }

    public void setVotes(List<String> votes) {
        this.votes = votes;
    }

    public List<String> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<String> extensions) {
        this.extensions = extensions;
    }
    
    
}

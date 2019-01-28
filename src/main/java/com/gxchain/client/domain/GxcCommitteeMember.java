package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GxcCommitteeMember extends GxcEntity{

    @JsonProperty("id")
    private String id;

    @JsonProperty("committee_member_account")
    private String committeeMemberAccount;

    @JsonProperty("vote_id")
    private String voteId;

    @JsonProperty("total_votes")
    private String totalVotes;

    @JsonProperty("url")
    private String url;

    @JsonProperty("is_valid")
    private boolean isValid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommitteeMemberAccount() {
        return committeeMemberAccount;
    }

    public void setCommitteeMemberAccount(String committeeMemberAccount) {
        this.committeeMemberAccount = committeeMemberAccount;
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

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"").append(id).append('\"');
        sb.append(", \"committeeMemberAccount\":\"").append(committeeMemberAccount).append('\"');
        sb.append(", \"voteId\":\"").append(voteId).append('\"');
        sb.append(", \"totalVotes\":").append(totalVotes);
        sb.append(", \"url\":\"").append(url).append('\"');
        sb.append(", \"isValid\":").append(isValid);
        sb.append('}');
        return sb.toString();
    }
}

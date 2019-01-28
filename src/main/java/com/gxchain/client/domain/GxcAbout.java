package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcAbout extends GxcEntity {

    @JsonProperty("client_version")
    private String clientVersion;

    @JsonProperty("graphene_revision")
    private String grapheneRevision;

    @JsonProperty("graphene_revision_age")
    private String grapheneRevisionAge;

    @JsonProperty("fc_revision")
    private String fcRevision;

    @JsonProperty("fc_revision_age")
    private String fcRevisionAge;

    @JsonProperty("compile_date")
    private String compileDate;

    @JsonProperty("boost_version")
    private String boostVersion;

    @JsonProperty("openssl_version")
    private String opensslVersion;

    @JsonProperty("build")
    private String build;

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getGrapheneRevision() {
        return grapheneRevision;
    }

    public void setGrapheneRevision(String grapheneRevision) {
        this.grapheneRevision = grapheneRevision;
    }

    public String getGrapheneRevisionAge() {
        return grapheneRevisionAge;
    }

    public void setGrapheneRevisionAge(String grapheneRevisionAge) {
        this.grapheneRevisionAge = grapheneRevisionAge;
    }

    public String getFcRevision() {
        return fcRevision;
    }

    public void setFcRevision(String fcRevision) {
        this.fcRevision = fcRevision;
    }

    public String getFcRevisionAge() {
        return fcRevisionAge;
    }

    public void setFcRevisionAge(String fcRevisionAge) {
        this.fcRevisionAge = fcRevisionAge;
    }

    public String getCompileDate() {
        return compileDate;
    }

    public void setCompileDate(String compileDate) {
        this.compileDate = compileDate;
    }

    public String getBoostVersion() {
        return boostVersion;
    }

    public void setBoostVersion(String boostVersion) {
        this.boostVersion = boostVersion;
    }

    public String getOpensslVersion() {
        return opensslVersion;
    }

    public void setOpensslVersion(String opensslVersion) {
        this.opensslVersion = opensslVersion;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"clientVersion\":\"").append(clientVersion).append('\"');
        sb.append(", \"grapheneRevision\":\"").append(grapheneRevision).append('\"');
        sb.append(", \"grapheneRevisionAge\":\"").append(grapheneRevisionAge).append('\"');
        sb.append(", \"fcRevision\":\"").append(fcRevision).append('\"');
        sb.append(", \"fcRevisionAge\":\"").append(fcRevisionAge).append('\"');
        sb.append(", \"compileDate\":\"").append(compileDate).append('\"');
        sb.append(", \"boostVersion\":\"").append(boostVersion).append('\"');
        sb.append(", \"opensslVersion\":\"").append(opensslVersion).append('\"');
        sb.append(", \"build\":\"").append(build).append('\"');
        sb.append('}');
        return sb.toString();
    }

}

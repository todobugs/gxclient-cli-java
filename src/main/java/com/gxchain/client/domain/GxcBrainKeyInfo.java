package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcBrainKeyInfo extends GxcEntity {

    @JsonProperty("brain_priv_key")
    private String brainPrivKey;

    @JsonProperty("wif_priv_key")
    private String wifPrivKey;

    @JsonProperty("pub_key")
    private String pubKey;

    public String getBrainPrivKey() {
        return brainPrivKey;
    }

    public void setBrainPrivKey(String brainPrivKey) {
        this.brainPrivKey = brainPrivKey;
    }

    public String getWifPrivKey() {
        return wifPrivKey;
    }

    public void setWifPrivKey(String wifPrivKey) {
        this.wifPrivKey = wifPrivKey;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"brainPrivKey\":\"").append(brainPrivKey).append('\"');
        sb.append(", \"wifPrivKey\":\"").append(wifPrivKey).append('\"');
        sb.append(", \"pubKey\":\"").append(pubKey).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

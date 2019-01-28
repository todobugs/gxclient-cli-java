package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GxcOwner extends GxcEntity {
    
    @JsonProperty("weight_threshold")
    private Integer weightThreshold; 
    
    @JsonProperty("account_auths")
    private List<String> accountAuths;
    
    @JsonProperty("key_auths")
    private List<List<String>> keyAuths;
    
    @JsonProperty("address_auths")
    private List<String> addressAuths;

    public Integer getWeightThreshold() {
        return weightThreshold;
    }

    public void setWeightThreshold(Integer weightThreshold) {
        this.weightThreshold = weightThreshold;
    }

    public List<String> getAccountAuths() {
        return accountAuths;
    }

    public void setAccountAuths(List<String> accountAuths) {
        this.accountAuths = accountAuths;
    }

    public List<List<String>> getKeyAuths() {
        return keyAuths;
    }

    public void setKeyAuths(List<List<String>> keyAuths) {
        this.keyAuths = keyAuths;
    }

    public List<String> getAddressAuths() {
        return addressAuths;
    }

    public void setAddressAuths(List<String> addressAuths) {
        this.addressAuths = addressAuths;
    }
    
}

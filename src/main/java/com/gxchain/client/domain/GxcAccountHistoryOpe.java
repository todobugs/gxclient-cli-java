package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GxcAccountHistoryOpe extends GxcEntity {

    @JsonProperty("total_without_operations")
    private Integer totalWithoutOperations;
    
    private List<GxcAccountRecord> details;

    public Integer getTotalWithoutOperations() {
        return totalWithoutOperations;
    }

    public void setTotalWithoutOperations(Integer totalWithoutOperations) {
        this.totalWithoutOperations = totalWithoutOperations;
    }

    public List<GxcAccountRecord> getDetails() {
        return details;
    }

    public void setDetails(List<GxcAccountRecord> details) {
        this.details = details;
    }
    
}

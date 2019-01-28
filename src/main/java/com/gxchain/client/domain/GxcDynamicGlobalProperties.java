package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcDynamicGlobalProperties extends GxcEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("head_block_number")
    private String headBlockNumber;

    @JsonProperty("head_block_id")
    private String headBlockId;

    @JsonProperty("time")
    private String time;

    @JsonProperty("current_witness")
    private String currentWitness;

    @JsonProperty("next_maintenance_time")
    private String nextMaintenanceTime;

    @JsonProperty("last_budget_time")
    private String lastBudgetTime;

    @JsonProperty("witness_budget")
    private String witnessBudget;

    @JsonProperty("accounts_registered_this_interval")
    private String accountsRegisteredThisInterval;

    @JsonProperty("recently_missed_count")
    private String recentlyMissedCount;

    @JsonProperty("current_aslot")
    private String currentAslot;

    @JsonProperty("recent_slots_filled")
    private String recentSlotsFilled;

    @JsonProperty("dynamic_flags")
    private String dynamicFlags;

    @JsonProperty("last_irreversible_block_num")
    private String lastIrreversibleBlockNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeadBlockNumber() {
        return headBlockNumber;
    }

    public void setHeadBlockNumber(String headBlockNumber) {
        this.headBlockNumber = headBlockNumber;
    }

    public String getHeadBlockId() {
        return headBlockId;
    }

    public void setHeadBlockId(String headBlockId) {
        this.headBlockId = headBlockId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCurrentWitness() {
        return currentWitness;
    }

    public void setCurrentWitness(String currentWitness) {
        this.currentWitness = currentWitness;
    }

    public String getNextMaintenanceTime() {
        return nextMaintenanceTime;
    }

    public void setNextMaintenanceTime(String nextMaintenanceTime) {
        this.nextMaintenanceTime = nextMaintenanceTime;
    }

    public String getLastBudgetTime() {
        return lastBudgetTime;
    }

    public void setLastBudgetTime(String lastBudgetTime) {
        this.lastBudgetTime = lastBudgetTime;
    }

    public String getWitnessBudget() {
        return witnessBudget;
    }

    public void setWitnessBudget(String witnessBudget) {
        this.witnessBudget = witnessBudget;
    }

    public String getAccountsRegisteredThisInterval() {
        return accountsRegisteredThisInterval;
    }

    public void setAccountsRegisteredThisInterval(String accountsRegisteredThisInterval) {
        this.accountsRegisteredThisInterval = accountsRegisteredThisInterval;
    }

    public String getRecentlyMissedCount() {
        return recentlyMissedCount;
    }

    public void setRecentlyMissedCount(String recentlyMissedCount) {
        this.recentlyMissedCount = recentlyMissedCount;
    }

    public String getCurrentAslot() {
        return currentAslot;
    }

    public void setCurrentAslot(String currentAslot) {
        this.currentAslot = currentAslot;
    }

    public String getRecentSlotsFilled() {
        return recentSlotsFilled;
    }

    public void setRecentSlotsFilled(String recentSlotsFilled) {
        this.recentSlotsFilled = recentSlotsFilled;
    }

    public String getDynamicFlags() {
        return dynamicFlags;
    }

    public void setDynamicFlags(String dynamicFlags) {
        this.dynamicFlags = dynamicFlags;
    }

    public String getLastIrreversibleBlockNum() {
        return lastIrreversibleBlockNum;
    }

    public void setLastIrreversibleBlockNum(String lastIrreversibleBlockNum) {
        this.lastIrreversibleBlockNum = lastIrreversibleBlockNum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"").append(id).append('\"');
        sb.append(", \"headBlockNumber\":\"").append(headBlockNumber).append('\"');
        sb.append(", \"headBlockId\":\"").append(headBlockId).append('\"');
        sb.append(", \"time\":\"").append(time).append('\"');
        sb.append(", \"currentWitness\":\"").append(currentWitness).append('\"');
        sb.append(", \"nextMaintenanceTime\":\"").append(nextMaintenanceTime).append('\"');
        sb.append(", \"lastBudgetTime\":\"").append(lastBudgetTime).append('\"');
        sb.append(", \"witnessBudget\":\"").append(witnessBudget).append('\"');
        sb.append(", \"accountsRegisteredThisInterval\":\"").append(accountsRegisteredThisInterval).append('\"');
        sb.append(", \"recentlyMissedCount\":\"").append(recentlyMissedCount).append('\"');
        sb.append(", \"currentAslot\":\"").append(currentAslot).append('\"');
        sb.append(", \"recentSlotsFilled\":\"").append(recentSlotsFilled).append('\"');
        sb.append(", \"dynamicFlags\":\"").append(dynamicFlags).append('\"');
        sb.append(", \"lastIrreversibleBlockNum\":\"").append(lastIrreversibleBlockNum).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Title: GxcInfo
 * @Description: 当前区块同步情况信息
 * @Author: mingyi
 * @created 2018年4月17日 上午9:22:31
 */
@JsonIgnoreProperties(ignoreUnknown=true)

public class GxcInfo extends GxcEntity {
    
    @JsonProperty("head_block_num")
    private Integer headBlockNum;
    
    @JsonProperty("head_block_id")
    private String headBlockId;
    
    @JsonProperty("head_block_age")
    private String headBlockAge;
    
    @JsonProperty("next_maintenance_time")
    private String nextMaintenanceTime;
    
    @JsonProperty("chain_id")
    private String chainId;
    
    @JsonProperty("participation")
    private String participation;
    
    @JsonProperty("active_witnesses")
    private List<String> activeWitnesses;
    
    @JsonProperty("active_committee_members")
    private List<String> activeCommitteeMembers;

    public Integer getHeadBlockNum() {
        return headBlockNum;
    }

    public void setHeadBlockNum(Integer headBlockNum) {
        this.headBlockNum = headBlockNum;
    }

    public String getHeadBlockId() {
        return headBlockId;
    }

    public void setHeadBlockId(String headBlockId) {
        this.headBlockId = headBlockId;
    }

    public String getHeadBlockAge() {
        return headBlockAge;
    }

    public void setHeadBlockAge(String headBlockAge) {
        this.headBlockAge = headBlockAge;
    }

    public String getNextMaintenanceTime() {
        return nextMaintenanceTime;
    }

    public void setNextMaintenanceTime(String nextMaintenanceTime) {
        this.nextMaintenanceTime = nextMaintenanceTime;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public String getParticipation() {
        return participation;
    }

    public void setParticipation(String participation) {
        this.participation = participation;
    }

    public List<String> getActiveWitnesses() {
        return activeWitnesses;
    }

    public void setActiveWitnesses(List<String> activeWitnesses) {
        this.activeWitnesses = activeWitnesses;
    }

    public List<String> getActiveCommitteeMembers() {
        return activeCommitteeMembers;
    }

    public void setActiveCommitteeMembers(List<String> activeCommitteeMembers) {
        this.activeCommitteeMembers = activeCommitteeMembers;
    }
}

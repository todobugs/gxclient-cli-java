package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcGlobalProperties extends GxcEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("parameters")
    private JsonNode parameters ;

    @JsonProperty("block_interval")
    private Integer blockInterval;

    @JsonProperty("maintenance_interval")
    private Integer maintenanceInterval;

    @JsonProperty("maintenance_skip_slots")
    private Integer maintenanceSkipSlots;

    @JsonProperty("committee_proposal_review_period")
    private Integer committeeProposalReviewPeriod;

    @JsonProperty("maximum_transaction_size")
    private Integer maximumTransactionSize;

    @JsonProperty("maximum_block_size")
    private Long maximumBlockSize;

    @JsonProperty("maximum_time_until_expiration")
    private Integer maximumTimeUntilExpiration;

    @JsonProperty("maximum_proposal_lifetime")
    private Long maximumProposalLifetime;

    @JsonProperty("maximum_asset_whitelist_authorities")
    private Integer maximumAssetWhitelistAuthorities;

    @JsonProperty("maximum_asset_feed_publishers")
    private Integer maximumAssetFeedPublishers;

    @JsonProperty("maximum_witness_count")
    private Integer maximumWitnessCount;

    @JsonProperty("maximum_committee_count")
    private Integer maximumCommitteeCount;

    @JsonProperty("maximum_authority_membership")
    private Integer maximumAuthorityMembership;

    @JsonProperty("reserve_percent_of_fee")
    private Integer reservePercentOfFee;

    @JsonProperty("network_percent_of_fee")
    private Integer networkPercentOfFee;

    @JsonProperty("lifetime_referrer_percent_of_fee")
    private Integer lifetimeReferrerPercentOfFee;

    @JsonProperty("cashback_vesting_period_seconds")
    private Long cashbackVestingPeriodSeconds;

    @JsonProperty("cashback_vesting_threshold")
    private Long cashbackCestingThreshold;

    @JsonProperty("count_non_member_votes")
    private Boolean countNonMemberVotes;

    @JsonProperty("allow_non_member_whitelists")
    private Boolean allowNonMemberWhitelists;

    @JsonProperty("witness_pay_per_block")
    private Integer witnessPayPerBlock;

    @JsonProperty("worker_budget_per_day")
    private String workerBudgetPerDay;

    @JsonProperty("max_predicate_opcode")
    private Integer maxPredicateOpcode;

    @JsonProperty("fee_liquidation_threshold")
    private Long feeLiquidationThreshold;

    @JsonProperty("accounts_per_fee_scale")
    private Integer accountsPerFeeScale;

    @JsonProperty("account_fee_scale_bitshifts")
    private Integer accountFeeScaleBitshifts;

    @JsonProperty("max_authority_depth")
    private Integer maxAuthorityDepth;

    @JsonProperty("extensions")
    private JsonNode extensions;

    @JsonProperty("next_available_vote_id")
    private Integer nextAvailableVoteId;

    @JsonProperty("active_committee_members")
    private List<String> activeCommitteeMembers;

    @JsonProperty("active_witnesses")
    private List<String> activeWitnesses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JsonNode getParameters() {
        return parameters;
    }

    public void setParameters(JsonNode parameters) {
        this.parameters = parameters;
    }

    public Integer getBlockInterval() {
        return blockInterval;
    }

    public void setBlockInterval(Integer blockInterval) {
        this.blockInterval = blockInterval;
    }

    public Integer getMaintenanceInterval() {
        return maintenanceInterval;
    }

    public void setMaintenanceInterval(Integer maintenanceInterval) {
        this.maintenanceInterval = maintenanceInterval;
    }

    public Integer getMaintenanceSkipSlots() {
        return maintenanceSkipSlots;
    }

    public void setMaintenanceSkipSlots(Integer maintenanceSkipSlots) {
        this.maintenanceSkipSlots = maintenanceSkipSlots;
    }

    public Integer getCommitteeProposalReviewPeriod() {
        return committeeProposalReviewPeriod;
    }

    public void setCommitteeProposalReviewPeriod(Integer committeeProposalReviewPeriod) {
        this.committeeProposalReviewPeriod = committeeProposalReviewPeriod;
    }

    public Integer getMaximumTransactionSize() {
        return maximumTransactionSize;
    }

    public void setMaximumTransactionSize(Integer maximumTransactionSize) {
        this.maximumTransactionSize = maximumTransactionSize;
    }

    public Long getMaximumBlockSize() {
        return maximumBlockSize;
    }

    public void setMaximumBlockSize(Long maximumBlockSize) {
        this.maximumBlockSize = maximumBlockSize;
    }

    public Integer getMaximumTimeUntilExpiration() {
        return maximumTimeUntilExpiration;
    }

    public void setMaximumTimeUntilExpiration(Integer maximumTimeUntilExpiration) {
        this.maximumTimeUntilExpiration = maximumTimeUntilExpiration;
    }

    public Long getMaximumProposalLifetime() {
        return maximumProposalLifetime;
    }

    public void setMaximumProposalLifetime(Long maximumProposalLifetime) {
        this.maximumProposalLifetime = maximumProposalLifetime;
    }

    public Integer getMaximumAssetWhitelistAuthorities() {
        return maximumAssetWhitelistAuthorities;
    }

    public void setMaximumAssetWhitelistAuthorities(Integer maximumAssetWhitelistAuthorities) {
        this.maximumAssetWhitelistAuthorities = maximumAssetWhitelistAuthorities;
    }

    public Integer getMaximumAssetFeedPublishers() {
        return maximumAssetFeedPublishers;
    }

    public void setMaximumAssetFeedPublishers(Integer maximumAssetFeedPublishers) {
        this.maximumAssetFeedPublishers = maximumAssetFeedPublishers;
    }

    public Integer getMaximumWitnessCount() {
        return maximumWitnessCount;
    }

    public void setMaximumWitnessCount(Integer maximumWitnessCount) {
        this.maximumWitnessCount = maximumWitnessCount;
    }

    public Integer getMaximumCommitteeCount() {
        return maximumCommitteeCount;
    }

    public void setMaximumCommitteeCount(Integer maximumCommitteeCount) {
        this.maximumCommitteeCount = maximumCommitteeCount;
    }

    public Integer getMaximumAuthorityMembership() {
        return maximumAuthorityMembership;
    }

    public void setMaximumAuthorityMembership(Integer maximumAuthorityMembership) {
        this.maximumAuthorityMembership = maximumAuthorityMembership;
    }

    public Integer getReservePercentOfFee() {
        return reservePercentOfFee;
    }

    public void setReservePercentOfFee(Integer reservePercentOfFee) {
        this.reservePercentOfFee = reservePercentOfFee;
    }

    public Integer getNetworkPercentOfFee() {
        return networkPercentOfFee;
    }

    public void setNetworkPercentOfFee(Integer networkPercentOfFee) {
        this.networkPercentOfFee = networkPercentOfFee;
    }

    public Integer getLifetimeReferrerPercentOfFee() {
        return lifetimeReferrerPercentOfFee;
    }

    public void setLifetimeReferrerPercentOfFee(Integer lifetimeReferrerPercentOfFee) {
        this.lifetimeReferrerPercentOfFee = lifetimeReferrerPercentOfFee;
    }

    public Long getCashbackVestingPeriodSeconds() {
        return cashbackVestingPeriodSeconds;
    }

    public void setCashbackVestingPeriodSeconds(Long cashbackVestingPeriodSeconds) {
        this.cashbackVestingPeriodSeconds = cashbackVestingPeriodSeconds;
    }

    public Long getCashbackCestingThreshold() {
        return cashbackCestingThreshold;
    }

    public void setCashbackCestingThreshold(Long cashbackCestingThreshold) {
        this.cashbackCestingThreshold = cashbackCestingThreshold;
    }

    public Boolean getCountNonMemberVotes() {
        return countNonMemberVotes;
    }

    public void setCountNonMemberVotes(Boolean countNonMemberVotes) {
        this.countNonMemberVotes = countNonMemberVotes;
    }

    public Boolean getAllowNonMemberWhitelists() {
        return allowNonMemberWhitelists;
    }

    public void setAllowNonMemberWhitelists(Boolean allowNonMemberWhitelists) {
        this.allowNonMemberWhitelists = allowNonMemberWhitelists;
    }

    public Integer getWitnessPayPerBlock() {
        return witnessPayPerBlock;
    }

    public void setWitnessPayPerBlock(Integer witnessPayPerBlock) {
        this.witnessPayPerBlock = witnessPayPerBlock;
    }

    public String getWorkerBudgetPerDay() {
        return workerBudgetPerDay;
    }

    public void setWorkerBudgetPerDay(String workerBudgetPerDay) {
        this.workerBudgetPerDay = workerBudgetPerDay;
    }

    public Integer getMaxPredicateOpcode() {
        return maxPredicateOpcode;
    }

    public void setMaxPredicateOpcode(Integer maxPredicateOpcode) {
        this.maxPredicateOpcode = maxPredicateOpcode;
    }

    public Long getFeeLiquidationThreshold() {
        return feeLiquidationThreshold;
    }

    public void setFeeLiquidationThreshold(Long feeLiquidationThreshold) {
        this.feeLiquidationThreshold = feeLiquidationThreshold;
    }

    public Integer getAccountsPerFeeScale() {
        return accountsPerFeeScale;
    }

    public void setAccountsPerFeeScale(Integer accountsPerFeeScale) {
        this.accountsPerFeeScale = accountsPerFeeScale;
    }

    public Integer getAccountFeeScaleBitshifts() {
        return accountFeeScaleBitshifts;
    }

    public void setAccountFeeScaleBitshifts(Integer accountFeeScaleBitshifts) {
        this.accountFeeScaleBitshifts = accountFeeScaleBitshifts;
    }

    public Integer getMaxAuthorityDepth() {
        return maxAuthorityDepth;
    }

    public void setMaxAuthorityDepth(Integer maxAuthorityDepth) {
        this.maxAuthorityDepth = maxAuthorityDepth;
    }

    public JsonNode getExtensions() {
        return extensions;
    }

    public void setExtensions(JsonNode extensions) {
        this.extensions = extensions;
    }

    public Integer getNextAvailableVoteId() {
        return nextAvailableVoteId;
    }

    public void setNextAvailableVoteId(Integer nextAvailableVoteId) {
        this.nextAvailableVoteId = nextAvailableVoteId;
    }

    public List<String> getActiveCommitteeMembers() {
        return activeCommitteeMembers;
    }

    public void setActiveCommitteeMembers(List<String> activeCommitteeMembers) {
        this.activeCommitteeMembers = activeCommitteeMembers;
    }

    public List<String> getActiveWitnesses() {
        return activeWitnesses;
    }

    public void setActiveWitnesses(List<String> activeWitnesses) {
        this.activeWitnesses = activeWitnesses;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"").append(id).append('\"');
        sb.append(", \"parameters\":").append(parameters);
        sb.append(", \"blockInterval\":").append(blockInterval);
        sb.append(", \"maintenanceInterval\":").append(maintenanceInterval);
        sb.append(", \"maintenanceSkipSlots\":").append(maintenanceSkipSlots);
        sb.append(", \"committeeProposalReviewPeriod\":").append(committeeProposalReviewPeriod);
        sb.append(", \"maximumTransactionSize\":").append(maximumTransactionSize);
        sb.append(", \"maximumBlockSize\":").append(maximumBlockSize);
        sb.append(", \"maximumTimeUntilExpiration\":").append(maximumTimeUntilExpiration);
        sb.append(", \"maximumProposalLifetime\":").append(maximumProposalLifetime);
        sb.append(", \"maximumAssetWhitelistAuthorities\":").append(maximumAssetWhitelistAuthorities);
        sb.append(", \"maximumAssetFeedPublishers\":").append(maximumAssetFeedPublishers);
        sb.append(", \"maximumWitnessCount\":").append(maximumWitnessCount);
        sb.append(", \"maximumCommitteeCount\":").append(maximumCommitteeCount);
        sb.append(", \"maximumAuthorityMembership\":").append(maximumAuthorityMembership);
        sb.append(", \"reservePercentOfFee\":").append(reservePercentOfFee);
        sb.append(", \"networkPercentOfFee\":").append(networkPercentOfFee);
        sb.append(", \"lifetimeReferrerPercentOfFee\":").append(lifetimeReferrerPercentOfFee);
        sb.append(", \"cashbackVestingPeriodSeconds\":").append(cashbackVestingPeriodSeconds);
        sb.append(", \"cashbackCestingThreshold\":").append(cashbackCestingThreshold);
        sb.append(", \"countNonMemberVotes\":").append(countNonMemberVotes);
        sb.append(", \"allowNonMemberWhitelists\":").append(allowNonMemberWhitelists);
        sb.append(", \"witnessPayPerBlock\":").append(witnessPayPerBlock);
        sb.append(", \"workerBudgetPerDay\":\"").append(workerBudgetPerDay).append('\"');
        sb.append(", \"maxPredicateOpcode\":").append(maxPredicateOpcode);
        sb.append(", \"feeLiquidationThreshold\":").append(feeLiquidationThreshold);
        sb.append(", \"accountsPerFeeScale\":").append(accountsPerFeeScale);
        sb.append(", \"accountFeeScaleBitshifts\":").append(accountFeeScaleBitshifts);
        sb.append(", \"maxAuthorityDepth\":").append(maxAuthorityDepth);
        sb.append(", \"extensions\":").append(extensions);
        sb.append(", \"nextAvailableVoteId\":").append(nextAvailableVoteId);
        sb.append(", \"activeCommitteeMembers\":").append(activeCommitteeMembers);
        sb.append(", \"activeWitnesses\":").append(activeWitnesses);
        sb.append('}');
        return sb.toString();
    }
}

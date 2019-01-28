package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Title: GxcAccount
 * @Description: 公信股账户对象
 * @Author: mingyi
 * @created 2018年4月13日 上午11:25:56
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcAccount extends GxcEntity {
    
    /**
     * 账户id
     */
    @JsonProperty("id")
    private String accountId;
    
    @JsonProperty("membership_expiration_date")
    private String memberShipExpireDate;
    
    @JsonProperty("merchant_expiration_date")
    private String merchantExpireDate;
    
    @JsonProperty("datasource_expiration_date")
    private String datasourceExpireDate;
    
    @JsonProperty("data_transaction_member_expiration_date")
    private String transMemberExpireDate;
    
    @JsonProperty("registrar")
    private String registrar;
    
    @JsonProperty("referrer")
    private String referrer;
    
    @JsonProperty("lifetime_referrer")
    private String lifetimeReferrer;
    
    @JsonProperty("merchant_auth_referrer")
    private String merchantAuthReferrer;
    
    @JsonProperty("datasource_auth_referrer")
    private String datasourceAuthReferrer;
    
    @JsonProperty("network_fee_percentage")
    private String networkFeePercentage;
    
    @JsonProperty("lifetime_referrer_fee_percentage")
    private String lifetimeReferrerFeePercentage;
    
    @JsonProperty("referrer_rewards_percentage")
    private String referrerRewardsPercentage;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("owner")
    private GxcOwner owner;

    @JsonProperty("active")
    private GxcActive active;

    @JsonProperty("options")
    private GxcOptions options;
    
    @JsonProperty("statistics")
    private String statistics;
    
    @JsonProperty("whitelisting_accounts")
    private List<String> whitelistAccounts;
    
    @JsonProperty("blacklisting_accounts")
    private List<String> blacklistAccounts;
    
    @JsonProperty("whitelisted_accounts")
    private List<String> whitelistedAccounts;
    
    @JsonProperty("blacklisted_accounts")
    private List<String> blacklistedAccounts;
    
    @JsonProperty("cashback_vb")
    private String cashbackVb;
    
    @JsonProperty("owner_special_authority")
    private List<Object> ownerSpecialAuthority;
    
    @JsonProperty("active_special_authority")
    private List<Object> activeSpecialAuthority;
    
    @JsonProperty("top_n_control_flags")
    private Integer topNControlFlags;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMemberShipExpireDate() {
        return memberShipExpireDate;
    }

    public void setMemberShipExpireDate(String memberShipExpireDate) {
        this.memberShipExpireDate = memberShipExpireDate;
    }

    public String getMerchantExpireDate() {
        return merchantExpireDate;
    }

    public void setMerchantExpireDate(String merchantExpireDate) {
        this.merchantExpireDate = merchantExpireDate;
    }

    public String getDatasourceExpireDate() {
        return datasourceExpireDate;
    }

    public void setDatasourceExpireDate(String datasourceExpireDate) {
        this.datasourceExpireDate = datasourceExpireDate;
    }

    public String getTransMemberExpireDate() {
        return transMemberExpireDate;
    }

    public void setTransMemberExpireDate(String transMemberExpireDate) {
        this.transMemberExpireDate = transMemberExpireDate;
    }

    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getLifetimeReferrer() {
        return lifetimeReferrer;
    }

    public void setLifetimeReferrer(String lifetimeReferrer) {
        this.lifetimeReferrer = lifetimeReferrer;
    }

    public String getMerchantAuthReferrer() {
        return merchantAuthReferrer;
    }

    public void setMerchantAuthReferrer(String merchantAuthReferrer) {
        this.merchantAuthReferrer = merchantAuthReferrer;
    }

    public String getDatasourceAuthReferrer() {
        return datasourceAuthReferrer;
    }

    public void setDatasourceAuthReferrer(String datasourceAuthReferrer) {
        this.datasourceAuthReferrer = datasourceAuthReferrer;
    }

    public String getNetworkFeePercentage() {
        return networkFeePercentage;
    }

    public void setNetworkFeePercentage(String networkFeePercentage) {
        this.networkFeePercentage = networkFeePercentage;
    }

    public String getLifetimeReferrerFeePercentage() {
        return lifetimeReferrerFeePercentage;
    }

    public void setLifetimeReferrerFeePercentage(String lifetimeReferrerFeePercentage) {
        this.lifetimeReferrerFeePercentage = lifetimeReferrerFeePercentage;
    }

    public String getReferrerRewardsPercentage() {
        return referrerRewardsPercentage;
    }

    public void setReferrerRewardsPercentage(String referrerRewardsPercentage) {
        this.referrerRewardsPercentage = referrerRewardsPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GxcOwner getOwner() {
        return owner;
    }

    public void setOwner(GxcOwner owner) {
        this.owner = owner;
    }

    public GxcActive getActive() {
        return active;
    }

    public void setActive(GxcActive active) {
        this.active = active;
    }

    public GxcOptions getOptions() {
        return options;
    }

    public void setOptions(GxcOptions options) {
        this.options = options;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public List<String> getWhitelistAccounts() {
        return whitelistAccounts;
    }

    public void setWhitelistAccounts(List<String> whitelistAccounts) {
        this.whitelistAccounts = whitelistAccounts;
    }

    public List<String> getBlacklistAccounts() {
        return blacklistAccounts;
    }

    public void setBlacklistAccounts(List<String> blacklistAccounts) {
        this.blacklistAccounts = blacklistAccounts;
    }

    public List<String> getWhitelistedAccounts() {
        return whitelistedAccounts;
    }

    public void setWhitelistedAccounts(List<String> whitelistedAccounts) {
        this.whitelistedAccounts = whitelistedAccounts;
    }

    public List<String> getBlacklistedAccounts() {
        return blacklistedAccounts;
    }

    public void setBlacklistedAccounts(List<String> blacklistedAccounts) {
        this.blacklistedAccounts = blacklistedAccounts;
    }

    public String getCashbackVb() {
        return cashbackVb;
    }

    public void setCashbackVb(String cashbackVb) {
        this.cashbackVb = cashbackVb;
    }

    public List<Object> getOwnerSpecialAuthority() {
        return ownerSpecialAuthority;
    }

    public void setOwnerSpecialAuthority(List<Object> ownerSpecialAuthority) {
        this.ownerSpecialAuthority = ownerSpecialAuthority;
    }

    public List<Object> getActiveSpecialAuthority() {
        return activeSpecialAuthority;
    }

    public void setActiveSpecialAuthority(List<Object> activeSpecialAuthority) {
        this.activeSpecialAuthority = activeSpecialAuthority;
    }

    public Integer getTopNControlFlags() {
        return topNControlFlags;
    }

    public void setTopNControlFlags(Integer topNControlFlags) {
        this.topNControlFlags = topNControlFlags;
    }
    
}

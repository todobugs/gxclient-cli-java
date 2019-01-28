package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcCommissionPercent extends GxcEntity {

    @JsonProperty("league_data_market_commission_percent")
    private Integer leagueDataMarketCommissionPercent;

    @JsonProperty("free_data_market_commission_percent")
    private Integer freeDataMarketCommissionPercent;

    @JsonProperty("commission_account")
    private String commissionAccount;

    @JsonProperty("reserve_percent")
    private Integer reservePercent;

    public Integer getLeagueDataMarketCommissionPercent() {
        return leagueDataMarketCommissionPercent;
    }

    public void setLeagueDataMarketCommissionPercent(Integer leagueDataMarketCommissionPercent) {
        this.leagueDataMarketCommissionPercent = leagueDataMarketCommissionPercent;
    }

    public Integer getFreeDataMarketCommissionPercent() {
        return freeDataMarketCommissionPercent;
    }

    public void setFreeDataMarketCommissionPercent(Integer freeDataMarketCommissionPercent) {
        this.freeDataMarketCommissionPercent = freeDataMarketCommissionPercent;
    }

    public String getCommissionAccount() {
        return commissionAccount;
    }

    public void setCommissionAccount(String commissionAccount) {
        this.commissionAccount = commissionAccount;
    }

    public Integer getReservePercent() {
        return reservePercent;
    }

    public void setReservePercent(Integer reservePercent) {
        this.reservePercent = reservePercent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"leagueDataMarketCommissionPercent\":").append(leagueDataMarketCommissionPercent);
        sb.append(", \"freeDataMarketCommissionPercent\":").append(freeDataMarketCommissionPercent);
        sb.append(", \"commissionAccount\":\"").append(commissionAccount).append('\"');
        sb.append(", \"reservePercent\":").append(reservePercent);
        sb.append('}');
        return sb.toString();
    }
}

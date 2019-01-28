package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Title: GxcEntity
 * @Description: 公信股实体抽象类
 * @Author: mingyi
 * @created 2018年4月13日 上午11:25:35
 */

/**
 * @Title: GxcTransfer
 * @Description: 查询资产余额返回对象
 * @Author: mingyi
 * @created 2018年4月17日 下午1:56:39
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GxcAccountBalance extends GxcEntity {
    
    @JsonProperty("amount")
    private String amount;
    
    @JsonProperty("asset_id")
    private String assetId;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }
    
}
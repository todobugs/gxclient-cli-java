package com.gxchain.client.enums;

/**
 * @Description: 业务操作类型
 * @Author: mingyi
 * @Date: 2019-01-20 01:50
 * @package: com.gxchain.client.enums
 * @name: EnumGxcOperation
 */
public enum EnumGxcOperation {
    transfer(0,"transfer","转账","41f7b09f3ee1faa208d441ffb1859996fb7f98ba"),
    limit_order_create(1,"limit_order_create","",""),
    limit_order_cancel(2,"limit_order_cancel","",""),
    call_order_update(3,"call_order_update","",""),
    fill_order(4,"fill_order","",""),
    account_create(5,"account_create","创建账户","3fdc1612848dab696078b0f33e4c7b831c0d5678"),
    account_update(6,"account_update","更新账户","0f08d7f59225fede04ee6265d1df3a4329553cd0"),
    account_whitelist(7,"account_whitelist","",""),
    account_upgrade(8,"account_upgrade","升级账户","fb6ee86a4d317539d6eaef4ffe1d00264f524834"),
    account_transfer(9,"account_transfer","",""),
    asset_create(10,"asset_create","创建资产","c2d84b3ed803d5691d61728321eebed3882e1d72"),
    asset_update(11,"asset_update","更新资产","78d7d662b1eebc4fa70a273c03cfde9110b0e297"),
    asset_update_bitasset(12,"asset_update_bitasset","",""),
    asset_update_feed_producers(13,"asset_update_feed_producers","",""),
    asset_issue(14,"asset_issue","资产发行","f0d1dbf878ca076b8544c832ee6295003a3ca9cc"),
    asset_reserve(15,"asset_reserve","销毁资产","c48eb9b84f8cd0c4e70569e53260ac38ad20f2e2"),
    asset_fund_fee_pool(16,"asset_fund_fee_pool","",""),
    asset_settle(17,"asset_settle","",""),
    asset_global_settle(18,"asset_global_settle","",""),
    asset_publish_feed(19,"asset_publish_feed","",""),
    witness_create(20,"witness_create","创建公信节点","99271438fb19c7430c8846b01cffc1d1f9c6273c"),
    witness_update(21,"witness_update","更新公信节点","7bab7c36561185eed8cd664cb86279d69a9d9e48"),
    proposal_create(22,"proposal_create","创建提案","c48eb9b84f8cd0c4e70569e53260ac38ad20f2e2"),
    proposal_update(23,"proposal_update","更新提案","c9fae318c7643c3cd56a2f58e37136c9602b9c72"),
    proposal_delete(24,"proposal_delete","删除提案",""),
    withdraw_permission_create(25,"withdraw_permission_create","",""),
    withdraw_permission_update(26,"withdraw_permission_update","",""),
    withdraw_permission_claim(27,"withdraw_permission_claim","",""),
    withdraw_permission_delete(28,"withdraw_permission_delete","",""),
    committee_member_create(29,"committee_member_create","创建理事会成员","99271438fb19c7430c8846b01cffc1d1f9c6273c"),
    committee_member_update(30,"committee_member_update","",""),
    committee_member_update_global_parameters(31,"committee_member_update_global_parameters","",""),
    vesting_balance_create(32,"vesting_balance_create","",""),
    vesting_balance_withdraw(33,"vesting_balance_withdraw","提取解冻账户余额","799e5f3e39ef98bc9a0d128f8ea63dcfc250a6f3"),
    worker_create(34,"worker_create","",""),
    custom(35,"custom","自定义","51d237189ddbf2b6e0b45a3ac132bd0266931c00"),
    ASSERT(36,"assert","",""),
    balance_claim(37,"balance_claim","",""),
    override_transfer(38,"override_transfer","",""),
    transfer_to_blind(39,"transfer_to_blind","",""),
    blind_transfer(40,"blind_transfer","",""),
    transfer_from_blind(41,"transfer_from_blind","",""),
    asset_settle_cancel (42,"asset_settle_cancel","",""),
    asset_claim_fees(43,"asset_claim_fees","",""),
    fba_distribute(44,"fba_distribute","",""),
    account_upgrade_merchant(45,"account_upgrade_merchant","",""),
    account_upgrade_datasource(46,"account_upgrade_datasource","",""),
    stale_data_market_category_create(47,"stale_data_market_category_create","",""),
    stale_data_market_category_update(48,"stale_data_market_category_update","",""),
    stale_free_data_product_create(49,"stale_free_data_product_create","",""),
    stale_free_data_product_update(50,"stale_free_data_product_update","",""),
    stale_league_data_product_create(51,"stale_league_data_product_create","",""),
    stale_league_data_product_update(52,"stale_league_data_product_update","",""),
    stale_league_create(53,"stale_league_create","",""),
    stale_league_update(54,"stale_league_update","",""),
    data_transaction_create(55,"data_transaction_create","发起数据交易","d46b1edab862ea229f5b63df183ef32579aeaead"),
    data_transaction_update(56,"data_transaction_update","更新数据交易",""),
    data_transaction_pay(57,"data_transaction_pay","数据支付","77150aeae0d1547fa4b44a519dbfc07440f8f336"),
    account_upgrade_data_transaction_member(58,"account_upgrade_data_transaction_member","",""),
    data_transaction_datasource_upload(59,"data_transaction_datasource_upload","数据存证","ee83093ad4bd3e4029b014160d2857901561716e"),
    data_transaction_datasource_validate_error(60,"data_transaction_datasource_validate_error","",""),
    data_market_category_create(61,"data_market_category_create","",""),
    data_market_category_update(62,"data_market_category_update","",""),
    free_data_product_create(63,"free_data_product_create","",""),
    free_data_product_update(64,"free_data_product_update","",""),
    league_data_product_create(65,"league_data_product_create","",""),
    league_data_product_update(66,"league_data_product_update","",""),
    league_create(67,"league_create","",""),
    league_update(68,"league_update","",""),
    datasource_copyright_clear_operation(69,"datasource_copyright_clear_operation","",""),
    data_transaction_complain_operation(70,"data_transaction_complain_operation","",""),
    balance_lock_operation(71,"balance_lock_operation","",""),
    balance_unlock_operation(72,"balance_unlock_operation","",""),
    proxy_transfer_operation(73,"proxy_transfer_operation","代理转账","adf595894169ce2e084e0652bd0e436a880f6fd2"),
    contract_deploy_operation(74,"contract_deploy_operation","创建合约","1e467f6d9554d9fe5d08277a30ef67ce9e29816d"),
    contract_call_operation(75,"contract_call_operation","调用合约","a9441edee7d455ed9c05087b70c5d130430cf16f"),
    ;

    EnumGxcOperation(Integer sequence, String code, String desc , String txid){
        this.sequence = sequence;
        this.code = code;
        this.desc = desc;
        this.txid = txid;
    }


    /**
     * 操作业务序号
     */
    Integer sequence;

    /**
     * 操作代码
     */
    String code;

    /**
     * 操作描述
     */
    String desc;

    /**
     * 实例交易hash
     */
    String txid;
}

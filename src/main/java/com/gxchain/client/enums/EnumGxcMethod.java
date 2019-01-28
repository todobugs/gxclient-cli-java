package com.gxchain.client.enums;

/**
 * @Title: EnumCommand
 * @Description: 公信链节点客户端提供的接口
 * li,参看公信股官方地址：https://github.com/gxchain/Technical-Documents/blob/master/api/cli-wallet-api.md/li,
 * @Author: mingyi
 * @created 2018年4月2日 下午11:23:32
 */
public enum EnumGxcMethod {

    /**
     * 操作业务描述：节点版本信息
     * 参数：
     */
    about("about",0),

    /**
     * 操作业务描述：
     * 参数：transaction_handle_type,,op,
     */
    add_operation_to_builder_transaction("add_operation_to_builder_transaction",2),

    /**
     * 操作业务描述：
     * 参数：fee_paying_account, proposal_id, delta, broadcast,
     */
    approve_proposal("approve_proposal",4),

    /**
     * 操作业务描述：
     * 参数：
     */
    begin_builder_transaction("begin_builder_transaction",0),

    /**
     * 操作业务描述：
     * 参数：
     */
    blind_history("blind_history",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    blind_transfer("blind_transfer",5),

    /**
     * 操作业务描述：
     * 参数：tx,
     */
    broadcast_transaction("broadcast_transaction",1),

    /**
     * 操作业务描述：
     * 参数：account, contract, amount, method, arg, fee_asset_symbol, broadcast,
     */
    call_contract("call_contract",7),

    /**
     * 操作业务描述：
     * 参数：brain_key, account_name, registrar_account, referrer_account, broadcast,
     */
    create_account_with_brain_key("create_account_with_brain_key",5),

    /**
     * 操作业务描述：
     * 参数：issuer, symbol, precision, common, fee_asset_symbol, broadcast,
     */
    create_asset("create_asset",6),

    /**
     * 操作业务描述：
     * 参数：owner_account, url, broadcast,
     */
    create_committee_member("create_committee_member",3),

    /**
     * 操作业务描述：
     * 参数：category_name, data_market_type, order_num, issuer, broadcast,
     */
    create_data_market_category("create_data_market_category",5),

    /**
     * 操作业务描述：
     * 参数：product_name, brief_desc, datasource_account, category_id, price, icon, schema_contexts, parent_id, issuer, recommend, broadcast,
     */
    create_free_data_product("create_free_data_product",11),

    /**
     * 操作业务描述：
     * 参数：league_name,brief_desc,members,data_products,prices,category_id,icon,issuer,pocs_thresholds,fee_bases,pocs_weights,recommend,broadcast
     */
    create_league("create_league",13),

    /**
     * 操作业务描述：
     * 参数：product_name,brief_desc,category_id,refer_price,icon,schema_contexts,issuer,pocs_threshold,broadcast
     */
    create_league_data_product("create_league_data_product",9),

    /**
     * 操作业务描述：
     * 参数：owner_account,url,fee_asset_symbol,broadcast
     */
    create_witness("create_witness",4),

    /**
     * 操作业务描述：
     * 参数：account,id,data,fee_symbol,broadcast
     */
    custom("custom",5),

    /**
     * 操作业务描述：
     * 参数：request_id,requester,datasource,merchant_copyright_hash,datasource_copyright_hash,broadcast
     */
    data_transaction_complain_datasource("data_transaction_complain_datasource",6),

    /**
     * 操作业务描述：
     * 参数：request_id,product_id,league_id,version,params,requester,broadcast
     */
    data_transaction_create("data_transaction_create",7),

    /**
     * 操作业务描述：
     * 参数：request_id,requester,datasource,copyright_hash,broadcast
     */
    data_transaction_datasource_upload("data_transaction_datasource_upload",5),

    /**
     * 操作业务描述：
     * 参数：request_id,datasource,broadcast
     */
    data_transaction_datasource_validate_error("data_transaction_datasource_validate_error",3),

    /**
     * 操作业务描述：
     * 参数：request_id,new_status,new_requester,memo,broadcast
     */
    data_transaction_update("data_transaction_update",5),

    /**
     * 操作业务描述：
     * 参数：debug_wif_key,count
     */
    dbg_generate_blocks("dbg_generate_blocks",2),

    /**
     * 操作业务描述：
     * 参数：creator,symbol
     */
    dbg_make_uia("dbg_make_uia",2),

    /**
     * 操作业务描述：
     * 参数：src_filename,count
     */
    dbg_push_blocks("dbg_push_blocks",2),

    /**
     * 操作业务描述：
     * 参数：filename
     */
    dbg_stream_json_objects("dbg_stream_json_objects",1),

    /**
     * 操作业务描述：
     * 参数：update
     */
    dbg_update_object("dbg_update_object",1),

    /**
     * 操作业务描述：
     * 参数：name,account,vm_type,vm_version,contract_dir,fee_asset_symbol,broadcast
     */
    deploy_contract("deploy_contract",7),

    /**
     * 操作业务描述：
     * 参数：brain_key,number_of_desired_keys
     */
    derive_owner_keys_from_brain_key("derive_owner_keys_from_brain_key",2),

    /**
     * 操作业务描述：打印钱包拥有的所有公私钥对
     * 参数：account_prefix,number_of_accounts
     */
    dump_private_keys("dump_private_keys",0),

    /**
     * 操作业务描述：
     * 参数：account_prefix,number_of_transactions
     */
    flood_create_account("flood_create_account",2),

    /**
     * 操作业务描述：
     * 参数：account_prefix,number_of_transactions
     */
    flood_network("flood_network",2),

    /**
     * 操作业务描述：
     * 参数：from_account,account_prefix,number_of_accounts,number_of_loop
     */
    flood_transfer("flood_transfer",4),

    /**
     * 操作业务描述：
     * 参数：from,symbol,amount,broadcast
     */
    fund_asset_fee_pool("fund_asset_fee_pool",4),

    /**
     * 操作业务描述：查询指定帐户信息，参数可以为帐户名或者帐户id
     * 参数：account_name_or_id
     */
    get_account("get_account",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    get_account_count("get_account_count",0),

    /**
     * 操作业务描述：查询帐户最近的交易记录
     * 参数：account_name_or_id, limt_num,
     */
    get_account_history("get_account_history",2),

    /**
     * 操作业务描述：根据oeration_type查询帐户最近的交易记录，并且返回 operation对应的txid
     * 参数：account_name_or_id, [], start, limit_num,
     */
    get_account_history_by_operations("get_account_history_by_operations",4),

    /**
     * 根据账户名称获取账号id
     * 参数：account_name_or_id
     */
    get_account_id("get_account_id",1),

    /**
     * 操作业务描述：
     * 参数：asset_name_or_id
     */
    get_asset("get_asset",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    get_asset_count("get_asset_count",0),

    /**
     * 操作业务描述：获取指定区块信息
     * 参数：block_num
     */
    get_block("get_block",1),

    /**
     * 操作业务描述：
     * 参数：block_id
     */
    get_block_by_id("get_block_by_id",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    get_commission_percent("get_commission_percent",0),

    /**
     * 操作业务描述：
     * 参数：owner_account
     */
    get_committee_member("get_committee_member",1),

    /**
     * 操作业务描述：
     * 参数：contract
     */
    get_contract_tables("get_contract_tables",1),

    /**
     * 操作业务描述：
     * 参数：category_id
     */
    get_data_market_category("get_data_market_category",1),

    /**
     * 操作业务描述：
     * 参数：request_id
     */
    get_data_transaction_by_request_id("get_data_transaction_by_request_id",1),

    /**
     * 操作业务描述：
     * 参数：start,end
     */
    get_data_transaction_commission("get_data_transaction_commission",2),

    /**
     * 操作业务描述：
     * 参数：start,end
     */
    get_data_transaction_pay_fee("get_data_transaction_pay_fee",2),

    /**
     * 操作业务描述：
     * 参数：requester,start,end
     */
    get_data_transaction_pay_fees_by_requester("get_data_transaction_pay_fees_by_requester",3),

    /**
     * 操作业务描述：
     * 参数：start,end
     */
    get_data_transaction_product_costs("get_data_transaction_product_costs",2),

    /**
     * 操作业务描述：
     * 参数：product_id,start,end
     */
    get_data_transaction_product_costs_by_product_id("get_data_transaction_product_costs_by_product_id",2),

    /**
     * 操作业务描述：
     * 参数：requester,start,end
     */
    get_data_transaction_product_costs_by_requester("get_data_transaction_product_costs_by_requester",3),

    /**
     * 操作业务描述：
     * 参数：start,end
     */
    get_data_transaction_total_count("get_data_transaction_total_count",2),

    /**
     * 操作业务描述：
     * 参数：product_id,start,end
     */
    get_data_transaction_total_count_by_product_id("get_data_transaction_total_count_by_product_id",3),

    /**
     * 操作业务描述：
     * 参数：requester,start,end
     */
    get_data_transaction_total_count_by_requester("get_data_transaction_total_count_by_requester",3),

    /**
     * 操作业务描述：
     * 参数：
     */
    get_dynamic_global_properties("get_dynamic_global_properties",0),

    /**
     * 操作业务描述：
     * 参数：product_id
     */
    get_free_data_product("get_free_data_product",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    get_global_properties("get_global_properties",0),

    /**
     * 操作业务描述：
     * 参数：value
     */
    get_hash("get_hash",1),

    /**
     * 操作业务描述：查询帐户不可逆的交易记录, 支持翻页
     * 参数：account_name_or_id, start, limit, stop,
     */
    get_irreversible_account_history("get_irreversible_account_history",4),

    /**
     * 操作业务描述：
     * 参数：league_id
     */
    get_league("get_league",1),

    /**
     * 操作业务描述：
     * 参数：product_id
     */
    get_league_data_product("get_league_data_product",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    get_merchants_total_count("get_merchants_total_count",0),

    /**
     * 操作业务描述：
     * 参数：id
     */
    get_object("get_object",1),

    /**
     * 操作业务描述：
     * 参数：league_id,account,product_id
     */
    get_pocs_object("get_pocs_object",3),

    /**
     * 操作业务描述：根据用户的公钥信息查询私钥
     * 参数：pubkey
     */
    get_private_key("get_private_key",1),

    /**
     * 操作业务描述：
     * 参数：operation_type
     */
    get_prototype_operation("get_prototype_operation",1),

    /**
     * 操作业务描述：
     * 参数：wif_key
     */
    get_pub_key_from_wif_key("get_pub_key_from_wif_key",1),

    /**
     * 操作业务描述：查询帐户最近的交易记录, 支持翻页
     * 参数：account_name_or_id, start, limit, stop
     */
    get_relative_account_history("get_relative_account_history",4),

    /**
     * 操作业务描述：
     * 参数：contract,table,start,limit
     */
    get_table_rows("get_table_rows",4),

    /**
     * 操作业务描述：
     * 参数：
     */
    get_tps("get_tps",0),

    /**
     * 操作业务描述：
     * 参数：trx
     */
    get_transaction_id("get_transaction_id",1),

    /**
     * 操作业务描述：
     * 参数：account_name
     */
    get_vesting_balances("get_vesting_balances",1),

    /**
     * 操作业务描述：
     * 参数：owner_account
     */
    get_witness("get_witness",1),

    /**
     * 操作业务描述：帮助命令，此命令会返回钱包支持的所有接口
     * 参数：
     */
    help("help",0),

    /**
     * 操作业务描述：帮助命令，查看指定钱包命令的调用方法
     * 参数：method
     */
    gethelp("gethelp",1),

    /**
     * 操作业务描述：
     * 参数：filename,password,src_account_name,dest_account_name
     */
    import_account_keys("import_account_keys",4),

    /**
     * 操作业务描述：
     * 参数：filename,password
     */
    import_accounts("import_accounts",2),

    /**
     * 操作业务描述：
     * 参数：account_name_or_id,wif_keys,broadcast
     */
    import_balance("import_balance",3),

    /**
     * 操作业务描述：将帐户的私钥导入到钱包
     * 参数：account_name_or_id, true, wif_private_key
     */
    import_key("import_key",3),

    /**
     * 操作业务描述：获取区块链信息，可以用此命令查询最新区块高度
     * 参数：
     */
    info("info",0),

    /**
     * 操作业务描述：
     * 参数：name
     */
    is_account_registered("is_account_registered",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    is_locked("is_locked",0),

    /**
     * 操作业务描述：
     * 参数：
     */
    is_new("is_new",0),

    /**
     * 操作业务描述：
     * 参数：public_key
     */
    is_public_key_registered("is_public_key_registered",1),

    /**
     * 操作业务描述：
     * 参数：to_account,amount,symbol,memo,fee_asset_symbol,broadcast
     */
    issue_asset("issue_asset",6),

    /**
     * 操作业务描述：查询帐户余额
     * 参数：account_name_or_id
     */
    list_account_balances("list_account_balances",1),

    /**
     * 操作业务描述：
     * 参数：account_id_or_name
     */
    list_account_lock_balances("list_account_lock_balances",1),

    /**
     * 操作业务描述：
     * 参数：lowerbound,limit
     */
    list_accounts("list_accounts",2),

    /**
     * 操作业务描述：
     * 参数：lowerbound,limit
     */
    list_assets("list_assets",2),

    /**
     * 操作业务描述：
     * 参数：lowerbound,limit
     */
    list_committee_members("list_committee_members",2),

    /**
     * 操作业务描述：
     * 参数：market_type
     */
    list_data_market_categories("list_data_market_categories",1),

    /**
     * 操作业务描述：
     * 参数：start_date_time,end_date_time,limit
     */
    list_data_transaction_complain_datasources("list_data_transaction_complain_datasources",3),

    /**
     * 操作业务描述：
     * 参数：start_date_time,end_date_time,limit
     */
    list_data_transaction_complain_requesters("list_data_transaction_complain_requesters",3),

    /**
     * 操作业务描述：
     * 参数：requester,limit
     */
    list_data_transactions_by_requester("list_data_transactions_by_requester",2),

    /**
     * 操作业务描述：
     * 参数：data_market_category_id,offset,limit,order_by,keyword,show_all
     */
    list_free_data_products("list_free_data_products",6),


    /**
     * 操作业务描述：
     * 参数：data_market_category_id,offset,limit,order_by,keyword,show_all
     */
    list_league_data_products("list_league_data_products",6),

    /**
     * 操作业务描述：
     * 参数：data_market_category_id,offset,limit,order_by,keyword,show_all
     */
    list_leagues("list_leagues",6),

    /**
     * 操作业务描述：
     * 参数：
     */
    list_my_accounts("list_my_accounts",0),

    /**
     * 操作业务描述：
     * 参数：start_date_time,end_date_time,limit
     */
    list_second_hand_datasources("list_second_hand_datasources",3),

    /**
     * 操作业务描述：
     * 参数：start_date_time,end_date_time,datasource_account
     */
    list_total_second_hand_transaction_counts_by_datasource("list_total_second_hand_transaction_counts_by_datasource",3),

    /**
     * 操作业务描述：
     * 参数：lowerbound,limit
     */
    list_witnesses("list_witnesses",2),

    /**
     * 操作业务描述：
     * 参数：wallet_filename
     */
    load_wallet_file("load_wallet_file",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    lock("lock",0),

    /**
     * 操作业务描述：
     * 参数：nodes
     */
    network_add_nodes("network_add_nodes",1),

    /**
     * 操作业务描述：
     * 参数：
     */
    network_get_connected_peers("network_get_connected_peers",0),

    /**
     * 操作业务描述：
     * 参数：s
     */
    normalize_brain_key("normalize_brain_key",1),

    /**
     * 操作业务描述：
     * 参数：from,to,amount,request_id,broadcast
     */
    pay_data_transaction("pay_data_transaction",5),

    /**
     * 操作业务描述：
     * 参数：handle
     */
    preview_builder_transaction("preview_builder_transaction",1),

    /**
     * 操作业务描述：
     * 参数：handle,expiration,review_period_seconds,broadcast
     */
    propose_builder_transaction("propose_builder_transaction",4),

    /**
     * 操作业务描述：
     * 参数：handle,account_name_or_id,expiration,review_period_seconds,broadcast
     */
    propose_builder_transaction2("propose_builder_transaction2",5),

    /**
     * 操作业务描述：
     * 参数：proposing_account,category_id,new_category_name,new_order_num,new_status,broadcast
     */
    propose_data_market_category_update("propose_data_market_category_update",6),

    /**
     * 操作业务描述：
     * 参数：propose_account,datasource_account,broadcast
     */
    propose_deprecate_datasource("propose_deprecate_datasource",3),

    /**
     * 操作业务描述：
     * 参数：propose_account,merchant_account,broadcast
     */
    propose_deprecate_merchant("propose_deprecate_merchant",3),

    /**
     * 操作业务描述：
     * 参数：proposing_account,expiration_time,changed_values,broadcast
     */
    propose_fee_change("propose_fee_change",4),

    /**
     * 操作业务描述：
     * 参数：proposing_account,free_data_product_id,new_product_name,new_brief_desc,new_datasource_account,new_category_id,new_price,
     * new_icon,new_schema_contexts,new_parent_id,new_status,new_recommend,broadcast
     */
    propose_free_data_product_update("propose_free_data_product_update",13),

    /**
     * 操作业务描述：
     * 参数：proposing_account,expiration_time,changed_extensions,broadcast
     */
    propose_gpo_extensions_change("propose_gpo_extensions_change",4),

    /**
     * 操作业务描述：
     * 参数：proposing_account,league_data_product,new_product_name,new_brief_desc,new_category_id,new_refer_price,
     * new_icon,new_schema_contexts,new_status,new_pocs_threshold,broadcast
     */
    propose_league_data_product_update("propose_league_data_product_update",11),

    /**
     * 操作业务描述：
     * 参数：proposing_account,league_id,new_league_name,new_brief_desc,new_members,new_data_products,
     *      new_prices,new_category_id,new_icon,new_status,new_pocs_thresholds,new_fee_bases,new_pocs_weights,new_recommend,broadcast
     */
    propose_league_update("propose_league_update",15),

    /**
     * 操作业务描述：
     * 参数：proposing_account,expiration_time,changed_values,broadcast
     */
    propose_parameter_change("propose_parameter_change",4),

    /**
     * 操作业务描述：
     * 参数：
     */
    read_memo("read_memo",1),
    /**
     * 操作业务描述：
     * 参数：confirmation_receipt,opt_from,opt_memo
     */
    receive_blind_transfer("receive_blind_transfer",3),

    /**
     * 操作业务描述：
     * 参数：name,owner,active,registrar_account,referrer_account,referrer_percent,broadcast
     */
    register_account("register_account",7),

    /**
     * 操作业务描述：
     * 参数：name,owner,active,memo,registrar_account,referrer_account,referrer_percent,fee_asset_symbol,broadcast
     */
    register_account2("register_account2",9),

    /**
     * 操作业务描述：
     * 参数：handle
     */
    remove_builder_transaction("remove_builder_transaction",1),

    /**
     * 操作业务描述：
     * 参数：handle,operation_index,new_op
     */
    replace_operation_in_builder_transaction("replace_operation_in_builder_transaction",3),

    /**
     * 操作业务描述：
     * 参数：from,amount,symbol,fee_asset_symbol,broadcast
     */
    reserve_asset("reserve_asset",5),

    /**
     * 操作业务描述：
     * 参数：wallet_filename
     */
    save_wallet_file("save_wallet_file",1),

    /**
     * 操作业务描述：
     * 参数：param
     */
    serialize_proxy_transfer_params("serialize_proxy_transfer_params",1),

    /**
     * 操作业务描述：
     * 参数：tx
     */
    serialize_transaction("serialize_transaction",1),

    /**
     * 操作业务描述：
     * 参数：account_to_modify,account_to_modify,desired_number_of_committee_members,broadcast
     */
    set_desired_witness_and_committee_member_count("set_desired_witness_and_committee_member_count",4),

    /**
     * 操作业务描述：
     * 参数：handle,fee_asset
     */
    set_fees_on_builder_transaction("set_fees_on_builder_transaction",2),

    /**
     * 操作业务描述：对钱包设置一个新密码。首次启动钱包或者处于unlock状态，才能执行该操作
     * 参数：new_password,
     */
    set_password("set_password",1),

    /**
     * 操作业务描述：
     * 参数：account_to_modify,voting_account,broadcast
     */
    set_voting_proxy("set_voting_proxy",3),

    /**
     * 操作业务描述：
     * 参数：transaction_handle,broadcast
     */
    sign_builder_transaction("sign_builder_transaction",2),

    /**
     * 操作业务描述：
     * 参数：from,to,memo
     */
    sign_memo("sign_memo",3),

    /**
     * 操作业务描述：
     * 参数：wif_key,raw_string
     */
    sign_string("sign_string",2),

    /**
     * 操作业务描述：
     * 参数：tx,broadcast
     */
    sign_transaction("sign_transaction",2),

    /**
     * 操作业务描述：
     * 参数：
     */
    suggest_brain_key("suggest_brain_key",0),

    /**
     * 操作业务描述：转帐操作
     * 参数：from_account, to_account, amount, gxs, memo, true,
     */
    transfer("transfer",6),

    /**
     * 操作业务描述：转帐操作，参数同transfer, 返回结果中包含当前交易的id
     * 参数：from_account, to_account, amount, gxs, memo, true,
     */
    transfer2("transfer2",5),

    /**
     * 操作业务描述：
     * 参数：from,to,amount,asset_symbol,memo,fee_asset_symbol,broadcast
     */
    transfer3("transfer3",7),

    /**
     * 操作业务描述：
     * 参数：from_blind_account_key_or_label,to_account_id_or_name,amount,asset_symbol,broadcast
     */
    transfer_from_blind("transfer_from_blind",5),

    /**
     * 操作业务描述：
     * 参数：from_account,to_account,times
     */
    transfer_test("transfer_test",3),

    /**
     * 操作业务描述：
     * 参数：from_account_id_or_name,asset_symbol,to_amounts,broadcast
     */
    transfer_to_blind("transfer_to_blind",4),

    /**
     * 操作业务描述：解锁钱包
     * 参数：my_password,
     */
    unlock("unlock",1),

    /**
     * 操作业务描述：
     * 参数：account,type,weight_threshold,account_auths,account_weights,fee_symbol,broadcast
     */
    update_account_multisig("update_account_multisig",7),

    /**
     * 操作业务描述：
     * 参数：account,type,weight_threshold,key_auths,key_weights,fee_symbol,broadcast
     */
    update_account_multisig_keys("update_account_multisig_keys",7),

    /**
     * 操作业务描述：
     * 参数：symbol,new_issuer,new_options,fee_asset_symbol,broadcast
     */
    update_asset("update_asset",5),

    /**
     * 操作业务描述：
     * 参数：contract,new_owner,contract_dir,fee_asset_symbol,broadcast
     */
    update_contract("update_contract",5),

    /**
     * 操作业务描述：
     * 参数：witness_name,url,block_signing_key,fee_asset_symbol,broadcast
     */
    update_witness("update_witness",5),

    /**
     * 操作业务描述：
     * 参数：name,asset_symbol,broadcast
     */
    upgrade_account("upgrade_account",3),

    /**
     * 操作业务描述：
     * 参数：name,auth_referrer,broadcast
     */
    upgrade_account_datasource("upgrade_account_datasource",3),

    /**
     * 操作业务描述：
     * 参数：name,auth_referrer,broadcast
     */
    upgrade_account_merchant("upgrade_account_merchant",3),

    /**
     * 操作业务描述：
     * 参数：name,auth_referrer,broadcast
     */
    upgrade_data_transaction_member("upgrade_data_transaction_member",3),

    /**
     * 操作业务描述：
     * 参数：param,pub_key
     */
    verify_proxy_transfer_signature("verify_proxy_transfer_signature",2),

    /**
     * 操作业务描述：
     * 参数：trx,pub_key
     */
    verify_transaction_signature("verify_transaction_signature",2),

    /**
     * 操作业务描述：
     * 参数：voting_account,committee_member,approve,broadcast
     */
    vote_for_committee_member("vote_for_committee_member",4),

    /**
     * 操作业务描述：
     * 参数：voting_account,account_names,broadcast
     */
    vote_for_trust_nodes("vote_for_trust_nodes",3),

    /**
     * 操作业务描述：
     * 参数：voting_account,witness,approve,broadcast
     */
    vote_for_witness("vote_for_witness",4),

    /**
     * 操作业务描述：
     * 参数：authorizing_account,account_to_list,new_listing_status,broadcast
     */
    whitelist_account("whitelist_account",4),

    /**
     * 操作业务描述：
     * 参数：account_name,fee_asset_symbol,broadcast
     */
    withdraw_trust_node_pledge("withdraw_trust_node_pledge",3),

    /**
     * 操作业务描述：
     * 参数：witness_name,amount,asset_symbol,fee_asset_symbol,broadcast
     */
    withdraw_vesting("withdraw_vesting",5),
    ;

    EnumGxcMethod(String name, Integer paramNum) {
        this.name = name;
        this.paramNum = paramNum;
    }

    /**
     * 方法名
     */
    private final String name;
    
    /**
     * 参数数量
     */
    private final int paramNum;
    

    public String getName() {
        return name;
    }

    public int getParamNum() {
        return paramNum;
    }

}

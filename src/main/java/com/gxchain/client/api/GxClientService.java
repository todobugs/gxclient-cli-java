package com.gxchain.client.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.gxchain.client.domain.*;

import java.util.List;
import java.util.Map;

/**
 * @Title: GxClientService
 * @Description: 公信股操作命令接口 各方法描述
 * 参看：https://github.com/gxchain/gxb-core/blob/a549a1b3e083539fd591911fbf32cb88a5e7707c/libraries/wallet/include/graphene/wallet/wallet.hpp
 * @Author: mingyi
 * @created 2018年4月13日 上午9:14:53
 */
public interface GxClientService {

    /**
     * @Description: 版本信息等
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 03:13
     */
    GxcAbout about();

//    void add_operation_to_builder_transaction(transaction_handle_type transaction_handle, const operation & op);
//    GxcTransaction approve_proposal(String fee_paying_account, String proposal_id, const approval_delta & delta, Boolean broadcast);
//    Integer begin_builder_transaction();//开始构建交易，返回的是不断增加的数字
//    vector<blind_receipt> blind_history(String key_or_account);隐私转账
//    blind_confirmation blind_transfer(String from_key_or_label, String to_key_or_label, String amount, String symbol, Boolean broadcast);
//    pair<transaction_id_type, GxcTransaction> broadcast_transaction(GxcTransaction tx);

    /**
     * @Description: 调用合约
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 22:56
     */
    GxcTransaction call_contract(String account, String contract, GxcAmount amount, String method, String arg, String fee_asset_symbol, Boolean broadcast);

    GxcTransaction create_account_with_brain_key(String brain_key, String account_name, String registrar_account, String referrer_account, Boolean broadcast);

//    GxcTransaction create_asset(String issuer, String symbol, Integer precision, asset_options common, String fee_asset_symbol, Boolean broadcast);

    /**
      * @Description: 创建委员会成员
     *  create_committee_member my-1 www.mingyi.com false
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:45
      */
    GxcTransaction create_committee_member(String owner_account, String url, Boolean broadcast);

//    GxcTransaction create_data_market_category(String category_name, Integer data_market_type, Long order_num, String issuer, Boolean broadcast);
//    GxcTransaction create_free_data_product(String product_name, String brief_desc, String datasource_account, String category_id, double price, String icon, vector<schema_context_object> schema_contexts, String parent_id, String issuer, Boolean recommend, Boolean broadcast);
//    GxcTransaction create_league(String league_name, String brief_desc, vector<account_id_type> members, vector<league_data_product_id_type> data_products, vector<Double> prices, String category_id, String icon, String issuer, vector<Double> pocs_thresholds, vector<Double> fee_bases, vector<Double> pocs_weights, Boolean recommend, Boolean broadcast);
//    GxcTransaction create_league_data_product(String product_name, String brief_desc, String category_id, double refer_price, String icon, vector<schema_context_object> schema_contexts, String issuer, Double pocs_threshold, Boolean broadcast);

    /**
      * @Description: 创建节点
     * create_witness my-1 www.mingyi.com GXC false
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:47
      */
    GxcTransaction create_witness(String owner_account, String url, String fee_asset_symbol, Boolean broadcast);

    /**
      * @Description:
      * custom my-1 1 mmmmmyyyyy GXC false
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:47
      */
    GxcTransaction custom(String account, Integer id, String data, String fee_symbol, Boolean broadcast);

//    GxcTransaction data_transaction_complain_datasource(String request_id, account_id_type requester, account_id_type datasource, String merchant_copyright_hash, String datasource_copyright_hash, Boolean broadcast);
//    GxcTransaction data_transaction_create(String request_id, object_id_type product_id, fc::optional<league_id_type> league_id, String version, String params, String requester, Boolean broadcast);
//    GxcTransaction data_transaction_datasource_upload(String request_id, String requester, String datasource, fc::optional<String> copyright_hash, Boolean broadcast);
//    GxcTransaction data_transaction_datasource_validate_error(String request_id, String datasource, Boolean broadcast);
//    GxcTransaction data_transaction_update(String request_id, Integer new_status, String new_requester, fc::optional<String> memo, Boolean broadcast);
//    void dbg_generate_blocks(String debug_wif_key, Long count);
//    void dbg_make_uia(String creator, String symbol);
//    void dbg_push_blocks(String src_filename, Long count);
//    void dbg_stream_json_objects(String filename);
//    void dbg_update_object(fc::variant_object update);
//    GxcTransaction deploy_contract(String name, String account, String vm_type, String vm_version, String contract_dir, String fee_asset_symbol, Boolean broadcast);
//    vector<brain_key_info> derive_owner_keys_from_brain_key(String brain_key, int number_of_desired_keys);

    /**
     * @Description: 打印钱包拥有的所有公私钥对
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:23:18
     */
    JsonNode dump_private_keys() ;

//    void flood_create_account(String account_prefix, Long number_of_accounts); 隐私创建账户
//    void flood_network(String account_prefix, Long number_of_transactions); 隐私网络
//    void flood_transfer(String from_account, String account_prefix, Long number_of_accounts, Long number_of_loop); 隐私转账

    GxcTransaction fund_asset_fee_pool(String from, String symbol, String amount, Boolean broadcast);
    /**
     * @Description: 查询指定帐户信息，参数为帐户名或者帐户id
     * @param accountNameOrId 账户名或账户id
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:23:50
     */
    GxcAccount get_account(String accountNameOrId) ;

    Integer get_account_count();
    /**
     * @Description: 查询帐户最近的交易记录
     * @param accountNameOrId 账户名或账户id
     * @param limitNum
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:40:07
     */
    List<GxcAccountRecord> get_account_history(String accountNameOrId, Integer limitNum) ;

    /**
     * @Description: 根据oeration_type查询帐户最近的交易记录，并且返回 operation对应的txID
     * @param accountNameOrId  账户名或账户id
     * @param operateType
     * @param start
     * @param limitNum
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:45:38
     */
    GxcAccountHistoryOpe get_account_history_by_operations(String accountNameOrId, List<Integer> operateType, Integer start,Integer limitNum);


    /**
     * @Description: 根据账户名称或者账户id查询账户id（本程序侧重根据名称查询id）
     * @param accountNameOrId 账户名或账户id
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:23:50
     */
    String get_account_id(String accountNameOrId) ;

    /**
     * @Description: 根据资产id或名称获取资产信息，例如：GXC或1.3.1
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 09:56
     */
    GxcAsset get_asset(String asset_name_or_id);

    /**
     * @Description: 获取当前链上资产数量
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 09:57
     */
    Integer get_asset_count();

    /**
     * @Description: 获取指定区块信息
     * @param blockNum 区块号
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:46:15
     */
    GxcBlock get_block(Long blockNum) ;

    /**
     * @Description: 根据区块hash获取区块信息
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 09:59
     */
    GxcBlock get_block_by_id(String block_id);

    /**
     * @Description: 获取佣金比例信息
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 10:02
     */
    GxcCommissionPercent get_commission_percent();

    /**
     * @Description: 根据账户名获取委员会成员信息
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 10:08
     */
    GxcCommitteeMember get_committee_member(String owner_account);

    /**
     * @Description: 获取合约中的表名称
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 10:16
     */
    List<String> get_contract_tables(String contract);

//    data_market_category_object get_data_market_category(String category_id);
//    optional<data_transaction_object> get_data_transaction_by_request_id(String request_id);
//    Double get_data_transaction_commission(fc::time_point_sec start, fc::time_point_sec end);
//    Double get_data_transaction_pay_fee(fc::time_point_sec start, fc::time_point_sec end);
//    Double get_data_transaction_pay_fees_by_requester(String requester, fc::time_point_sec start, fc::time_point_sec end);
//    Double get_data_transaction_product_costs(fc::time_point_sec start, fc::time_point_sec end);
//    Double get_data_transaction_product_costs_by_product_id(String product_id, fc::time_point_sec start, fc::time_point_sec end);
//    Double get_data_transaction_product_costs_by_requester(String requester, fc::time_point_sec start, fc::time_point_sec end);
//    Double get_data_transaction_total_count(fc::time_point_sec start, fc::time_point_sec end);
//    Double get_data_transaction_total_count_by_product_id(String product_id, fc::time_point_sec start, fc::time_point_sec end);
//    Double get_data_transaction_total_count_by_requester(String requester, fc::time_point_sec start, fc::time_point_sec end);

    /**
     * @Description: 获取全局动态属性
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 10:20
     */
    GxcDynamicGlobalProperties get_dynamic_global_properties();

//    free_data_product_object get_free_data_product(String product_id);

    /**
     * @Description: 获取全局属性
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 22:57
     */
    GxcGlobalProperties get_global_properties();

    /**
     * @Description: 根据传入的值获取sha256的hash字串
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 10:17
     */
    String get_hash(String value);

    /**
     * @Description: 根据oeration_type查询帐户不可逆的交易记录，并且返回 operation对应的txID
     * @param accountNameOrId  账户名或账户id
     * @param operateType
     * @param start
     * @param limitNum
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:45:38
     */
    GxcAccountHistoryOpe get_irreversible_account_history(String accountNameOrId, List<Integer> operateType, Integer start, Integer limitNum);

//    league_object get_league(String league_id);
//    league_data_product_object get_league_data_product(String product_id);

    /**
     * @Description: 获取商户总数量
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 23:44
     */
    Integer get_merchants_total_count();

    /**
     * @Description: 根据对象id查询信息，比如：资产id：1.3.1；合约id：1.2.1102979，账户id：1.2.737551等（因对象结构类型不同，直接返回String，后续根据业务需要返回对应的对象）
     * 参看：https://docs.gxchain.org/zh/guide/#_2-gxchain%E4%B8%8A%E7%9A%84%E5%AF%B9%E8%B1%A1
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 23:40
     */
    String get_object(String id);

//    optional<pocs_object> get_pocs_object(String league_id, String account, String product_id);
    /**
     * @Description: 根据公钥信息查询私钥
     * @param publicKey
     * @return
     * @author mingyi
     * @created 2018年4月17日 下午6:00:30
     */
    String get_private_key(String publicKey) ;

    /**
     * @Description: 获取业务操作原型信息：参看https://github.com/gxchain/gxb-core/blob/61bdcb3fec8f0ef4d21c656d7c299cf1d19cede1/libraries/chain/include/graphene/chain/protocol/operations.hpp
     * 例如：get_prototype_operation transfer_operation
     * 因每个操作类型结果都不一样，本接口直接返回String，后续执行补充完善
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 23:28
     */
    String get_prototype_operation(String operation_type);

    /**
     * @Description: 根据wif_key获取对应的公玥信息
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 23:32
     */
    String get_pub_key_from_wif_key(String wif_key);
    /**
     * @Description: 查询帐户最近的交易记录, 支持翻页
     * @param accountNameOrId  账户名或账户id
     * @param start  起始序号(1为最早的一笔交易，交易越新，序号越大）
     * @param stop 结束序号
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:39:36
     */
    List<GxcAccountRecord> get_relative_account_history(String accountNameOrId, Integer start, Integer limitNum, Integer stop);

    /**
     * @Description: 获取合约中表的数据列表
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 14:47
     */
    JsonNode get_table_rows(String contract, String table, Integer start, Integer limit);
//    void get_tps();

    /**
     * @Description: convert a JSON transaction to its transactin ID
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 23:56
     */
    String get_transaction_id(GxcTransaction trx);

    /**
     * @Description: 根据账户名获取归属其账户下的余额
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 14:49
     */
    List<GxcVestingBalance> get_vesting_balances(String account_name);

    /**
     * @Description: 获取见证账户信息（例如lendchain）
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 14:38
     */
    GxcWitness get_witness(String owner_account);

    /**
     * @Description: 帮助命令，查看指定钱包命令的调用方法（直接返回字符串，不做格式化处理）
     * @param command  查询的命令行接口
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:46:40
     */
    String gethelp(String command) ;

    /**
     * @Description: 帮助命令，此命令会返回钱包支持的所有接口（直接返回字符串，不做格式化处理）
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:46:31
     */
    String help() ;


    Boolean import_account_keys(String filename, String password, String src_account_name, String dest_account_name);

//    map<String, Boolean> import_accounts(String filename, String password);
//    vector<GxcTransaction> import_balance(String account_name_or_id, String wif_keys, Boolean broadcast);
    /**
     * @Description: 将帐户的私钥导入到钱包
     * @param accountNameOrId 帐户名或者帐户id
     * @param wifPrivateKey 帐户私钥
     * @param flag true表示执行
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:22:23
     */
    Boolean import_key(String accountNameOrId, String wifPrivateKey, Boolean flag) ;

    /**
     * @Description: 获取区块链信息，可以用此命令查询最新区块高度（返回信息对象）
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:46:24
     */
    GxcInfo info() ;

    Boolean is_account_registered(String name);
    /**
     * @Description: 返回钱包解锁状态
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月16日 下午11:41:13
     */
    Boolean is_locked() ;

    /**
     * @Description: 判断是否为新的cli
     * @Method:
     * @Param:
     * @return: true or false
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:21
     */
    Boolean is_new();

    /**
     * @Description: 判断是否为注册的公钥信息（传入正确的pub_key返回true，否则返回false ；例如：GXC8gJPnEcq9sc3yNp5iK48DUvDUhxQghXeyXqYv2MpPSrDwS5fRh 返回true，lendchain 返回false）
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:23
     */
    Boolean is_public_key_registered(String public_key);


    GxcTransaction issue_asset(String to_account, String amount, String symbol, String memo, String fee_asset_symbol, Boolean broadcast);

    /**
     * @Description: 查询帐户余额(列表展示)
     * @param accountNameOrId 账户名或账户id
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:36:10
     */
    List<GxcAccountBalance> list_account_balances(String accountNameOrId) ;

    /**
     * @Description: 根据账号id或者account查询锁定的余额信息
     * @Method:
     * @Param:
     * @return: 返回list<String> 例如：0 GXC
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 14:39
     */
    List<String> list_account_lock_balances(String account_id_or_name);

    /**
     * @Description: 查询链上所有账号列表信息（内嵌的List<String> 共两个值，分别为账户名，账户id）
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:01
     */
    JsonNode list_accounts(Long lowerbound, Long limit);

    /**
     * @Description: 查询发行的资产信息
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 14:44
     */
    List<GxcAsset> list_assets(Long lowerbound, Long limit);

    /**
     * @Description: 获取委员会成员信息（内嵌的List<String> 分别为账户名，委员会id）
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:08
     */
    JsonNode list_committee_members(Long lowerbound, Long limit);

    //market_type 只有1、2
//    List<Object> list_data_market_categories(Long market_type);

//    map<account_id_type, Double> list_data_transaction_complain_datasources(fc::time_point_sec start_date_time, fc::time_point_sec end_date_time, Integer limit);
//    map<account_id_type, Double> list_data_transaction_complain_requesters(fc::time_point_sec start_date_time, fc::time_point_sec end_date_time, Integer limit);
//    data_transaction_search_results_object list_data_transactions_by_requester(String requester, Long limit);
//    free_data_product_search_results_object list_free_data_products(String data_market_category_id, Long offset, Long limit, String order_by, String keyword, Boolean show_all);
//    league_data_product_search_results_object list_league_data_products(String data_market_category_id, Long offset, Long limit, String order_by, String keyword, Boolean show_all);
//    league_search_results_object list_leagues(String data_market_category_id, Long offset, Long limit, String order_by, String keyword, Boolean show_all);

    /**
      * @Description: 查询当前节点客户端的账户信息
      * @Method:
      * @Param: 
      * @return: 
      * @throws: 
      * @Author: mingyi
      * @Date:   2019-01-22 20:38
      */
    List<GxcAccount> list_my_accounts();

//    map<account_id_type, Double> list_second_hand_datasources(time_point_sec start_date_time, time_point_sec end_date_time, Long limit);
//    Long list_total_second_hand_transaction_counts_by_datasource(fc::time_point_sec start_date_time, fc::time_point_sec end_date_time, String datasource_account);

    /**
     * @Description: 获取委员会成员信息（内嵌的List<String> 分别为账户名，见证节点id）
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:08
     */
    JsonNode list_witnesses(Long lowerbound, Long limit);

    /**
      * @Description: 加载wallet_file，可参看save_wallet_file中保存的，如果导入成功则返回true，失败返回false
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:32
      */
    Boolean load_wallet_file(String wallet_filename);

    /**
     * @Description: 钱包加锁
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:20:33
     */
    String lock() ;

//    void network_add_nodes(const vector<String> & nodes);
//    vector<variant> network_get_connected_peers();

    /**
      * @Description: 将字符串中的小写字母转成大写并返回
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 11:17
      */
    String normalize_brain_key(String s);

    GxcTransaction pay_data_transaction(String from, String to, GxcAsset amount, String request_id, Boolean broadcast);

//    transaction preview_builder_transaction(transaction_handle_type handle);
//    GxcTransaction propose_builder_transaction(transaction_handle_type handle, time_point_sec expiration, Long review_period_seconds, Boolean broadcast);
//    GxcTransaction propose_builder_transaction2(transaction_handle_type handle, String account_name_or_id, time_point_sec expiration, Long review_period_seconds, Boolean broadcast);
//    GxcTransaction propose_data_market_category_update(String proposing_account, String category_id, String new_category_name, Long new_order_num, Integer new_status, Boolean broadcast);
//    GxcTransaction propose_deprecate_datasource(String propose_account, String datasource_account, Boolean broadcast);
//    GxcTransaction propose_deprecate_merchant(String propose_account, String merchant_account, Boolean broadcast);
//    GxcTransaction propose_fee_change(String proposing_account, fc::time_point_sec expiration_time, const variant_object & changed_values, Boolean broadcast);
//    GxcTransaction propose_free_data_product_update(String proposing_account, String free_data_product_id, String new_product_name, String new_brief_desc, String new_datasource_account, String new_category_id, double new_price, String new_icon, vector<schema_context_object> new_schema_contexts, String new_parent_id, Integer new_status, Boolean new_recommend, Boolean broadcast);
//    GxcTransaction propose_gpo_extensions_change(String proposing_account, fc::time_point_sec expiration_time, const variant_object & changed_extensions, Boolean broadcast);
//    GxcTransaction propose_league_data_product_update(String proposing_account, String league_data_product, String new_product_name, String new_brief_desc, String new_category_id, double new_refer_price, String new_icon, vector<schema_context_object> new_schema_contexts, Integer new_status, Double new_pocs_threshold, Boolean broadcast);
//    GxcTransaction propose_league_update(String proposing_account, String league_id, String new_league_name, String new_brief_desc, vector<account_id_type> new_members, vector<league_data_product_id_type> new_data_products, vector<Double> new_prices, String new_category_id, String new_icon, Integer new_status, vector<Double> new_pocs_thresholds, vector<Double> new_fee_bases, vector<Double> new_pocs_weights, Boolean new_recommend, Boolean broadcast);
//    GxcTransaction propose_parameter_change(String proposing_account, fc::time_point_sec expiration_time, const variant_object & changed_values, Boolean broadcast);

    /**
     * @Description: 根据签名的memo对象，读取对应的memo信息（返回memo原文）
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:54
     */
    String read_memo(GxcMemoData memo);

//    blind_receipt receive_blind_transfer(String confirmation_receipt, String opt_from, String opt_memo);
//    GxcTransaction register_account(String name, public_key_type owner, public_key_type active, String registrar_account, String referrer_account, Long referrer_percent, Boolean broadcast);
//    GxcTransaction register_account2(String name, public_key_type owner, public_key_type active, public_key_type memo, String registrar_account, String referrer_account, Long referrer_percent, String fee_asset_symbol, Boolean broadcast);
//    void remove_builder_transaction(transaction_handle_type handle);
//    void replace_operation_in_builder_transaction(transaction_handle_type handle, unsigned operation_index, const operation & new_op);
//    GxcTransaction reserve_asset(String from, String amount, String symbol, String fee_asset_symbol, Boolean broadcast);

    /**
      * @Description: 将当前节点的账户保存 wallet_flename 如果没有指定全路径名称，则保存cli_wallet文件夹下
      * @Method: 
      * @Param: 
      * @return: 
      * @throws: 
      * @Author: mingyi
      * @Date:   2019-01-22 11:06
      */
    void save_wallet_file(String wallet_filename);

    /**
     * @Description: 序列化代理转账参数
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 16:02
     */
    String serialize_proxy_transfer_params(GxcProxyTransferParams param);

    /**
     * @Description: 序列化已签名交易信息
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 16:02
     */
    String serialize_transaction(GxcTransaction tx);
//    GxcTransaction set_desired_witness_and_committee_member_count(String account_to_modify, Integer desired_number_of_witnesses, Integer desired_number_of_committee_members, Boolean broadcast);
//    GxcAsset set_fees_on_builder_transaction(transaction_handle_type handle, String fee_asset);
    /**
     * @Description: 对钱包设置一个新密码。首次启动钱包，需要设置密码
     * @param newPassword 新密码
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:19:10
     */
    String set_password(String newPassword) ;

    /**
      * @Description: 设置投票代理 （operations节点数据需要自己解析）
      * 如果 account_to_modify 已经设置投票代理账户，再次执行会报错
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:15
      */
    GxcTransaction set_voting_proxy(String account_to_modify, String voting_account, Boolean broadcast);

//    GxcTransaction sign_builder_transaction(Integer transaction_handle, Boolean broadcast);

    /**
     * @Description: 签名交易memo（执行前需解锁钱包）
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:37
     */
    GxcMemoData sign_memo(String from, String to, String memo);

    /**
     * @Description: 对rawString进行私钥签名
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:41
     */
    String sign_string(String wif_key, String raw_string);

    /**
     * @Description: 交易签名
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 16:06
     */
    GxcTransaction sign_transaction(GxcTransaction tx, Boolean broadcast);

    /**
     * @Description: 查询当前钱包的公私钥信息
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:44
     */
    GxcBrainKeyInfo suggest_brain_key();

    /**
     * @Description: 转帐操作
     * @param fromAccount 转帐发起帐户
     * @param toAccount 转帐接收帐户
     * @param amount 转帐数目
     * @param code 转帐资产
     * @param memo 转帐备注，交易所用户充值时需要填写备注
     * @param flag true表示真正执行
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:45:54
     */
    GxcTransaction transfer(String fromAccount, String toAccount, String amount, String code, String memo, Boolean flag);


    /**
     * @Description: 转帐操作，参数同transfer, 返回结果中包含当前交易的id
     * @param fromAccount 转帐发起帐户
     * @param toAccount 转帐接收帐户
     * @param amount 转帐数目
     * @param code 转帐资产
     * @param memo 转帐备注，交易所用户充值时需要填写备注
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:46:06
     */
    JsonNode transfer2(String fromAccount, String toAccount, String amount, String code, String memo);

    /**
     * @Description: 转账交易（可指定交易资产类型、费用资产类型）
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 15:45
     */
    JsonNode transfer3(String from, String to, String amount, String asset_symbol, String memo, String fee_asset_symbol, Boolean broadcast);


//    blind_confirmation transfer_from_blind(String from_blind_account_key_or_label, String to_account_id_or_name, String amount, String asset_symbol, Boolean broadcast);
//    void transfer_test(String from_account, String to_account, Long times);
//    blind_confirmation transfer_to_blind(String from_account_id_or_name, String asset_symbol, vector<pair<String, String>> to_amounts, Boolean broadcast);
    /**
     * @Description: 解锁钱包(若原来为解锁状态，则仍为解锁状态)
     * @param myPassword 用户密码
     * @return
     * @throws
     * @author mingyi
     * @created 2018年4月13日 上午9:20:33
     */
    String unlock(String myPassword) ;

//    GxcTransaction update_account_multisig(String account, String type, Long weight_threshold, vector<String> account_auths, vector<weight_type> account_weights, String fee_symbol, Boolean broadcast);
//    GxcTransaction update_account_multisig_keys(String account, String type, Long weight_threshold, vector<public_key_type> key_auths, vector<weight_type> key_weights, String fee_symbol, Boolean broadcast);
//    GxcTransaction update_asset(String symbol, String new_issuer, GxcAsset new_options, String fee_asset_symbol, Boolean broadcast);

    /**
     * @Description: 更新合约信息
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-20 23:14
     */
    GxcTransaction update_contract(String contract, String new_owner, String contract_dir, String fee_asset_symbol, Boolean broadcast);

    /**
      * @Description: 更新出块节点信息
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:28
      */
    GxcTransaction update_witness(String witness_name, String url, String block_signing_key, String fee_asset_symbol, Boolean broadcast);

    /**
      * @Description: 升级账户信息
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:23
      */
    GxcTransaction upgrade_account(String name, String asset_symbol, Boolean broadcast);
//    GxcTransaction upgrade_account_datasource(String name, String auth_referrer, Boolean broadcast);
//    GxcTransaction upgrade_account_merchant(String name, String auth_referrer, Boolean broadcast);
//    GxcTransaction upgrade_data_transaction_member(String name, String auth_referrer, Boolean broadcast);

    /**
      * @Description: 验证代理转账签名
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:24
      */
    Boolean verify_proxy_transfer_signature(GxcProxyTransferParams param, String pub_key);

    /**
      * @Description: 验证交易签名
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:24
      */
    Boolean verify_transaction_signature(GxcTransaction trx, String pub_key);


//    GxcTransaction vote_for_committee_member(String voting_account, String committee_member, Boolean approve, Boolean broadcast);
//    GxcTransaction vote_for_trust_nodes(String voting_account, List<String> account_names, Boolean broadcast);
    /**
      * @Description: 给节点投票 命令【vote_for_witness my-1 bao true true】
     * witness可根据 list_witnesses 进行查询
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 20:36
      */
    GxcTransaction vote_for_witness(String voting_account, String witness, Boolean approve, Boolean broadcast);
//    GxcTransaction whitelist_account(String authorizing_account, String account_to_list, account_whitelist_operation::account_listing new_listing_status, Boolean broadcast);
//    GxcTransaction withdraw_trust_node_pledge(String account_name, String fee_asset_symbol, Boolean broadcast);
//    GxcTransaction withdraw_vesting(String witness_name, String amount, String asset_symbol, String fee_asset_symbol, Boolean broadcast);

}

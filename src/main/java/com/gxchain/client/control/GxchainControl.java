package com.gxchain.client.control;

import com.fasterxml.jackson.databind.JsonNode;
import com.gxchain.client.api.GxClientService;
import com.gxchain.client.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GxchainControl {

    @Autowired
    private GxClientService gxClientService;

    /**
      * @Description: 获取版本信息等
      * 实例：http://localhost:8088/gxchain/about
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:34
      */
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public GxcAbout about(){
        return gxClientService.about();
    }

    /**
      * @Description: 合约调用
      * 实例：
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/call_contract",method = RequestMethod.POST)
    public GxcTransaction call_contract(String account, String contract, GxcAmount amount, String method, String arg, String fee_asset_symbol, Boolean broadcast){
        return gxClientService.call_contract(account, contract, amount, method, arg, fee_asset_symbol, broadcast);
    }

    /**
      * @Description: 根据brain_key创建账号
      * 实例：K
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/create_account_with_brain_key",method = RequestMethod.POST)
    public GxcTransaction create_account_with_brain_key(String brain_key, String account_name, String registrar_account, String referrer_account, Boolean broadcast){
        return gxClientService.create_account_with_brain_key(brain_key, account_name, registrar_account, referrer_account, broadcast);
    }

    /**
      * @Description: 创建委员会成员
      * 实例：localhost:8088/gxchain/create_committee_member?owner_account=my-1&url=www.baidu.com&broadcast=true
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/create_committee_member",method = RequestMethod.POST)
    public GxcTransaction create_committee_member(@RequestParam String owner_account,@RequestParam String url,@RequestParam Boolean broadcast){
        return gxClientService.create_committee_member(owner_account, url, broadcast);
    }

    /**
      * @Description: 创建见证节点
      * 实例：localhost:8088/gxchain/create_witness?owner_account=my-1&url=www.baidu.com&fee_asset_symbol=GXC&broadcast=true
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/create_witness",method = RequestMethod.POST)
    public GxcTransaction create_witness(@RequestParam String owner_account,@RequestParam String url,
         @RequestParam String fee_asset_symbol,@RequestParam Boolean broadcast){
        return gxClientService.create_witness(owner_account, url, fee_asset_symbol, broadcast);
    }

    /**
      * @Description: 自定义交易事件
      * 实例：localhost:8088/gxchain/custom?account=my-1&id=1&data=helloworld&fee_symbol=GXC&broadcast=true
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/custom",method = RequestMethod.POST)
    public GxcTransaction custom(@RequestParam String account,@RequestParam Integer id,
         @RequestParam String data,@RequestParam String fee_symbol,@RequestParam Boolean broadcast){
        GxcTransaction gxcTransaction = gxClientService.custom(account, id, data, fee_symbol, broadcast) ;
        return gxcTransaction;
    }

    /**
      * @Description: 打印备份私钥
      * 实例：localhost:8088/gxchain/dump_private_keys
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/dump_private_keys",method = RequestMethod.GET)
    public JsonNode dump_private_keys(){
//        获取前需要解锁，否则报错
         return gxClientService.dump_private_keys();
    }

    /**
      * @Description: 积存资产费用池
      * 实例：localhost:8088/gxchain/fund_asset_fee_pool?from=my-1&symbol=GXC&amount=1&broadcast=true
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/fund_asset_fee_pool",method = RequestMethod.GET)
    public GxcTransaction fund_asset_fee_pool(@RequestParam("from")String from, @RequestParam("symbol")String symbol,
              @RequestParam("amount")String amount, @RequestParam("broadcast")Boolean broadcast){
        GxcTransaction gxcTransaction = gxClientService.fund_asset_fee_pool(from, symbol, amount, broadcast);
        return gxcTransaction;
    }


    /**
      * @Description: 根据账号获取账户信息
      * 实例：localhost:8088/gxchain/get_account?accountNameOrId=my-1
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/get_account",method = RequestMethod.GET)
    public GxcAccount get_account(@RequestParam("accountNameOrId")String accountNameOrId){
        GxcAccount gxcAccount = gxClientService.get_account(accountNameOrId);
        return gxcAccount;
    }


    /**
      * @Description: 获取链上账户总数
      * 实例：localhost:8088/gxchain/get_account_count
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/get_account_count",method = RequestMethod.GET)
    public Integer get_account_count(){
        Integer count = gxClientService.get_account_count();
        return count;
    }

    /**
      * @Description: 获取某账户的历史交易记录
      * 实例：localhost:8088/gxchain/get_account_history?accountNameOrId=blockcity&limitNum=10
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/get_account_history",method = RequestMethod.GET)
    public List<GxcAccountRecord> get_account_history(@RequestParam("accountNameOrId")String accountNameOrId, @RequestParam("limitNum")Integer limitNum){
        List<GxcAccountRecord> gxcAccountRecordList = gxClientService.get_account_history(accountNameOrId,limitNum);
        return gxcAccountRecordList;
    }


    /**
      * @Description:
      * 实例：
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/get_account_history_by_operations",method = RequestMethod.GET)
    public GxcAccountHistoryOpe get_account_history_by_operations(@RequestParam("accountNameOrId")String accountNameOrId,
              @RequestParam("operateType")List<Integer> operateType,@RequestParam("start")Integer start,
              @RequestParam("limitNum")Integer limitNum){
        GxcAccountHistoryOpe gxcAccountHistoryOpe = gxClientService.get_account_history_by_operations(accountNameOrId,operateType,start,limitNum);
        return gxcAccountHistoryOpe;
    }

    /**
      * @Description: 根据账号或账号id获取账号id
      * 实例： localhost:8088/gxchain/get_account_id?accountNameOrId=lendchain
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/get_account_id",method = RequestMethod.GET)
    public String get_account_id(@RequestParam("accountNameOrId")String accountNameOrId){
        String accountId = gxClientService.get_account_id(accountNameOrId);
        return accountId;
    }

    /**
      * @Description: 根据资产名称或者资产id获取资产信息
      * 实例：localhost:8088/gxchain/get_asset?asset_name_or_id=GXC
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:46
      */
    @RequestMapping(value = "/get_asset",method = RequestMethod.GET)
    public GxcAsset get_asset(@RequestParam("asset_name_or_id")String asset_name_or_id){
        GxcAsset gxcAsset = gxClientService.get_asset(asset_name_or_id);
        return gxcAsset;
    }


    /**
     * @Description: 获取链上发行资产的总数量
     * 实例：localhost:8088/gxchain/get_asset_count
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:46
     */
    @RequestMapping(value = "/get_asset_count",method = RequestMethod.GET)
    public Integer get_asset_count(){
        Integer count = gxClientService.get_asset_count();
        return count;
    }

    /**
     * @Description: 获取指定区块号的区块信息
     * 实例：localhost:8088/gxchain/get_block?blockNum=1000000
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_block",method = RequestMethod.GET)
    public GxcBlock get_block(@RequestParam("blockNum")Long blockNum){
        return gxClientService.get_block(blockNum);
    }

    /**
     * @Description: 根据区块id获取区块信息
     * 实例：localhost:8088/gxchain/get_block_by_id?block_id=000f4240745b287a353c55b02a93f9bcc2b1a763
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_block_by_id",method = RequestMethod.GET)
    public GxcBlock get_block_by_id(@RequestParam("block_id")String block_id){
        return gxClientService.get_block_by_id(block_id);
    }


    /**
     * @Description: 获取佣金比例
     * 实例：localhost:8088/gxchain/get_commission_percent
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_commission_percent",method = RequestMethod.GET)
    public GxcCommissionPercent get_commission_percent(){
        return gxClientService.get_commission_percent();
    }


    /**
     * @Description: 获取委员会成员信息
     * 实例：localhost:8088/gxchain/get_committee_member?owner_account=miner2
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_committee_member",method = RequestMethod.GET)
    public GxcCommitteeMember get_committee_member(@RequestParam("owner_account")String owner_account){
        return gxClientService.get_committee_member(owner_account);
    }

    /**
     * @Description: 获取合约中的表名称列表
     * 实例：localhost:8088/gxchain/get_contract_tables?contract=gxcgame-dice2
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_contract_tables",method = RequestMethod.GET)
    public List<String> get_contract_tables(@RequestParam("contract")String contract){
        return gxClientService.get_contract_tables(contract);
    }

    /**
     * @Description: 获取全局动态属性
     * 实例：localhost:8088/gxchain/get_dynamic_global_properties
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_dynamic_global_properties",method = RequestMethod.GET)
    public GxcDynamicGlobalProperties get_dynamic_global_properties(){
        return gxClientService.get_dynamic_global_properties();
    }

    /**
     * @Description: 获取指定区块号的区块信息
     * 实例：localhost:8088/gxchain/get_global_properties
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_global_properties",method = RequestMethod.GET)
    public GxcGlobalProperties get_global_properties(){
        return gxClientService.get_global_properties();
    }

    /**
     * @Description: 根据传入的值获取sha256的hash字串
     * 实例：localhost:8088/gxchain/get_hash?value=helloworld
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_hash",method = RequestMethod.GET)
    public String get_hash(@RequestParam("value")String value){
        return gxClientService.get_hash(value);
    }

    /**
     * @Description: 获取不可能交易
     * 实例：localhost:8088/gxchain/get_irreversible_account_history?accountNameOrId=my-1&operateType=0,1&start=0&limitNum=10
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_irreversible_account_history",method = RequestMethod.GET)
    public GxcAccountHistoryOpe get_irreversible_account_history(@RequestParam("accountNameOrId")String accountNameOrId,
           @RequestParam("operateType")List<Integer> operateType,@RequestParam("start")Integer start,
           @RequestParam("limitNum")Integer limitNum){
        return gxClientService.get_irreversible_account_history(accountNameOrId,operateType,start,limitNum);
    }

    /**
     * @Description: 获得总商户数量
     * 实例：localhost:8088/gxchain/get_merchants_total_count
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_merchants_total_count",method = RequestMethod.GET)
    public Integer get_merchants_total_count(){
        return gxClientService.get_merchants_total_count();
    }

    /**
     * @Description: 根据对象id查询信息，比如：资产id：1.3.1；合约id：1.2.1102979，账户id：1.2.737551等（因对象结构类型不同，直接返回String，后续根据业务需要返回对应的对象）
     * 实例：localhost:8088/gxchain/get_object?id=1.3.1
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_object",method = RequestMethod.GET)
    public String get_object(@RequestParam("id")String id){
        return gxClientService.get_object(id);
    }

    /**
     * @Description: 根据公钥获取私钥信息（需要先解锁钱包且该公钥对应的私钥已经导入）
     * 实例：localhost:8088/gxchain/get_private_key?publicKey=GXC6LzaCvhyuy2ax4S7D22zZenQEMjzRpdE8esg7FiMPR7xj8b8VC
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_private_key",method = RequestMethod.GET)
    public String get_private_key(@RequestParam("publicKey")String publicKey){
        return gxClientService.get_private_key(publicKey);
    }


    /**
     * @Description: 例如：get_prototype_operation transfer_operation
     * 实例：localhost:8088/gxchain/get_prototype_operation?operation_type=transfer_operation
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_prototype_operation",method = RequestMethod.GET)
    public String get_prototype_operation(@RequestParam("operation_type")String operation_type){
        return gxClientService.get_prototype_operation(operation_type);
    }

    /**
     * @Description: 根据wif_key获取对应的pub_key
     * 实例：localhost:8088/gxchain/get_pub_key_from_wif_key?wif_key=XXXXXXX
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_pub_key_from_wif_key",method = RequestMethod.GET)
    public String get_pub_key_from_wif_key(@RequestParam("wif_key")String wif_key){
        return gxClientService.get_pub_key_from_wif_key(wif_key);
    }


    /**
     * @Description:
     * 实例：localhost:8088/gxchain/get_relative_account_history?accountNameOrId=my-1&start=0&limitNum=10&stop=0
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_relative_account_history",method = RequestMethod.GET)
    public List<GxcAccountRecord> get_relative_account_history(@RequestParam("accountNameOrId")String accountNameOrId,
             @RequestParam("start")Integer start,@RequestParam("limitNum")Integer limitNum,
             @RequestParam("stop")Integer stop){
        return gxClientService.get_relative_account_history(accountNameOrId,start,limitNum,stop);
    }


    /**
     * @Description: 获取合约表中数据
     * 实例：localhost:8088/gxchain/get_table_rows?contract=gxcgame-dice17&table=dicejoin&start=0&limitNum=10
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:37
     */
    @RequestMapping(value = "/get_table_rows",method = RequestMethod.GET)
    public JsonNode get_table_rows(@RequestParam("contract")String contract,
               @RequestParam("table")String table, @RequestParam("start")Integer start, @RequestParam("limitNum")Integer limitNum){
        return gxClientService.get_table_rows(contract,table,start,limitNum);
    }

    /**
     * @Description:
     * 实例：
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:35
     */
    @RequestMapping(value = "/get_transaction_id",method = RequestMethod.POST)
    public String get_transaction_id(@RequestParam("gxcTransaction")GxcTransaction gxcTransaction){
        return gxClientService.get_transaction_id(gxcTransaction);
    }

    /**
     * @Description: 获取某账户的归属余额信息
     * 实例：localhost:8088/gxchain/get_vesting_balances?account_name=my-1
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:35
     */
    @RequestMapping(value = "/get_vesting_balances",method = RequestMethod.GET)
    public List<GxcVestingBalance> get_vesting_balances(@RequestParam("account_name")String account_name){
        return gxClientService.get_vesting_balances(account_name);
    }

    /**
     * @Description: 根据见证节点名称获取见证节点相关信息
     * 实例：localhost:8088/gxchain/get_witness?owner_account=init2
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:35
     */
    @RequestMapping(value = "/get_witness",method = RequestMethod.GET)
    public GxcWitness get_witness(@RequestParam("owner_account")String owner_account){
        return gxClientService.get_witness(owner_account);
    }

    /**
      * @Description: 根据获取指定命令的业务描述
      * 实例：http://localhost:8088/gxchain/gethelp?command=transfer
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:35
      */
    @RequestMapping(value = "/gethelp",method = RequestMethod.GET)
    public String help(@RequestParam("command")String command){
        return gxClientService.gethelp(command);
    }


    /**
      * @Description: 显示command line interface 所有的操作
      * 实例：http://localhost:8088/gxchain/help
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:36
      */
    @RequestMapping(value = "/help",method = RequestMethod.GET)
    public String help(){
        return gxClientService.help();
    }

    /**
      * @Description: 
      * 实例：
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:36
      */
    @RequestMapping(value = "/import_account_keys",method = RequestMethod.POST)
    public Boolean import_account_keys(String filename, String password, String src_account_name, String dest_account_name){
        return gxClientService.import_account_keys(filename, password, src_account_name, dest_account_name);
    }

    /**
      * @Description: 导入key
      * 实例：localhost:8088/gxchain/import_key?accountNameOrId=my-1&wifPrivateKey=XXXXX&broadcast=true
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:36
      */
    @RequestMapping(value = "/import_key",method = RequestMethod.POST)
    public Boolean import_key(@RequestParam String accountNameOrId,@RequestParam String wifPrivateKey, @RequestParam Boolean broadcast){
        return gxClientService.import_key(accountNameOrId, wifPrivateKey, broadcast);
    }

    /**
      * @Description: 获取当前节点相关信息
      * 实例：localhost:8088/gxchain/info
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-26 13:36
      */
    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public GxcInfo info(){
        return gxClientService.info();
    }

    /**
     * @Description: 根据输入的账户名称，判断该账户是否已经注册
     * 实例：localhost:8088/gxchain/is_account_registered?name=my-1
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/is_account_registered",method = RequestMethod.GET)
    public Boolean is_account_registered(String name){
        return gxClientService.is_account_registered(name);
    }

    /**
     * @Description: 获取当前客户端的解锁状态
     * 实例：localhost:8088/gxchain/is_locked
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/is_locked",method = RequestMethod.GET)
    public Boolean is_locked(){
        return gxClientService.is_locked();
    }

    /**
     * @Description: 判断当前客户端是否为新创客户端
     * 实例：localhost:8088/gxchain/is_new
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/is_new",method = RequestMethod.GET)
    public Boolean is_new(){
        return gxClientService.is_new();
    }

    /**
     * @Description: 
     * 实例：
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/issue_asset",method = RequestMethod.POST)
    public GxcTransaction issue_asset(@RequestParam String to_account,@RequestParam String amount,@RequestParam String symbol,
          @RequestParam String memo,@RequestParam String fee_asset_symbol,@RequestParam Boolean broadcast){
        return gxClientService.issue_asset(to_account,amount,symbol,memo,fee_asset_symbol,broadcast);
    }

    /**
     * @Description: 判断公钥是否已注册
     * 实例：localhost:8088/gxchain/is_public_key_registered?public_key=GXC6LzaCvhyuy2ax4S7D22zZenQEMjzRpdE8esg7FiMPR7xj8b8VC
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/is_public_key_registered",method = RequestMethod.GET)
    public Boolean is_public_key_registered(String public_key){
        return gxClientService.is_public_key_registered(public_key);
    }

    /**
     * @Description: 根据账号查看资产余额信息
     * 实例：localhost:8088/gxchain/list_account_balances?accountNameOrId=my-1
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/list_account_balances",method = RequestMethod.GET)
    public List<GxcAccountBalance> list_account_balances(@RequestParam("accountNameOrId") String accountNameOrId){
        return gxClientService.list_account_balances(accountNameOrId);
    }

    /**
     * @Description: 查看账户被锁定的余额
     * 实例：localhost:8088/gxchain/list_account_lock_balances?account_id_or_name=my-1
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/list_account_lock_balances",method = RequestMethod.GET)
    public List<String> list_account_lock_balances(@RequestParam("account_id_or_name")String account_id_or_name){
        return gxClientService.list_account_lock_balances(account_id_or_name);
    }

    /**
     * @Description: 获取链上账户列表
     * 实例：localhost:8088/gxchain/list_accounts?lowerbound=0&limit=10
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/list_accounts",method = RequestMethod.GET)
    public JsonNode list_accounts(@RequestParam("lowerbound") Long lowerbound,@RequestParam("limit") Long limit){
        return gxClientService.list_accounts(lowerbound,limit);
    }

    /**
     * @Description: 获取资产列表
     * 实例：localhost:8088/gxchain/list_assets?lowerbound=0&limit=10
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/list_assets",method = RequestMethod.GET)
    public List<GxcAsset> list_assets(@RequestParam("lowerbound") Long lowerbound,@RequestParam("limit") Long limit){
        return gxClientService.list_assets(lowerbound,limit);
    }

    /**
     * @Description: 获取委员会成员列表
     * 实例：localhost:8088/gxchain/list_committee_members?lowerbound=0&limit=10
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/list_committee_members",method = RequestMethod.GET)
    public JsonNode list_committee_members(@RequestParam("lowerbound") Long lowerbound,@RequestParam("limit") Long limit){
        return gxClientService.list_committee_members(lowerbound,limit);
    }

    /**
     * @Description: 获取当前节点导入的账户信息
     * 实例：localhost:8088/gxchain/list_my_accounts
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/list_my_accounts",method = RequestMethod.GET)
    public List<GxcAccount> list_my_accounts(){
        return gxClientService.list_my_accounts();
    }

    /**
     * @Description: 获取见证节点列表
     * 实例：localhost:8088/gxchain/list_witnesses?lowerbound=0&limit=10
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/list_witnesses",method = RequestMethod.GET)
    public JsonNode list_witnesses(@RequestParam("lowerbound") Long lowerbound,@RequestParam("limit") Long limit){
        return gxClientService.list_witnesses(lowerbound, limit);
    }

    /**
     * @Description: 加载钱包文件（如果walletfilename不存在，则返回false；先执行如果save_wallet_file）
     * 实例：localhost:8088/gxchain/load_wallet_file?wallet_filename=wallet1.txt
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/load_wallet_file",method = RequestMethod.GET)
    public Boolean load_wallet_file(@RequestParam("wallet_filename") String wallet_filename){
        return gxClientService.load_wallet_file(wallet_filename);
    }

    /**
     * @Description: 锁定钱包(如果钱包处理锁定状态，则报异常)
     * 实例：localhost:8088/gxchain/lock
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/lock",method = RequestMethod.GET)
    public String lock(){
        return gxClientService.lock();
    }

    /**
     * @Description: 标准化数据（存在的小写字母转大写）
     * 实例：localhost:8088/gxchain/normalize_brain_key?s=helloworld123
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/normalize_brain_key",method = RequestMethod.GET)
    public String normalize_brain_key(String s){
        return gxClientService.normalize_brain_key(s);
    }

    /**
     * @Description: 
     * 实例：
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/pay_data_transaction",method = RequestMethod.POST)
    public GxcTransaction pay_data_transaction(@RequestParam String from, @RequestParam String to,@RequestBody GxcAsset amount,
       @RequestParam String request_id,@RequestParam Boolean broadcast){
        return gxClientService.pay_data_transaction(from, to, amount, request_id, broadcast);
    }

    /**
     * @Description:  duqumemo信息
     * 实例：localhost:8088/gxchain/read_memo
     * @Method:
     * @Param: 可测试如下参数对象
     * {
     *     "from": "GXC6LzaCvhyuy2ax4S7D22zZenQEMjzRpdE8esg7FiMPR7xj8b8VC",
     *     "to": "GXC7Ep2ZQ9eDPjy6QwTmhXzTcUjTY7eBoBtWGxmqKu4ez2VcxPw7v",
     *     "nonce": "12827800315472749458",
     *     "message": "e32dc848c9cfa0d28b72b748e90946e8"
     * }
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/read_memo",method = RequestMethod.POST)
    public String read_memo(@RequestBody GxcMemoData gxcMemoData){
        return gxClientService.read_memo(gxcMemoData);
    }

    /**
     * @Description: 保存钱包文件
     * 实例：localhost:8088/gxchain/save_wallet_file?filename=wallet1.txt
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/save_wallet_file",method = RequestMethod.GET)
    public void save_wallet_file(@RequestParam("filename") String filename){
        gxClientService.save_wallet_file(filename);
    }

    /**
     * @Description: 
     * 实例：
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/serialize_proxy_transfer_params",method = RequestMethod.POST)
    public String serialize_proxy_transfer_params(@RequestBody GxcProxyTransferParams param){
        return gxClientService.serialize_proxy_transfer_params(param);
    }

    /**
     * @Description: 序列号交易
     * 实例：localhost:8088/gxchain/serialize_transaction (参数gxcTransaction请在postman中自行构造)
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/serialize_transaction",method = RequestMethod.POST)
    public String serialize_transaction(@RequestBody GxcTransaction gxcTransaction){
        return gxClientService.serialize_transaction(gxcTransaction);
    }

    /**
     * @Description: 设置客户端密码
     * 实例：localhost:8088/gxchain/set_password?newPassword=hello
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/set_password",method = RequestMethod.POST)
    public String set_password(@RequestParam("newPassword") String newPassword){
        return gxClientService.set_password(newPassword);
    }

    /**
     * @Description: 设置投票代理（如果已设置了投票代理，再次执行时会报错）
     * 实例：localhost:8088/gxchain/set_voting_proxy?account_to_modify=my-2&voting_account=my-1&broadcast=true
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/set_voting_proxy",method = RequestMethod.POST)
    public GxcTransaction set_voting_proxy(@RequestParam String account_to_modify, @RequestParam String voting_account, @RequestParam Boolean broadcast){
        return gxClientService.set_voting_proxy(account_to_modify,voting_account,broadcast);
    }

    /**
     * @Description: 对交易memo进行签名
     * 实例：localhost:8088/gxchain/sign_memo?from=my-1&to=my-2&memo=helloworld
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/sign_memo",method = RequestMethod.GET)
    public GxcMemoData sign_memo(String from, String to, String memo){
        return gxClientService.sign_memo(from, to, memo);
    }

    /**
     * @Description: 字符串签名
     * 实例：localhost:8088/gxchain/sign_string?wif_key=XXXXXXX&raw_string=23832232
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/sign_string",method = RequestMethod.GET)
    public String sign_string(String wif_key, String raw_string){
        return gxClientService.sign_string(wif_key,raw_string);
    }

    /**
     * @Description: 交易签名
     * 实例：localhost:8088/gxchain/sign_transaction?broadcast=false (tx json体中，通过postman模拟)
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/sign_transaction",method = RequestMethod.POST)
    public GxcTransaction sign_transaction(@RequestBody  GxcTransaction tx, @RequestParam("broadcast")Boolean broadcast){
        return gxClientService.sign_transaction(tx,broadcast);
    }

    /**
     * @Description: 脑钱包key映射
     * 实例：localhost:8088/gxchain/suggest_brain_key
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/suggest_brain_key",method = RequestMethod.GET)
    public GxcBrainKeyInfo suggest_brain_key(){
        return gxClientService.suggest_brain_key();
    }

    /**
     * @Description: 发起转账
     * 实例：localhost:8088/gxchain/transfer?from=my-1&to=my-2&amount=1&symbol=GXC&memo=helloworld&broadcast=true
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/transfer",method = RequestMethod.POST)
    public GxcTransaction transfer(@RequestParam("from") String from,@RequestParam("to")  String to,
       @RequestParam("amount")  String amount,@RequestParam("symbol")  String symbol,@RequestParam("memo")  String memo, @RequestParam("broadcast")Boolean broadcast){
        return gxClientService.transfer(from, to, amount, symbol, memo, broadcast);
    }

    /**
     * @Description: 转账（该接口最终会调用broadcast为true的transfer接口）
     * @Method: localhost:8088/gxchain/transfer2?from=my-1&to=my-2&amount=1.1&symbol=GXC&memo=helloworld
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/transfer2",method = RequestMethod.POST)
    public JsonNode transfer2(@RequestParam("from")String from,@RequestParam("to")String to,
        @RequestParam("amount")String amount,@RequestParam("symbol")String symbol,@RequestParam("memo")String memo){
        return gxClientService.transfer2(from, to, amount, symbol, memo);
    }

    /**
     * @Description: 指定费用类型的转账
     * 实例：localhost:8088/gxchain/transfer3?from=my-1&to=my-2&amount=1.3&symbol=GXC&memo=helloworld&fee_symbol=GXC&broadcast=true
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/transfer3",method = RequestMethod.POST)
    public JsonNode transfer3(@RequestParam("from")String from,@RequestParam("to")String to,@RequestParam("amount")String amount,
        @RequestParam("symbol")String symbol,@RequestParam("memo")String memo, @RequestParam("fee_symbol")String fee_symbol,@RequestParam("broadcast")Boolean broadcast){
        return gxClientService.transfer3(from, to, amount, symbol, memo, fee_symbol, broadcast);
    }


    /**
     * @Description: 解锁客户端钱包
     * 实例：localhost:8088/gxchain/unlock?myPassword=XXXX
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/unlock",method = RequestMethod.POST)
    public String unlock(@RequestParam("myPassword") String myPassword){
        return gxClientService.unlock(myPassword);
    }

    /**
     * @Description: 更新合约
     * 实例：localhost:8088/gxchain/update_contract?contract=XXXXX&new_owner=XXXX&contract_dir=XXXXX&fee_asset_symbol=GXC&broadcast=true
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/update_contract",method = RequestMethod.POST)
    public GxcTransaction update_contract(@RequestParam("contract")String contract, @RequestParam("new_owner")String new_owner,
        @RequestParam("contract_dir")String contract_dir, @RequestParam("fee_asset_symbol")String fee_asset_symbol,
        @RequestParam("broadcast")Boolean broadcast){
        return gxClientService.update_contract(contract, new_owner, contract_dir, fee_asset_symbol, broadcast);
    }

    /**
     * @Description: 更新节点
     * 实例：localhost:8088/gxchain/update_witness?witness_name=XXX&url=XXXXX&block_signing_key=XXXXX&fee_asset_symbol=GXC&broadcast=true
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/update_witness",method = RequestMethod.POST)
    public GxcTransaction update_witness(@RequestParam("witness_name")String witness_name, @RequestParam("url")String url,
         @RequestParam("block_signing_key")String block_signing_key, @RequestParam("fee_asset_symbol")String fee_asset_symbol,
         @RequestParam("broadcast") Boolean broadcast){
        return gxClientService.update_witness(witness_name, url, block_signing_key, fee_asset_symbol, broadcast);
    }

    /**
     * @Description: 升级账户
     * 实例：localhost:8088/gxchain/upgrade_account?name=my-2&asset_symbol=GXC&broadcast=false
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/upgrade_account",method = RequestMethod.POST)
    public GxcTransaction upgrade_account(@RequestParam("name") String name,
          @RequestParam("asset_symbol") String asset_symbol, @RequestParam("broadcast") Boolean broadcast){
        return gxClientService.upgrade_account(name, asset_symbol, broadcast);
    }

    /**
     * @Description:
     * 实例：
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/verify_proxy_transfer_signature",method = RequestMethod.POST)
    public Boolean verify_proxy_transfer_signature(@RequestBody GxcProxyTransferParams param, @RequestParam("pub_key")String pub_key){
        return gxClientService.verify_proxy_transfer_signature(param,pub_key);
    }

    /**
     * @Description: 验证交易的合法性
     * 实例：localhost:8088/gxchain/verify_transaction_signature?pub_key=GXC6LzaCvhyuy2ax4S7D22zZenQEMjzRpdE8esg7FiMPR7xj8b8VC
     * @Method:
     * @Param: trx （交易体）
     * @Param: pub_key （公钥验证）
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/verify_transaction_signature",method = RequestMethod.POST)
    public Boolean verify_transaction_signature(@RequestBody GxcTransaction trx, @RequestParam("pub_key") String pub_key){
        return gxClientService.verify_transaction_signature(trx, pub_key);
    }

    /**
     * @Description: 节点投票
     * 实例：localhost:8088/gxchain/vote_for_witness?voting_account=my-1&witness=init2&approve=true&broadcast=true
     * @Method:
     * @Param:
     * @return:
     * @throws:
     * @Author: mingyi
     * @Date:   2019-01-26 13:36
     */
    @RequestMapping(value = "/vote_for_witness",method = RequestMethod.POST)
    public GxcTransaction vote_for_witness(@RequestParam("voting_account") String voting_account,
       @RequestParam("witness")String witness,@RequestParam("approve")Boolean approve, @RequestParam("broadcast") Boolean broadcast){
        return gxClientService.vote_for_witness(voting_account, witness, approve, broadcast);
    }

}

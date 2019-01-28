package com.gxchain.client.api.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.gxchain.client.api.GxClientService;
import com.gxchain.client.common.Constants;
import com.gxchain.client.domain.*;
import com.gxchain.client.enums.EnumGxcMethod;
import com.gxchain.client.jsonrpc.JsonMapper;
import com.gxchain.client.jsonrpc.JsonRpcLayerException;
import com.gxchain.client.jsonrpc.domain.JsonRpcRequest;
import com.gxchain.client.jsonrpc.domain.JsonRpcResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Title: GxClientServiceImpl
 * @Description: 公信宝钱包操作服务类
 * @Author: mingyi
 * @created 2018年4月13日 下午2:22:44
 */
@Service
public class GxClientServiceImpl implements GxClientService {

    private Logger logger = LoggerFactory.getLogger("GxClientServiceImpl");

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private JsonMapper jsonMapper;


    @Override
    public GxcAbout about() {
        GxcAbout gxcAbout = null;
        try{
            String aboutJson = excuteRpcRequest(EnumGxcMethod.about.getName(),new ArrayList());
            gxcAbout = jsonMapper.mapToEntity(jsonMapper.mapToEntity(aboutJson, JsonRpcResponse.class).getResult(),GxcAbout.class);
        }catch (Exception e){
            logger.error("about 解析异常");
        }
        return gxcAbout;
    }

    @Override
    public GxcTransaction call_contract(String account, String contract, GxcAmount amount, String method, String arg, String fee_asset_symbol, Boolean broadcast) {
        GxcTransaction callContract = null;
        try{
            List list = new ArrayList();
            list.add(account);
            list.add(contract);
            list.add(amount);
            list.add(method);
            list.add(arg);
            list.add(fee_asset_symbol);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.call_contract.getName(),list);
            callContract = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return callContract;
    }

    @Override
    public GxcTransaction create_account_with_brain_key(String brain_key, String account_name, String registrar_account, String referrer_account, Boolean broadcast) {
        GxcTransaction create_account_with_brain_key = null;
        try{
            List list = new ArrayList();
            list.add(brain_key);
            list.add(account_name);
            list.add(registrar_account);
            list.add(referrer_account);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.create_account_with_brain_key.getName(),list);
            create_account_with_brain_key = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return create_account_with_brain_key;
    }

    @Override
    public GxcTransaction create_committee_member(String owner_account, String url, Boolean broadcast) {
        GxcTransaction create_committee_member = null;
        try{
            List list = new ArrayList();
            list.add(owner_account);
            list.add(url);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.create_committee_member.getName(),list);
            create_committee_member = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return create_committee_member;
    }

    @Override
    public GxcTransaction create_witness(String owner_account, String url, String fee_asset_symbol, Boolean broadcast) {
        GxcTransaction create_witness = null;
        try{
            List list = new ArrayList();
            list.add(owner_account);
            list.add(url);
            list.add(fee_asset_symbol);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.create_witness.getName(),list);
            create_witness = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return create_witness;
    }

    @Override
    public GxcTransaction custom(String account, Integer id, String data, String fee_symbol, Boolean broadcast) {
        GxcTransaction custom = null;
        try{
            List list = new ArrayList();
            list.add(account);
            list.add(id);
            list.add(data);
            list.add(fee_symbol);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.custom.getName(),list);
            custom = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return custom;
    }

    /**
      * @Description: 打印钱包拥有的所有公私钥对(直接返回字符串，不做处理)
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:31
      */
    @Override
    public JsonNode dump_private_keys() {
        JsonNode privateKeys = null;
        try{
            String privateKeysJson = excuteRpcRequest(EnumGxcMethod.dump_private_keys.getName(),new ArrayList());
            privateKeys = jsonMapper.mapToEntity(jsonMapper.mapToEntity(privateKeysJson, JsonRpcResponse.class).getResult(),JsonNode.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return privateKeys;
    }


    @Override
    public GxcTransaction fund_asset_fee_pool(String from, String symbol, String amount, Boolean broadcast) {
        GxcTransaction gxcTransaction = null;
        try{
            List list = new ArrayList();
            list.add(from);
            list.add(symbol);
            list.add(amount);
            list.add(broadcast);
            String gxcTransactionJson = excuteRpcRequest(EnumGxcMethod.fund_asset_fee_pool.getName(),list);
            gxcTransaction = jsonMapper.mapToEntity(jsonMapper.mapToEntity(gxcTransactionJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcTransaction;
    }

    /**
      * @Description: 获取账户信息
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:32
      */
    @Override
    public GxcAccount get_account(String accountNameOrId) {
        GxcAccount gxcAccount = null;
        try{
            List list = new ArrayList();
            list.add(accountNameOrId);
            String gxcAccountJson = excuteRpcRequest(EnumGxcMethod.get_account.getName(),list);
            gxcAccount = jsonMapper.mapToEntity(jsonMapper.mapToEntity(gxcAccountJson, JsonRpcResponse.class).getResult(),GxcAccount.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcAccount;
    }

    @Override
    public Integer get_account_count() {
        Integer accountCount = null;
        try{
            String accountCountJson = excuteRpcRequest(EnumGxcMethod.get_account_count.getName(),new ArrayList());
            accountCount = jsonMapper.mapToEntity(jsonMapper.mapToEntity(accountCountJson, JsonRpcResponse.class).getResult(),Integer.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return accountCount;
    }

    /**
      * @Description: 公信股查看账户历史信息(列表信息)
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:33
      */
    @Override
    public List<GxcAccountRecord> get_account_history(String accountNameOrId, Integer limitNum) {
        List<GxcAccountRecord> accountRecordList = null;
        try{
            List list = new ArrayList();
            list.add(accountNameOrId);
            list.add(limitNum);
            String accountRecordListJson = excuteRpcRequest(EnumGxcMethod.get_account_history.getName(),list);
            accountRecordList = jsonMapper.mapToList(jsonMapper.mapToEntity(accountRecordListJson, JsonRpcResponse.class).getResult(),GxcAccountRecord.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return accountRecordList;
    }

    @Override
    public GxcAccountHistoryOpe get_account_history_by_operations(String accountNameOrId, List<Integer> operateType, Integer start, Integer limitNum) {
        GxcAccountHistoryOpe gxcAccountHistoryOpe = null;
        try{
            List list = new ArrayList();
            list.add(accountNameOrId);
            list.add(operateType);
            list.add(start);
            list.add(limitNum);
            String gxcAccountHistoryOpeJson = excuteRpcRequest(EnumGxcMethod.get_account_history_by_operations.getName(),list);
            gxcAccountHistoryOpe = jsonMapper.mapToEntity(jsonMapper.mapToEntity(gxcAccountHistoryOpeJson, JsonRpcResponse.class).getResult(),GxcAccountHistoryOpe.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcAccountHistoryOpe;
    }

    /**
      * @Description: 获取账户id
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:32
      */
    @Override
    public String get_account_id(String accountNameOrId) {
        String accountId = null;
        try{
            List list = new ArrayList();
            list.add(accountNameOrId);
            String accountIdJson = excuteRpcRequest(EnumGxcMethod.get_account_id.getName(),list);
            accountId = jsonMapper.mapToEntity(jsonMapper.mapToEntity(accountIdJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return accountId;
    }

    @Override
    public GxcAsset get_asset(String asset_name_or_id) {
        GxcAsset gxcAsset = null;
        try{
            List list = new ArrayList();
            list.add(asset_name_or_id);
            String accountIdJson = excuteRpcRequest(EnumGxcMethod.get_asset.getName(),list);
            gxcAsset = jsonMapper.mapToEntity(jsonMapper.mapToEntity(accountIdJson, JsonRpcResponse.class).getResult(),GxcAsset.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcAsset;
    }

    @Override
    public Integer get_asset_count() {
        Integer assetCount = null;
        try{
            String assetCountJson = excuteRpcRequest(EnumGxcMethod.get_asset_count.getName(),new ArrayList());
            assetCount = jsonMapper.mapToEntity(jsonMapper.mapToEntity(assetCountJson, JsonRpcResponse.class).getResult(),Integer.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
            return assetCount;
    }

    @Override
    public GxcBlock get_block(Long blockNum) {
        GxcBlock gxcBlock = null;
        try{
            List list = new ArrayList();
            list.add(blockNum);
            String blockJson = excuteRpcRequest(EnumGxcMethod.get_block.getName(),list);
            gxcBlock = jsonMapper.mapToEntity(jsonMapper.mapToEntity(blockJson, JsonRpcResponse.class).getResult(),GxcBlock.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcBlock;
    }

    @Override
    public GxcBlock get_block_by_id(String block_id) {
        GxcBlock gxcBlock = null;
        try{
            List list = new ArrayList();
            list.add(block_id);
            String blockJson = excuteRpcRequest(EnumGxcMethod.get_block_by_id.getName(),list);
            gxcBlock = jsonMapper.mapToEntity(jsonMapper.mapToEntity(blockJson, JsonRpcResponse.class).getResult(),GxcBlock.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcBlock;
    }

    @Override
    public GxcCommissionPercent get_commission_percent() {
        GxcCommissionPercent gxcCommissionPercent = null;
        try{
            String gxcCommissionPercentJson = excuteRpcRequest(EnumGxcMethod.get_commission_percent.getName(),new ArrayList());
            gxcCommissionPercent = jsonMapper.mapToEntity(jsonMapper.mapToEntity(gxcCommissionPercentJson, JsonRpcResponse.class).getResult(),GxcCommissionPercent.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcCommissionPercent;
    }

    @Override
    public GxcCommitteeMember get_committee_member(String owner_account) {
        GxcCommitteeMember gxcCommitteeMember = null;
        try{
            List list = new ArrayList();
            list.add(owner_account);
            String gxcCommissionPercentJson = excuteRpcRequest(EnumGxcMethod.get_committee_member.getName(),list);
            gxcCommitteeMember = jsonMapper.mapToEntity(jsonMapper.mapToEntity(gxcCommissionPercentJson, JsonRpcResponse.class).getResult(),GxcCommitteeMember.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcCommitteeMember;
    }

    @Override
    public List<String> get_contract_tables(String contract) {
        List<String> tables = null;
        try{
            List list = new ArrayList();
            list.add(contract);
            String gxcCommissionPercentJson = excuteRpcRequest(EnumGxcMethod.get_contract_tables.getName(),list);
            tables = jsonMapper.mapToList(jsonMapper.mapToEntity(gxcCommissionPercentJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return tables;
    }

    @Override
    public GxcDynamicGlobalProperties get_dynamic_global_properties() {
        GxcDynamicGlobalProperties gxcDynamicGlobalProperties = null;
        try{
            String gxcDynamicGlobalPropertiesJson = excuteRpcRequest(EnumGxcMethod.get_dynamic_global_properties.getName(),new ArrayList());
            gxcDynamicGlobalProperties = jsonMapper.mapToEntity(jsonMapper.mapToEntity(gxcDynamicGlobalPropertiesJson, JsonRpcResponse.class).getResult(), GxcDynamicGlobalProperties.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcDynamicGlobalProperties;
    }

    @Override
    public GxcGlobalProperties get_global_properties() {
        GxcGlobalProperties gxcGlobalProperties = null;
        try{
            String gxcGlobalPropertiesJson = excuteRpcRequest(EnumGxcMethod.get_global_properties.getName(),new ArrayList());
            gxcGlobalProperties = jsonMapper.mapToEntity(jsonMapper.mapToEntity(gxcGlobalPropertiesJson, JsonRpcResponse.class).getResult(), GxcGlobalProperties.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcGlobalProperties;
    }

    @Override
    public String get_hash(String value) {
        String hash = null;
        try{
            List list = new ArrayList();
            list.add(value);
            String hashJson = excuteRpcRequest(EnumGxcMethod.get_hash.getName(),list);
            hash = jsonMapper.mapToEntity(jsonMapper.mapToEntity(hashJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return hash;
    }

    /**
      * @Description: 根据参数查询不可逆的交易
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:33
      */
    @Override
    public GxcAccountHistoryOpe get_irreversible_account_history(String accountNameOrId, List<Integer> operateType, Integer start, Integer limitNum) {
        GxcAccountHistoryOpe gxcAccountHistoryOpe = null;
        try{
            List list = new ArrayList();
            list.add(accountNameOrId);
            list.add(operateType);
            list.add(start);
            list.add(limitNum);
            String gxcAccountHistoryOpeJson = excuteRpcRequest(EnumGxcMethod.get_irreversible_account_history.getName(),list);
            gxcAccountHistoryOpe = jsonMapper.mapToEntity(jsonMapper.mapToEntity(gxcAccountHistoryOpeJson, JsonRpcResponse.class).getResult(),GxcAccountHistoryOpe.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcAccountHistoryOpe;
    }

    @Override
    public Integer get_merchants_total_count() {
        Integer get_merchants_total_count = null;
        try{
            String get_merchants_total_count_json = excuteRpcRequest(EnumGxcMethod.get_merchants_total_count.getName(),new ArrayList());
            get_merchants_total_count = jsonMapper.mapToEntity(jsonMapper.mapToEntity(get_merchants_total_count_json, JsonRpcResponse.class).getResult(),Integer.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return get_merchants_total_count;
    }

    @Override
    public String get_object(String id) {
        String object = null;
        try{
            List list = new ArrayList();
            list.add(id);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_object.getName(),list);
            object = jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult();
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return object;
    }

    @Override
    public String get_private_key(String publicKey) {
        String privateKey = null;
        try{
            List list = new ArrayList();
            list.add(publicKey);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_private_key.getName(),list);
            privateKey = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return privateKey;
    }

    @Override
    public String get_prototype_operation(String operation_type) {
        String prototype = null;
        try{
            List list = new ArrayList();
            list.add(operation_type);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_prototype_operation.getName(),list);
            prototype = jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult();
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return prototype;
    }

    @Override
    public String get_pub_key_from_wif_key(String wif_key) {
        String pubKey = null;
        try{
            List list = new ArrayList();
            list.add(wif_key);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_pub_key_from_wif_key.getName(),list);
            pubKey = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return pubKey;
    }

    @Override
    public List<GxcAccountRecord> get_relative_account_history(String accountNameOrId, Integer start, Integer limitNum, Integer stop) {
        List<GxcAccountRecord> relateAccountHistory = null;
        try{
            List list = new ArrayList();
            list.add(accountNameOrId);
            list.add(start);
            list.add(limitNum);
            list.add(stop);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_relative_account_history.getName(),list);
            relateAccountHistory = jsonMapper.mapToList(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcAccountRecord.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return relateAccountHistory;
    }

    @Override
    public JsonNode get_table_rows(String contract, String table,Integer start, Integer limit) {
        JsonNode get_table_rows = null;
        try{
            List list = new ArrayList();
            list.add(contract);
            list.add(table);
            list.add(start);
            list.add(limit);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_table_rows.getName(),list);
            get_table_rows = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(), JsonNode.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return get_table_rows;
    }

    @Override
    public String get_transaction_id(GxcTransaction trx) {
        String transactionId = null;
        try{
            List list = new ArrayList();
            list.add(trx);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_transaction_id.getName(),list);
            transactionId = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return transactionId;
    }

    @Override
    public List<GxcVestingBalance> get_vesting_balances(String account_name) {
        List<GxcVestingBalance> gxcVestingBalanceList = null;
        try{
            List list = new ArrayList();
            list.add(account_name);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_vesting_balances.getName(),list);
            gxcVestingBalanceList = jsonMapper.mapToList(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcVestingBalance.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcVestingBalanceList;
    }

    @Override
    public GxcWitness get_witness(String owner_account) {
        GxcWitness gxcWitness = null;
        try{
            List list = new ArrayList();
            list.add(owner_account);
            String objectJson = excuteRpcRequest(EnumGxcMethod.get_witness.getName(),list);
            gxcWitness = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcWitness.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcWitness;
    }

    @Override
    public String gethelp(String command) {
        String helpJson = null;
        try{
            List list = new ArrayList();
            list.add(command);
            helpJson = excuteRpcRequest(EnumGxcMethod.gethelp.getName(),list);
        }catch (Exception e){
            logger.error( e.getMessage());
        }
        return helpJson;
    }

    @Override
    public String help() {
        String help = null;
        try{
            help = excuteRpcRequest(EnumGxcMethod.help.getName(),new ArrayList());
        }catch (Exception e){
            logger.error( e.getMessage());
        }
        return help;
    }

    @Override
    public Boolean import_account_keys(String filename, String password, String src_account_name, String dest_account_name) {
        Boolean import_account_keys = null;
        try{
            List list = new ArrayList();
            list.add(filename);
            list.add(password);
            list.add(src_account_name);
            list.add(dest_account_name);
            String objectJson = excuteRpcRequest(EnumGxcMethod.import_account_keys.getName(),list);
            import_account_keys = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),Boolean.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return import_account_keys;
    }

    /**
      * @Description: 将帐户的私钥导入到钱包(导入成功，则返回true，反之跑出其他异常返回false)
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:31
      */
    @Override
    public Boolean import_key(String accountNameOrId, String wifPrivateKey, Boolean flag) {
        Boolean import_key = null;
        try{
            List list = new ArrayList();
            list.add(accountNameOrId);
            list.add(wifPrivateKey);
            list.add(flag);
            String objectJson = excuteRpcRequest(EnumGxcMethod.import_key.getName(),list);
            import_key = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),Boolean.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return import_key;
    }

    @Override
    public GxcInfo info() {
        GxcInfo info = null;
        try{
            String infoJson = excuteRpcRequest(EnumGxcMethod.info.getName(),new ArrayList());
            info = jsonMapper.mapToEntity(jsonMapper.mapToEntity(infoJson, JsonRpcResponse.class).getResult(),GxcInfo.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }

        return info;
    }

    @Override
    public Boolean is_account_registered(String name) {
        Boolean is_account_registered = null;
        try{
            List list = new ArrayList();
            list.add(name);
            String objectJson = excuteRpcRequest(EnumGxcMethod.is_account_registered.getName(),list);
            is_account_registered = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),Boolean.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return is_account_registered;
    }

    @Override
    public Boolean is_locked() {
        Boolean is_locked = null;
        try{
            String objectJson = excuteRpcRequest(EnumGxcMethod.is_locked.getName(),new ArrayList());
            is_locked = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),Boolean.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return is_locked;
    }

    @Override
    public Boolean is_new() {
        Boolean is_new = null;
        try{
            List list = new ArrayList();
            String objectJson = excuteRpcRequest(EnumGxcMethod.is_new.getName(),list);
            is_new = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),Boolean.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return is_new;
    }

    @Override
    public Boolean is_public_key_registered(String public_key) {
        Boolean keyRegistered = null;
        try{
            List list = new ArrayList();
            list.add(public_key);
            String objectJson = excuteRpcRequest(EnumGxcMethod.is_public_key_registered.getName(),list);
            keyRegistered = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),Boolean.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return keyRegistered;
    }

    @Override
    public GxcTransaction issue_asset(String to_account, String amount, String symbol, String memo, String fee_asset_symbol, Boolean broadcast) {
        GxcTransaction issue_asset = null;
        try{
            List list = new ArrayList();
            list.add(to_account);
            list.add(amount);
            list.add(symbol);
            list.add(memo);
            list.add(fee_asset_symbol);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.issue_asset.getName(),list);
            issue_asset = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return issue_asset;
    }

    /**
      * @Description: 返回余额列表信息
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:32
      */
    @Override
    public List<GxcAccountBalance> list_account_balances(String accountNameOrId) {
        List<GxcAccountBalance> list_account_balances = null;
        try{
            List list = new ArrayList();
            list.add(accountNameOrId);
            String objectJson = excuteRpcRequest(EnumGxcMethod.list_account_balances.getName(),list);
            list_account_balances = jsonMapper.mapToList(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcAccountBalance.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return list_account_balances;
    }

    @Override
    public List<String> list_account_lock_balances(String account_id_or_name) {
        List<String> list_account_lock_balances = null;
        try{
            List list = new ArrayList();
            list.add(account_id_or_name);
            String objectJson = excuteRpcRequest(EnumGxcMethod.list_account_lock_balances.getName(),list);
            list_account_lock_balances = jsonMapper.mapToList(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return list_account_lock_balances;
    }

    @Override
    public JsonNode list_accounts(Long lowerbound, Long limit) {
        JsonNode list_accounts = null;
        try{
            List list = new ArrayList();
            list.add(lowerbound);
            list.add(limit);
            String objectJson = excuteRpcRequest(EnumGxcMethod.list_accounts.getName(),list);
            list_accounts = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),JsonNode.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return list_accounts;
    }

    @Override
    public List<GxcAsset> list_assets(Long lowerbound, Long limit) {
        List<GxcAsset> list_assets = null;
        try{
            List list = new ArrayList();
            list.add(lowerbound);
            list.add(limit);
            String objectJson = excuteRpcRequest(EnumGxcMethod.list_assets.getName(),list);
            list_assets = jsonMapper.mapToList(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcAsset.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return list_assets;
    }

    @Override
    public JsonNode list_committee_members(Long lowerbound, Long limit) {
        JsonNode list_committee_members = null;
        try{
            List list = new ArrayList();
            list.add(lowerbound);
            list.add(limit);
            String objectJson = excuteRpcRequest(EnumGxcMethod.list_committee_members.getName(),list);
            list_committee_members = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),JsonNode.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return list_committee_members;
    }

    @Override
    public List<GxcAccount> list_my_accounts() {
        List<GxcAccount> gxcAccountList = null;
        try{
            String objectJson = excuteRpcRequest(EnumGxcMethod.list_my_accounts.getName(),new ArrayList());
            gxcAccountList = jsonMapper.mapToList(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcAccount.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcAccountList;
    }

    @Override
    public JsonNode list_witnesses(Long lowerbound, Long limit) {
        JsonNode list_witnesses = null;
        try{
            List list = new ArrayList();
            list.add(lowerbound);
            list.add(limit);
            String objectJson = excuteRpcRequest(EnumGxcMethod.list_witnesses.getName(),list);
            list_witnesses = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),JsonNode.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return list_witnesses;
    }

    @Override
    public Boolean load_wallet_file(String wallet_filename) {
        String load_wallet_file = null;
        try{
            List list = new ArrayList();
            list.add(wallet_filename);
            String objectJson = excuteRpcRequest(EnumGxcMethod.load_wallet_file.getName(),list);
            load_wallet_file = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return Boolean.valueOf(load_wallet_file);
    }

    @Override
    public String lock() {
        String lock = null;
        try{
            String objectJson = excuteRpcRequest(EnumGxcMethod.lock.getName(),new ArrayList());
            lock = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return lock;
    }

    @Override
    public String normalize_brain_key(String s) {
        String normalize_brain_key = null;
        try{
            List list = new ArrayList();
            list.add(s);
            String objectJson = excuteRpcRequest(EnumGxcMethod.normalize_brain_key.getName(),list);
            normalize_brain_key = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return normalize_brain_key;
    }

    @Override
    public GxcTransaction pay_data_transaction(String from, String to, GxcAsset amount, String request_id, Boolean broadcast) {
        GxcTransaction pay_data_transaction = null;
        try{
            List list = new ArrayList();
            list.add(from);
            list.add(to);
            list.add(amount);
            list.add(request_id);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.pay_data_transaction.getName(),list);
            pay_data_transaction = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return pay_data_transaction;
    }

    @Override
    public String read_memo(GxcMemoData memo) {
        String read_memo = null;
        try{
            List list = new ArrayList();
            list.add(memo);
            String objectJson = excuteRpcRequest(EnumGxcMethod.read_memo.getName(),list);
            read_memo = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return read_memo;
    }

    @Override
    public void save_wallet_file(String wallet_filename) {
        try{
            List list = new ArrayList();
            list.add(wallet_filename);
            excuteRpcRequest(EnumGxcMethod.save_wallet_file.getName(),list);
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

    @Override
    public String serialize_proxy_transfer_params(GxcProxyTransferParams param) {
        String serialize_proxy_transfer_params = null;
        try{
            List list = new ArrayList();
            list.add(param);
            String objectJson = excuteRpcRequest(EnumGxcMethod.serialize_proxy_transfer_params.getName(),list);
            serialize_proxy_transfer_params = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return serialize_proxy_transfer_params;
    }

    @Override
    public String serialize_transaction(GxcTransaction tx) {
        String serialize_transaction = null;
        try{
            List list = new ArrayList();
            list.add(tx);
            String objectJson = excuteRpcRequest(EnumGxcMethod.serialize_transaction.getName(),list);
            serialize_transaction = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return serialize_transaction;
    }

    /**
      * @Description: 对钱包设置一个新密码。首次启动钱包，需要设置密码
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:29
      */
    @Override
    public String set_password(String newPassword) {
        String password = null;
        try{
            List list = new ArrayList();
            list.add(newPassword);
            String objectJson = excuteRpcRequest(EnumGxcMethod.set_password.getName(),list);
            password = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return password;
    }

    @Override
    public GxcTransaction set_voting_proxy(String account_to_modify, String voting_account, Boolean broadcast) {
        GxcTransaction votingProxy = null;
        try{
            List list = new ArrayList();
            list.add(account_to_modify);
            list.add(voting_account);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.set_voting_proxy.getName(),list);
            votingProxy = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return votingProxy;
    }

    @Override
    public GxcMemoData sign_memo(String from, String to, String memo) {
        GxcMemoData gxcMemoData = null;
        try{
            List list = new ArrayList();
            list.add(from);
            list.add(to);
            list.add(memo);
            String objectJson = excuteRpcRequest(EnumGxcMethod.sign_memo.getName(),list);
            gxcMemoData = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcMemoData.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcMemoData;
    }

    @Override
    public String sign_string(String wif_key, String raw_string) {
        String signStr = null;
        try{
            List list = new ArrayList();
            list.add(wif_key);
            list.add(raw_string);
            String objectJson = excuteRpcRequest(EnumGxcMethod.sign_string.getName(),list);
            signStr = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return signStr;
    }

    @Override
    public GxcTransaction sign_transaction(GxcTransaction tx, Boolean broadcast) {
        GxcTransaction gxcTransaction = null;
        try{
            List list = new ArrayList();
            list.add(tx);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.sign_transaction.getName(),list);
            gxcTransaction = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcTransaction;
    }

    @Override
    public GxcBrainKeyInfo suggest_brain_key() {
        GxcBrainKeyInfo gxcBrainKeyInfo = null;
        try{
            String objectJson = excuteRpcRequest(EnumGxcMethod.suggest_brain_key.getName(),new ArrayList());
            gxcBrainKeyInfo = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcBrainKeyInfo.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return gxcBrainKeyInfo;
    }

    @Override
    public GxcTransaction transfer(String fromAccount, String toAccount, String amount, String code, String memo, Boolean flag) {
        GxcTransaction transaction = null;
        try{
            List list = new ArrayList();
            list.add(fromAccount);
            list.add(toAccount);
            list.add(amount);
            list.add(code);
            list.add(memo);
            list.add(flag);
            String objectJson = excuteRpcRequest(EnumGxcMethod.transfer.getName(),list);
            transaction = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return transaction;
    }

    @Override
    public JsonNode transfer2(String fromAccount, String toAccount, String amount, String code, String memo) {
        JsonNode transfer2 = null;
        try{
            List list = new ArrayList();
            list.add(fromAccount);
            list.add(toAccount);
            list.add(amount);
            list.add(code);
            list.add(memo);
            String objectJson = excuteRpcRequest(EnumGxcMethod.transfer2.getName(),list);
            transfer2 = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),JsonNode.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return transfer2;
    }

    @Override
    public JsonNode transfer3(String from, String to, String amount, String asset_symbol, String memo, String fee_asset_symbol, Boolean broadcast) {
        JsonNode transfer3 = null;
        try{
            List list = new ArrayList();
            list.add(from);
            list.add(to);
            list.add(amount);
            list.add(asset_symbol);
            list.add(memo);
            list.add(fee_asset_symbol);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.transfer3.getName(),list);
            transfer3 = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),JsonNode.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return transfer3;
    }

    /**
      * @Description: 解锁钱包(若原来为解锁状态，则执行后仍然为解锁状态)
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:30
      */
    @Override
    public String unlock(String myPassword) {
        String unlock = null;
        try{
            List list = new ArrayList();
            list.add(myPassword);
            String blockJson = excuteRpcRequest(EnumGxcMethod.unlock.getName(),list);
            unlock = jsonMapper.mapToEntity(jsonMapper.mapToEntity(blockJson, JsonRpcResponse.class).getResult(),String.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return unlock;
    }

    @Override
    public GxcTransaction update_contract(String contract, String new_owner, String contract_dir, String fee_asset_symbol, Boolean broadcast) {
        GxcTransaction updateContract = null;
        try{
            List list = new ArrayList();
            list.add(contract);
            list.add(new_owner);
            list.add(contract_dir);
            list.add(fee_asset_symbol);
            list.add(broadcast);
            String objectJson = excuteRpcRequest(EnumGxcMethod.update_contract.getName(),list);
            updateContract = jsonMapper.mapToEntity(jsonMapper.mapToEntity(objectJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return updateContract;
    }

    @Override
    public GxcTransaction update_witness(String witness_name, String url, String block_signing_key, String fee_asset_symbol, Boolean broadcast) {
        GxcTransaction upgradeWitness = null;
        try{
            List list = new ArrayList();
            list.add(witness_name);
            list.add(url);
            list.add(block_signing_key);
            list.add(fee_asset_symbol);
            list.add(broadcast);
            String upgradeWitnessJson = excuteRpcRequest(EnumGxcMethod.update_witness.getName(),list);
            upgradeWitness = jsonMapper.mapToEntity(jsonMapper.mapToEntity(upgradeWitnessJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return upgradeWitness;
    }

    @Override
    public GxcTransaction upgrade_account(String name, String asset_symbol, Boolean broadcast) {
        GxcTransaction upgradeAccount = null;
        try{
            List list = new ArrayList();
            list.add(name);
            list.add(asset_symbol);
            list.add(broadcast);
            String upgradeAccountJson = excuteRpcRequest(EnumGxcMethod.upgrade_account.getName(),list);
            upgradeAccount = jsonMapper.mapToEntity(jsonMapper.mapToEntity(upgradeAccountJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return upgradeAccount;
    }

    @Override
    public Boolean verify_proxy_transfer_signature(GxcProxyTransferParams param, String pub_key) {
        Boolean verifyProxyTransferSignature = null;
        try{
            List list = new ArrayList();
            list.add(param);
            list.add(pub_key);
            String verifyTransactionSignatureJson = excuteRpcRequest(EnumGxcMethod.verify_proxy_transfer_signature.getName(),list);
            verifyProxyTransferSignature = jsonMapper.mapToEntity(jsonMapper.mapToEntity(verifyTransactionSignatureJson, JsonRpcResponse.class).getResult(),Boolean.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return verifyProxyTransferSignature;
    }

    @Override
    public Boolean verify_transaction_signature(GxcTransaction trx, String pub_key) {
        Boolean verifyTransactionSignature = null;
        try{
            List list = new ArrayList();
            list.add(trx);
            list.add(pub_key);
            String verifyTransactionSignatureJson = excuteRpcRequest(EnumGxcMethod.verify_transaction_signature.getName(),list);
            verifyTransactionSignature = jsonMapper.mapToEntity(jsonMapper.mapToEntity(verifyTransactionSignatureJson, JsonRpcResponse.class).getResult(),Boolean.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return verifyTransactionSignature;
    }

    @Override
    public GxcTransaction vote_for_witness(String voting_account, String witness, Boolean approve, Boolean broadcast) {
        GxcTransaction voteForWitness = null;
        try{
            List list = new ArrayList();
            list.add(voting_account);
            list.add(witness);
            list.add(approve);
            list.add(broadcast);
            String voteForWitnessJson = excuteRpcRequest(EnumGxcMethod.vote_for_witness.getName(),list);
            voteForWitness = jsonMapper.mapToEntity(jsonMapper.mapToEntity(voteForWitnessJson, JsonRpcResponse.class).getResult(),GxcTransaction.class);
        }catch (JsonRpcLayerException e){
            logger.error(e.getCode() + e.getMessage());
        }
        return voteForWitness;
    }

    /**
      * @Description: 组装jsonRpc 请求参数
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:43
      */
    private String excuteRpcRequest(String method, List param){
        JsonRpcRequest jsonRpcRequest = new JsonRpcRequest();
        jsonRpcRequest.setId(getNewId());
        jsonRpcRequest.setJsonrpc(Constants.JSON_RPC_VERSION);
        jsonRpcRequest.setMethod(method);
        jsonRpcRequest.setParams(param);

        return restTemplate.postForObject(Constants.URL,jsonRpcRequest,String.class);
    }

    /**
      * @Description: 获取随机id
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-22 21:43
      */
    protected String getNewId() {
        return String.valueOf(1 + (int)(Math.random()*Integer.MAX_VALUE));
    }

}

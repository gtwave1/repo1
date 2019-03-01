package cn.suyuan.item.service;

import cn.suyuan.common.utils.SYResult;
import cn.suyuan.dao.pojo.Item;

/**
 * @Auther: YunHai
 * @Date: 2019/2/1 18:29
 * @Description: 商品信息服务
 */
public interface ItemService {

    /**
     * 通过id获取指定商品信息
     * @param itemId
     * @return
     */
    Item getItemById(String itemId);

    /**
     * 通过商品id 删除对应的商品信息
     * @param itemId
     * @return
     */
    SYResult deleteItemById(String itemId);



}

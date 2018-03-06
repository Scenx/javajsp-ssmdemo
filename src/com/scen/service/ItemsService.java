package com.scen.service;

import com.scen.domain.Items;

import java.util.List;

/**
 * @author Scen
 * @date 2018/3/5 22:26
 */
public interface ItemsService {
    /**
     * 查询所有商品
     * @return
     */
    List<Items> findAll();

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    Items findById(Integer id);

    /**
     * 保存或者修改商品
     * @param items
     */
    void saveOrUpdate(Items items);

    /**
     * 根据id删除商品
     * @param id
     */
    void deleteByID(Integer id);
}

package com.scen.service.impl;

import com.scen.dao.ItemsMapper;
import com.scen.domain.Items;
import com.scen.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Scen
 * @date 2018/3/5 22:27
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Resource
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAll() {
        List<Items> list = itemsMapper.findAll();
        return list;
    }

    @Override
    public Items findById(Integer id) {
        Items items = itemsMapper.selectByPrimaryKey(id);
        return items;
    }

    @Override
    public void saveOrUpdate(Items items) {
        itemsMapper.updateByPrimaryKey(items);
    }

    @Override
    public void deleteByID(Integer id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}

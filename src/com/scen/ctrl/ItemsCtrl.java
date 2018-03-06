package com.scen.ctrl;

import com.scen.domain.Items;
import com.scen.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Scen
 * @date 2018/3/5 22:29
 */
@Controller
@RequestMapping("/items")
public class ItemsCtrl {


    @Resource
    private ItemsService itemsService;

    /**
     * 查询所有商品
     *
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String list(Model model) {
        List<Items> list = itemsService.findAll();
        model.addAttribute("itemsList", list);
        return "itemsList";
    }

    /**
     * 到修改商品页面
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("edit")
    public String edit(Integer id, Model model) {
        Items items = itemsService.findById(id);
        model.addAttribute("item", items);
        return "editItem";
    }

    /**
     * 保存或者修改商品
     *
     * @param items
     * @return
     */
    @RequestMapping("saveOrUpdate")
    public String saveOrUpdate(Items items) {
        itemsService.saveOrUpdate(items);
        return "redirect:list.scen";
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @RequestMapping("deleteByID")
    public String deleteByID(Integer id) {
        itemsService.deleteByID(id);
        return "redirect:list.scen";
    }

    /**
     * 批量删除
     * @param id
     * @return
     */
    @RequestMapping("deleteByIds")
    public String deleteByIds(Integer[] id) {
        for (Integer ids : id) {
            itemsService.deleteByID(ids);
        }
        return "redirect:list.scen";
    }
}

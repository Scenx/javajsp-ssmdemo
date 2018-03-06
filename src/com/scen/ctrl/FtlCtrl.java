package com.scen.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Scen
 * @date 2018/3/6 15:15
 */
@Controller
@RequestMapping("/ftl")
public class FtlCtrl {
    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("hello", "页面静态化");
        return "ftl";
    }
}

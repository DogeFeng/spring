package com.ytinf.action;

import com.ytinf.util.action.AbstractAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages/admin/goods/*")
public class GoodsAction extends AbstractAction {
    @GetMapping("goods_add")
    public String addPre(){
        return "admin/goods/goods_add";
    }
    @PostMapping("goods_add_do")
    public String add(){
        return "admin/goods/goods_list";
    }
}

package com.ytinf.action;

import com.ytinf.util.action.AbstractAction;
import com.ytinf.vo.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/pages/admin/goods/*")
public class GoodsAction extends AbstractAction {
    @GetMapping("goods_add")
    public String addPre(){
        return super.getMessage("goods.add");
    }
    @PostMapping("goods_add_do")
    public String add(Goods vo, MultipartFile photo){
        vo.setPhotoName(super.upload(photo));
        System.out.println(vo + "vo======");
        return super.getMessage("goods.add");
    }
}

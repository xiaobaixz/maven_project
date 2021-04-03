package cn.itcast.ssm.controller;


import cn.itcast.ssm.pojo.Item;
import cn.itcast.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    // 根据id查询item
    // {id}这种写法可以直接获取url中的id值，非常的方便
    @RequestMapping("showItem/{id}")
    public String findByid(@PathVariable("id") int id, Model model){
        Item item = itemService.findById(id);   // 拿到数据库中值
        model.addAttribute("item" ,item);
        return "item";  // 跳转页面
    }
}

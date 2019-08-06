/**
 * 
 */
package com.cg.mvc.controller;
/**
 * @author Smita Brijesh
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.mvc.model.Item;
import com.cg.mvc.service.ItemService;
import com.cg.mvc.utils.Utils;
@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    @Autowired
    ItemService itemService;
    @RequestMapping(method = RequestMethod.GET)
    public String springMVC(ModelMap modelMap) {
        List items = itemService.getItems();
        modelMap.addAttribute("itemList", items);
        modelMap.addAttribute("msg", "Welcome to Spring MVC");
        System.out.println(items);
        return "index";
    }
    @RequestMapping(value = "/addPage", method = RequestMethod.GET)
    public String addPage() {
        return "add";
    }
    //create -C of CRUD
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addItem(@RequestParam("name") String name,
            @RequestParam("price") String price, ModelMap modelMap) {
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("price", price);
        if (name == null || name.trim().isEmpty()) {
            modelMap.addAttribute("error", "Item Name is required!");
        } else if (price == null || price.trim().isEmpty()) {
            modelMap.addAttribute("error", "Item Price is required!");
        } else if (Utils.isStringNumeric(price)) {
            modelMap.addAttribute("error",
                    "Item Price cannot contain character(s)!");
        } else {
            Item item = new Item();
            item.setItemName(name);
            item.setItemPrice(Double.valueOf(price));
            itemService.addItem(item);//create-C of CRUD
            modelMap.addAttribute("success", "Item successfully added!");
        }
        return "add";
    }
}
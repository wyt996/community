package cn.wyt.community.community;
/**
 * @Author: wuyunting
 * @Description:
 * @Date: Create in 22:12 2019/9/19
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author     ：wuyunting
 * @date       ：Created in 2019/9/19 22:12
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",defaultValue = "wyt") String name, Model model) {
//        name = "wyt";
        model.addAttribute("name", name);
        return "index";
    }

}
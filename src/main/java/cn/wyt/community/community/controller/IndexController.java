package cn.wyt.community.community.controller;
/**
 * @Author: wuyunting
 * @Description:
 * @Date: Create in 21:08 2019/9/21
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author     ：wuyunting
 * @date       ：Created in 2019/9/21 21:08
 * @description：首页
 * @modified By：
 * @version: 0.10$
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){

        return "/index";
    }
}

package analysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 反欺诈接口数据实体类
 *
 * @author liuheng
 * @version 1.0
 * @since 2018/09/18
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/show")
    @ResponseBody
    public String showTest(){
        return "hello";
    }

    @RequestMapping("/login")
    public String login(){
        return "signup/login";
    }

}

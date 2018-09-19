package analysis.controller;

import analysis.dto.UserDO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * 反欺诈接口数据实体类
 *
 * @author liuheng
 * @version 1.0
 * @since 2018/09/18
 */
@Controller
public class UserController {

    @GetMapping("/")
    public String home(){
        return "login";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

}
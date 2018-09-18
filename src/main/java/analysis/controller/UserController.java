package analysis.controller;

import analysis.dto.UserDTO;
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
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(final UserDTO userDTO,final HttpSession session){

        return "dashboard";
    }
}
package analysis.interceptor;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录验证拦截器
 * @auther elio
 * @date 2018/9/18
 */
public class SigninInterceptor extends HandlerInterceptorAdapter {

    private static final String USER_SEESION_KEY = "user_key";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute(SigninInterceptor.USER_SEESION_KEY) != null) {
            return true;
        }
        response.sendRedirect("/login");
        return false;
    }

}


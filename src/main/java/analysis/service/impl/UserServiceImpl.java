package analysis.service.impl;

import analysis.dao.UserDao;
import analysis.dto.UserDO;
import analysis.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @auther elio
 * @date 2018/9/19
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

//    @Autowired
    private UserDao dao;

    @Override
    public UserDO findUserByName(String name) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}

package analysis.service;

import analysis.dto.UserDO;

public interface UserService {

    UserDO findUserByName(String name);

}

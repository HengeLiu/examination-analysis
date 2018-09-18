package analysis.dao;

import analysis.dto.UserDTO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select * from user where name = #{name} and password = #{password}")
    UserDTO selectUser(UserDTO user);
}

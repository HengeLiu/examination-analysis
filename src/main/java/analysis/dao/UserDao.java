package analysis.dao;

import analysis.dto.UserDO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select * from user where name = #{name}")
    UserDO selectUser(String name);
}

package analysis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * 数据源配置
 * @author elio
 * @version 1.0
 * @since 2018/09/19
 */
//@Configuration
public class DatabaseConfig {

    public static String URL            = "datasource.url"          ,
                         USERNAME       = "datasource.username"     ,
                         PASSWORD       = "datasource.password"     ,
                         DRIVER         = "datasource.driver-name"  ,
                         INITIAL_SIZE   = "datasource.initial-size" ,
                         MAX_SIZE       = "datasource.minimum-size" ,
                         MIN_SIZE       = "datasource.maximum-size" ,
                         MAX_WAIT       = "datasource.maximum-wait" ;


    @Autowired
    private Environment environment;

    @Bean(name = "dataSource")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(environment.getProperty(DRIVER));
        dataSource.setUrl(environment.getProperty(URL));
        dataSource.setUsername(environment.getProperty(USERNAME));
        dataSource.setPassword(environment.getProperty(PASSWORD));
        dataSource.setInitialSize(environment.getProperty(INITIAL_SIZE,Integer.class, 2));
        dataSource.setMinIdle(environment.getProperty(MAX_SIZE,Integer.class, 2));
        dataSource.setMaxActive(environment.getProperty(MIN_SIZE,Integer.class,20));
        dataSource.setMaxWait(environment.getProperty(MAX_WAIT, Long.class, 30000L));
        return dataSource;
    }

}

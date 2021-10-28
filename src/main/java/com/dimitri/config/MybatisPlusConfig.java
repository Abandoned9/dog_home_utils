package com.dimitri.config;

import lombok.Data;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import java.io.IOException;
import java.io.InputStream;


/**
 * @author DimitriYoon
 * @since 2021/10/28 11:11
 */
@Data
public class MybatisPlusConfig {
    private static SqlSessionFactory SQL_SESSION_FACTORY;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * 构建 SqlSessionFactoryBuilder 对象
    */
    public static SqlSession getSqlSession(){
        return SQL_SESSION_FACTORY.openSession();
    }
}

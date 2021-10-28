package com.dimitri.service;

import com.dimitri.config.MybatisPlusConfig;
import com.dimitri.mapper.DogLogMapper;
import org.apache.ibatis.session.SqlSession;

public class DogLogService {

    public String randomGetOneDogLog() {
        SqlSession session = MybatisPlusConfig.getSqlSession();
        DogLogMapper mapper = session.getMapper(DogLogMapper.class);
        String message = mapper.randomGetOneDogLog();
        session.commit();
        session.close();
        return message;
    }
}

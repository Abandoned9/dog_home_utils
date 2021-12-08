package com.dimitri.mapper;

import com.dimitri.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author DimitriYoon
 * @since 2021/11/16 12:39
 */
public interface UserMapper {
    User getUserInfo(@Param("qq") Integer qq);
    Integer lockIsWork(Integer qq);
    Integer unLockWord(Integer qq);
    Integer updateUserMoney(@Param("qq") Integer qq,@Param("allMoney") Integer allMoney);
    Integer getAllMoney(@Param("qq") Integer qq);
    Integer createUser(Integer qq);
}

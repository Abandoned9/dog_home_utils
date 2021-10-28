package com.dimitri.service;

import com.dimitri.entity.DogLogEntity;

import java.sql.*;

public class DogLogService {
    private static final String driveName = "org.sqlite.JDBC";

    public String randomGetOneDogLog() throws ClassNotFoundException, SQLException {
        Class.forName(driveName);
        Connection connection = DriverManager.getConnection("jdbc:sqlite:"+System.getProperty("user.dir")+"\\data\\dog_home_utils\\doglog.db");
        Statement state = connection.createStatement();
        ResultSet resultSet = state.executeQuery("SELECT * FROM dog_log ORDER BY RANDOM() limit 1");
        DogLogEntity dogLogEntity = new DogLogEntity();
        while (resultSet.next()){
            dogLogEntity.setDogLog(resultSet.getString("dog_log"));
        }
        resultSet.close();
        connection.close();
        return dogLogEntity.getDogLog();
    }
}

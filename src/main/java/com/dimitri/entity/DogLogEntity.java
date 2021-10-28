package com.dimitri.entity;

public class DogLogEntity {
    private Integer id;
    private String dogLog;

    public DogLogEntity() {
    }

    public DogLogEntity(String dogLog) {
        this.dogLog = dogLog;
    }

    public DogLogEntity(Integer id) {
        this.id = id;
    }

    public DogLogEntity(Integer id, String dogLog) {
        this.id = id;
        this.dogLog = dogLog;
    }

    @Override
    public String toString() {
        return "DogLogEntity{" +
                "id=" + id +
                ", dogLog='" + dogLog + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDogLog() {
        return dogLog;
    }

    public void setDogLog(String dogLog) {
        this.dogLog = dogLog;
    }
}

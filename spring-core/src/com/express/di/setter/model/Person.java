package com.express.di.setter.model;

import java.util.List;
import java.util.Map;

public class Person {

    private String name;
    private int houseNo;
    private Family family;
    private Job job;

    private List<String> favColors;
    private Map<String, String> importantNumbers;

    public void setFavColors(List<String> favColors) {
        this.favColors = favColors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setImportantNumbers(Map<String, String> importantNumbers) {
        this.importantNumbers = importantNumbers;
    }

    public void display(){
        System.out.println(name + " : " + houseNo + " : " + family + " : " + job + " : " + importantNumbers + " : " +
                favColors);
    }

}
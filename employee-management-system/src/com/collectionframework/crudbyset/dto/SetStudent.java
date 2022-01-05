package com.collectionframework.crudbyset.dto;

public class SetStudent{

    private int id;
    private String name;
    private String address;
    private long phoneNum;

    public SetStudent(int id, String name, String address, long phoneNum){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String toString(){
        return id + " " + name + " " + address + " " + phoneNum;
    }
}

package com.manoshi.uniclubz.Model;

public class Data {
    String title;
    String description;
    String name;
    String date;

    String id;
    String time;

    public Data(){

    }

    public Data(String title, String description, String name, String date, String id, String time) {
        this.title = title;
        this.description = description;
        this.name = name;
        this.date = date;
        this.id = id;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

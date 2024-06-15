package com.example.vlad;

public class ItemList {

    int time,numberGuests,cal_1,cal_2;
    String name, comments;


    public ItemList (int time, String name, int numberGuests, int cal_1, int cal_2, String comments){
        this.time = time;
        this.name = name;
        this.numberGuests = numberGuests;
        this.cal_1 = cal_1;
        this.cal_2 = cal_2;
        this.comments = comments;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCal_1() {
        return cal_1;
    }

    public void setCal_1(int cal_1) {
        this.cal_1 = cal_1;
    }

    public int getCal_2() {
        return cal_2;
    }

    public void setCal_2(int cal_2) {
        this.cal_2 = cal_2;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

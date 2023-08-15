package com.example.mobileapp.entity;

public class Order {
    private int id;
    private int uid;
    private int mid;

    public Order() {
    }

    public Order(int id, int uid, int mid) {
        this.id = id;
        this.uid = uid;
        this.mid = mid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", uid=" + uid +
                ", mid=" + mid +
                '}';
    }
}

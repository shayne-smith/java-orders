package com.lambdaschool.javaorders.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;

    @Column(nullable = false)
    private double advanceamount;
    private double ordamount;
    private String orderdescription;
    private long custcode;

    public Order() {
    }

    public Order(double advanceamount, double ordamount, String orderdescription, long custcode) {
        this.advanceamount = advanceamount;
        this.ordamount = ordamount;
        this.orderdescription = orderdescription;
        this.custcode = custcode;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public long getCustcode() {
        return custcode;
    }

    public void setCustcode(long custcode) {
        this.custcode = custcode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordnum=" + ordnum +
                ", advanceamount=" + advanceamount +
                ", ordamount=" + ordamount +
                ", orderdescription='" + orderdescription + '\'' +
                ", custcode=" + custcode +
                '}';
    }
}

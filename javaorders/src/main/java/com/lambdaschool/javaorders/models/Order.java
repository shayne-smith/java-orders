package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;

    @Column(nullable = false)
    private double advanceamount;
    private double ordamount;
    private String orderdescription;

    @ManyToOne()
    @JoinColumn(name = "custcode")
    private Customer customer;

    public Order() {
    }

    public Order(double advanceamount, double ordamount, String orderdescription, Customer customer) {
        this.advanceamount = advanceamount;
        this.ordamount = ordamount;
        this.orderdescription = orderdescription;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordnum=" + ordnum +
                ", advanceamount=" + advanceamount +
                ", ordamount=" + ordamount +
                ", orderdescription='" + orderdescription + '\'' +
                ", customer=" + customer +
                '}';
    }
}

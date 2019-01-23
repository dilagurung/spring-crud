package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by oa on 1/21/2019.
 */
@Entity
public class Product {


    @Id
    private Long id;

    @Column
    private String prdouctName;

    @Column
    private Double price;
    @Column
    private Date mfdDate;
    @Column
    private Date expiryDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrdouctName() {
        return prdouctName;
    }

    public void setPrdouctName(String prdouctName) {
        this.prdouctName = prdouctName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getMfdDate() {
        return mfdDate;
    }

    public void setMfdDate(Date mfdDate) {
        this.mfdDate = mfdDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}

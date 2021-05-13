package com.hailin.entity;

import org.springframework.stereotype.Component;

/*
@Name: SaleRate
@Author: zhouhailin
@Date: 2021/5/13
@Time: 7:50 下午
@Description： 
*/
@Component
public class SaleRate {

    private Integer item_id;
    private float value;

    public SaleRate() {
    }

    @Override
    public String toString() {
        return "SaleRate{" +
                "item_id=" + item_id +
                ", value=" + value +
                '}';
    }

    public SaleRate(Integer item_id, float value) {
        this.item_id = item_id;
        this.value = value;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}

package net.epam.study.entity;

import java.math.BigDecimal;
import java.util.List;

public class Bill {

    @Override
    public String toString() {
        return "Bill [" +
                "Bill Id = " + id +
                ", Product Name = " + name +
                ", Price = " + "$" + price +
                ']';
    }

    private final int id;
    private final String name;
    private final BigDecimal price;

    public Bill(int id, String name, BigDecimal price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

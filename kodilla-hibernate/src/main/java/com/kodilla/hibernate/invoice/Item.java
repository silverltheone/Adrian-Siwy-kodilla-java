package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private Product product;
    private BigDecimal prize;
    private int quantity;
    private BigDecimal value;

    public Item() {
    }

    public Item(Product product, BigDecimal prize, int quantity, BigDecimal value) {
        this.product = product;
        this.prize = prize;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "NAME_ID", unique = true)
    public int getId() {
        return id;
    }

    @OneToMany()
    public Product getProduct() {
        return product;
    }

    @NotNull
    @Column(name = "ITEM_PRIZE")
    public BigDecimal getPrize() {
        return prize;
    }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    private void setPrize(BigDecimal prize) {
        this.prize = prize;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }
}

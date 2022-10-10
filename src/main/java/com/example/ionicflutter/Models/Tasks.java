package com.example.ionicflutter.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Tasks")
public class Tasks {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="itemName", nullable = false)
    private String itemName;

    @Column(name ="itemDueDate", nullable = false)
    private Date itemDueDate;

    @Column(name ="itemPeriority", nullable = false)
    private String itemPeriority;

    @Column(name ="itemCategory", nullable = false)
    private String itemCategory;

    public Tasks() {
    }

    public Tasks(String itemName, Date itemDueDate, String itemPeriority, String itemCategory) {
        this.itemName = itemName;
        this.itemDueDate = itemDueDate;
        this.itemPeriority = itemPeriority;
        this.itemCategory = itemCategory;
    }

    public Tasks(long id, String itemName, Date itemDueDate, String itemPeriority, String itemCategory) {
        this.id = id;
        this.itemName = itemName;
        this.itemDueDate = itemDueDate;
        this.itemPeriority = itemPeriority;
        this.itemCategory = itemCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getItemDueDate() {
        return itemDueDate;
    }

    public void setItemDueDate(Date itemDueDate) {
        this.itemDueDate = itemDueDate;
    }

    public String getItemPeriority() {
        return itemPeriority;
    }

    public void setItemPeriority(String itemPeriority) {
        this.itemPeriority = itemPeriority;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }
    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemDueDate=" + itemDueDate +
                ", itemPeriority='" + itemPeriority + '\'' +
                ", itemCategory='" + itemCategory + '\'' +
                '}';
    }

}

package com.menu.service1.menu_microservice.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false,name="item_name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id")

    private Menu menu;
    private Float price;
    @Column(nullable = false,name = "item_description")
    private String description;
    @Column(nullable = false,name = "item_image")
    @Lob
    private String image;
    @Column(nullable = false,name = "update_on")
    private LocalDate updatedDate;

    public Item() {}

    public Item(String name, Menu menu, Float price, String description, String image, LocalDate updatedDate) {
        this.name = name;
        this.menu = menu;
        this.price = price;
        this.description = description;
        this.image = image;
        this.updatedDate = updatedDate;
    }

    public Item(Integer id, String name, Menu menu, Float price, String description, String image,
            LocalDate updatedDate) {
        this.id = id;
        this.name = name;
        this.menu = menu;
        this.price = price;
        this.description = description;
        this.image = image;
        this.updatedDate = updatedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

}

package com.edsoft.ed.soft.data;

import com.edsoft.ed.soft.model.Category;
import com.edsoft.ed.soft.model.MenuItemTranslation;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
@Data
public class MenuItem {

    public MenuItem() {}

    public MenuItem(Long id, List<MenuItemTranslation> translations, BigDecimal price, Category category) {
        Id = id;
        this.price = price;
        this.translations = translations;
        this.category = category;
    }

    public MenuItem(Category category, List<MenuItemTranslation> translations, BigDecimal price) {
        this.category = category;
        this.translations = translations;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private BigDecimal price;

    @OneToMany(mappedBy = "menuItem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MenuItemTranslation> translations = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<MenuItemTranslation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<MenuItemTranslation> translations) {
        this.translations = translations;
    }
}

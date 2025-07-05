package com.edsoft.ed.soft.controller;

import com.edsoft.ed.soft.model.MenuItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuController {

    @GetMapping
    public ResponseEntity<List<MenuItem>> getMenu() {
        List<MenuItem> menuItems = List.of(
                new MenuItem("Mezeler", "Normal mezelerin hepsinin fiyatı aynıdır.", new BigDecimal("200")),
                new MenuItem("Deniz Mah. Mezeler", "Deniz Mahsullü mezelerin hepsinin fiyatı aynıdır.", new BigDecimal("350")),

                new MenuItem("Kalamar", "Taze günlük kalamar", new BigDecimal("700")),
                new MenuItem("Karides", "Tereyağında yapılmış karides", new BigDecimal("700")),
                new MenuItem("Yaprak Ciğer", "Güveç yaprak ciğer", new BigDecimal("600")),
                new MenuItem("Kokoreç", "", new BigDecimal("600")),
                new MenuItem("Sigara Böreği", "", new BigDecimal("200")),
                new MenuItem("Paçanga", "Tanesinin fiyatıdır", new BigDecimal("200")),

                new MenuItem("Yeşil Salata", "Normal=150, Duble=300", new BigDecimal("150")),
                new MenuItem("Çoban Salata", "Normal=150, Duble=300", new BigDecimal("150")),
                new MenuItem("Peynirli Salata", "Normal=250, Duble=450", new BigDecimal("250")),

                new MenuItem("Antrikot", "", new BigDecimal("700")),
                new MenuItem("Kuzu Lokum", "", new BigDecimal("600")),
                new MenuItem("Kuzu Şiş", "", new BigDecimal("500")),
                new MenuItem("Izgara Köfte", "", new BigDecimal("450")),
                new MenuItem("Güveç Kavurma", "", new BigDecimal("850")),
                new MenuItem("Pirzola", "", new BigDecimal("700")),
                // Balık için fiyat boş, null yapabiliriz
                new MenuItem("Balık", "", null),

                new MenuItem("Tuborg & Carslberg", "", new BigDecimal("200")),
                new MenuItem("Sol", "", new BigDecimal("250")),

                new MenuItem("Rakı", "Göbek 20cl", new BigDecimal("1000")),
                new MenuItem("Rakı", "Göbek 35cl", new BigDecimal("1400")),
                new MenuItem("Rakı", "Göbek 50cl", new BigDecimal("1800")),
                new MenuItem("Rakı", "Göbek 70cl", new BigDecimal("2200")),
                new MenuItem("Rakı", "Göbek 100cl", new BigDecimal("2600")),

                new MenuItem("Rakı", "Mavi 20cl", new BigDecimal("900")),
                new MenuItem("Rakı", "Mavi 35cl", new BigDecimal("1300")),
                new MenuItem("Rakı", "Mavi 50cl", new BigDecimal("1600")),
                new MenuItem("Rakı", "Mavi 70cl", new BigDecimal("2000")),
                new MenuItem("Rakı", "Mavi 100cl", new BigDecimal("2300")),

                new MenuItem("Rakı Tek", "", new BigDecimal("400")),
                new MenuItem("Rakı Duble", "", new BigDecimal("600")),

                new MenuItem("Şarap Çeşitleri", "Red & Rose & White 70cl", new BigDecimal("15000")),
                new MenuItem("Şarap Beyaz", "Carnet Savvignon White", new BigDecimal("17500")),

                new MenuItem("Şarap Kadeh", "", new BigDecimal("400"))
        );

        return ResponseEntity.ok(menuItems);
    }
}

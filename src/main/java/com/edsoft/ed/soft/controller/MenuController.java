package com.edsoft.ed.soft.controller;

import com.edsoft.ed.soft.model.Category;
import com.edsoft.ed.soft.model.MenuItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = {"http://localhost:4200",
                        "https://terasotelmenugo.up.railway.app"})
public class MenuController {

    @GetMapping
    public ResponseEntity<List<MenuItem>> getMenu(@RequestParam(defaultValue = "TR") String lang) {
        List<MenuItem> menuItems = null;

            if (lang.equalsIgnoreCase("TR")) {
                menuItems = List.of(
                        new MenuItem("Mezeler", "Yeşil Erikli Cacıki, Kabak Çiçeği Dolması, Deniz Börülcesi, Kabaklı Girit, Çıtır Susamlı Soya Soslu Beybi Mantar, Izgara Hellim, Peynirli Cevizli Köz Kapya Biber vs.", new BigDecimal("300"), Category.Appetizers),
                        new MenuItem("Deniz Mah. Mezeler", "Lakerda, Karışık Ahtapotlu Salata, Uskumru Çiroz vs.", new BigDecimal("400"), Category.Appetizers),
                        new MenuItem("Peynir", "Adet", new BigDecimal("200"), Category.Appetizers),
                        new MenuItem("Patlıcan Söğürme", "Yöresel patlıcan mezesi", new BigDecimal("400"), Category.Appetizers),

                        new MenuItem("Kalamar", "Günlük taze kalamar tava.", new BigDecimal("900"), Category.HotStarters),
                        new MenuItem("Karides", "Zakkum özel soslu, tereyağlı sote karides", new BigDecimal("1100"), Category.HotStarters),
                        new MenuItem("Yaprak Ciğer", "Izgara usulü yaprak ciğer.", new BigDecimal("850"), Category.HotStarters),
                        new MenuItem("Kokoreç", "İzmir usulü ızgara kokoreç", new BigDecimal("950"), Category.HotStarters),
                        new MenuItem("Sigara Böreği", "Bergama tulumu ve kaşar loru dolgulu", new BigDecimal("350"), Category.HotStarters),
                        new MenuItem("Paçanga", "Pastırmalı kaşar peynirli sebzeli börek", new BigDecimal("300"), Category.HotStarters),

                        new MenuItem("Yeşil Salata", "Normal: 250 TL, Duble: 500 TL", new BigDecimal("500"), Category.Salads),
                        new MenuItem("Çoban Salata", "Normal: 250 TL, Duble: 500 TL", new BigDecimal("500"), Category.Salads),
                        new MenuItem("Peynirli Salata", "Normal: 250 TL, Duble: 500 TL", new BigDecimal("500"), Category.Salads),

                        new MenuItem("Antrikot", "Izgara antrikot, yumuşak ve sulu.", new BigDecimal("950"), Category.MainCourses),
                        new MenuItem("Kuzu Lokum", "Lokum kıvamında kuzu eti.", new BigDecimal("850"), Category.MainCourses),
                        new MenuItem("Kuzu Şiş", "Şişte kuzu et spesiyali.", new BigDecimal("800"), Category.MainCourses),
                        new MenuItem("Izgara Köfte", "Ev yapımı dana köfte.", new BigDecimal("700"), Category.MainCourses),
                        new MenuItem("Çipura", "Taze deniz balığı", new BigDecimal("1000"), Category.MainCourses),
                        new MenuItem("Sardalya", "Taze deniz balığı", new BigDecimal("750"), Category.MainCourses),
                        //new MenuItem("Güveç Kavurma", "Toprak güveçte dana kavurma.", new BigDecimal("850"), Category.MainCourses),
                        new MenuItem("Pirzola", "Izgarada pişirilmiş kuzu pirzola.", new BigDecimal("950"), Category.MainCourses),
                        new MenuItem("Levrek", "Taze deniz balığı", new BigDecimal("1000"), Category.MainCourses),

                        new MenuItem("Cola & Sprite", "", new BigDecimal("200"), Category.SoftDrinks),
                        new MenuItem("Soda", "", new BigDecimal("200"), Category.SoftDrinks),
                        new MenuItem("Redbull", "", new BigDecimal("250"), Category.SoftDrinks),
                        new MenuItem("Ayran", "", new BigDecimal("100"), Category.SoftDrinks),
                        new MenuItem("Büyük Su", "", new BigDecimal("150"), Category.SoftDrinks),

                        new MenuItem("Tuborg & Carlsberg", "Şişe bira çeşitleri.", new BigDecimal("300"), Category.Beer),
                        new MenuItem("Sol", "Meksika menşeli bir ale bira.", new BigDecimal("300"), Category.Beer),

                        new MenuItem("Rakı", "Beylerbeyi Göbek 20 cl.", new BigDecimal("1500"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Göbek 35 cl.", new BigDecimal("1900"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Göbek 50 cl.", new BigDecimal("2750"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Göbek 70 cl.", new BigDecimal("3250"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Göbek 100 cl.", new BigDecimal("4000"), Category.Raki),

                        new MenuItem("Rakı", "Beylerbeyi Mavi 20 cl.", new BigDecimal("1100"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Mavi 35 cl.", new BigDecimal("1350"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Mavi 50 cl.", new BigDecimal("2000"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Mavi 70 cl.", new BigDecimal("2500"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Mavi 100 cl.", new BigDecimal("3000"), Category.Raki),

                        new MenuItem("Rakı Tek", "Standart 4 cl servis.", new BigDecimal("400"), Category.Raki),
                        new MenuItem("Rakı Duble", "Büyük boy 8 cl servis.", new BigDecimal("600"), Category.Raki),

                        new MenuItem("Şarap Çeşitleri", "Red, Rosé ve White – 70 cl.", new BigDecimal("1500"), Category.Wine),
                        new MenuItem("Şarap Beyaz", "Cabernet Sauvignon White – 70 cl.", new BigDecimal("1500"), Category.Wine),
                        new MenuItem("Şarap Kadeh", "Kadeh servis, kırmızı veya beyaz.", new BigDecimal("500"), Category.Wine)
                );
            } else if (lang.equalsIgnoreCase("EN")) {
                menuItems = List.of(
                        new MenuItem("Appetizer Mix",  "Caciki with Green Plums, Stuffed Zucchini Blossoms, Samphire Salad, Cretan Style Zucchini, Crispy Baby Mushrooms with Sesame & Soy Sauce, Grilled Halloumi, Roasted Red Peppers with Cheese & Walnuts, etc.",  new BigDecimal("300"), Category.Appetizers),
                        new MenuItem("Seafood Appetizers", "Lakerda, Mixed octopus salad, Dried mackerel (çiroz), etc.", new BigDecimal("400"), Category.Appetizers),
                        new MenuItem("Cheese", "Portion of local cheese", new BigDecimal("200"), Category.Appetizers),
                        new MenuItem("Smoked Eggplant", "Traditional roasted eggplant meze", new BigDecimal("400"), Category.Appetizers),

                        new MenuItem("Calamari", "Daily fresh fried calamari.", new BigDecimal("900"), Category.HotStarters),
                        new MenuItem("Shrimp", "Sautéed shrimp with butter and Zakkum’s special sauce.", new BigDecimal("1100"), Category.HotStarters),
                        new MenuItem("Liver Slices", "Grilled thinly sliced liver.", new BigDecimal("850"), Category.HotStarters),
                        new MenuItem("Kokoretsi", "Izmir-style grilled kokoretsi (seasoned lamb intestines).", new BigDecimal("950"), Category.HotStarters),
                        new MenuItem("Cigar Börek", "Crispy pastry rolls stuffed with Bergama tulum cheese and curd cheese.", new BigDecimal("350"), Category.HotStarters),
                        new MenuItem("Paçanga Börek", "Pastry filled with pastrami, kashar cheese, and vegetables.", new BigDecimal("300"), Category.HotStarters),

                        new MenuItem("Green Salad", "Regular: 250 TL, Large: 500 TL", new BigDecimal("500"), Category.Salads),
                        new MenuItem("Shepherd Salad", "Regular: 250 TL, Large: 500 TL", new BigDecimal("500"), Category.Salads),
                        new MenuItem("Cheese Salad", "Regular: 250 TL, Large: 500 TL", new BigDecimal("500"), Category.Salads),

                        new MenuItem("Ribeye", "Grilled, tender and juicy steak.", new BigDecimal("950"), Category.MainCourses),
                        new MenuItem("Lamb Delight", "Extremely tender lamb cuts.", new BigDecimal("850"), Category.MainCourses),
                        new MenuItem("Lamb Skewers", "Special grilled lamb skewers.", new BigDecimal("800"), Category.MainCourses),
                        new MenuItem("Grilled Meatballs", "Homemade beef meatballs.", new BigDecimal("700"), Category.MainCourses),
                        new MenuItem("Çipura", "Fresh sea fish.", new BigDecimal("1000"), Category.MainCourses),
                        new MenuItem("Sardalya", "Fresh sea fish.", new BigDecimal("750"), Category.MainCourses),
                        //new MenuItem("Casserole Roast", "Beef stew in clay pot.", new BigDecimal("850"), Category.MainCourses),
                        new MenuItem("Chops", "Grilled lamb chops.", new BigDecimal("950"), Category.MainCourses),
                        new MenuItem("Levrek", "Fresh sea fish.", new BigDecimal("1000"), Category.MainCourses),

                        new MenuItem("Cola & Sprite", "", new BigDecimal("200"), Category.SoftDrinks),
                        new MenuItem("Soda", "", new BigDecimal("200"), Category.SoftDrinks),
                        new MenuItem("Redbull", "", new BigDecimal("250"), Category.SoftDrinks),
                        new MenuItem("Ayran", "", new BigDecimal("100"), Category.SoftDrinks),
                        new MenuItem("Büyük Su", "", new BigDecimal("150"), Category.SoftDrinks),

                        new MenuItem("Tuborg & Carlsberg", "Bottled beer varieties.", new BigDecimal("300"), Category.Beer),
                        new MenuItem("Sol", "Mexican ale beer.", new BigDecimal("300"), Category.Beer),

                        new MenuItem("Rakı", "Beylerbeyi Göbek 20 cl.", new BigDecimal("1500"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Göbek 35 cl.", new BigDecimal("1900"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Göbek 50 cl.", new BigDecimal("2750"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Göbek 70 cl.", new BigDecimal("3250"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Göbek 100 cl.", new BigDecimal("4000"), Category.Raki),

                        new MenuItem("Rakı", "Beylerbeyi Mavi 20 cl.", new BigDecimal("1100"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Mavi 35 cl.", new BigDecimal("1350"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Mavi 50 cl.", new BigDecimal("2000"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Mavi 70 cl.", new BigDecimal("2500"), Category.Raki),
                        new MenuItem("Rakı", "Beylerbeyi Mavi 100 cl.", new BigDecimal("3000"), Category.Raki),

                        new MenuItem("Single Rakı", "Standard 4 cl serving.", new BigDecimal("400"), Category.Raki),
                        new MenuItem("Double Rakı", "Large 8 cl serving.", new BigDecimal("600"), Category.Raki),

                        new MenuItem("Wine Selection", "Red, Rosé and White – 70 cl.", new BigDecimal("1500"), Category.Wine),
                        new MenuItem("White Wine", "Cabernet Sauvignon White – 70 cl.", new BigDecimal("1500"), Category.Wine),
                        new MenuItem("Wine Glass", "Served by glass – red or white.", new BigDecimal("500"), Category.Wine));
            }

        return ResponseEntity.ok(menuItems);
    }
}

package com.edsoft.ed.soft.controller;

import com.edsoft.ed.soft.model.Category;
import com.edsoft.ed.soft.model.MenuItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = {"http://localhost:4200",
                        "https://teras-otel-menu-go.up.railway.app"})
public class MenuController {

    @GetMapping
    public ResponseEntity<List<MenuItem>> getMenu() {
        List<MenuItem> menuItems = List.of(
                new MenuItem("Mezeler", "Tüm mezeler sabit fiyatlıdır.", new BigDecimal("200"), Category.Appetizers),
                new MenuItem("Deniz Mah. Mezeler", "Deniz ürünlü mezeler sabit fiyatlıdır.", new BigDecimal("350"), Category.Appetizers),

                new MenuItem("Kalamar", "Günlük taze kalamar tava.", new BigDecimal("700"), Category.HotStarters),
                new MenuItem("Karides", "Tereyağında sotelenmiş karides.", new BigDecimal("700"),Category.HotStarters),
                new MenuItem("Yaprak Ciğer", "Izgara usulü yaprak ciğer.", new BigDecimal("600"),Category.HotStarters),
                new MenuItem("Kokoreç", "Özel baharatlı ızgara kokoreç.", new BigDecimal("600"),Category.HotStarters),
                new MenuItem("Sigara Böreği", "Kızartılmış klasik börek.", new BigDecimal("200"),Category.HotStarters),
                new MenuItem("Paçanga", "Birim fiyatıdır, içi et ve kaşar dolgulu.", new BigDecimal("200"),Category.HotStarters),

                new MenuItem("Yeşil Salata", "Normal: 150 TL, Duble: 300 TL", new BigDecimal("150"), Category.Salads),
                new MenuItem("Çoban Salata", "Normal: 150 TL, Duble: 300 TL", new BigDecimal("150"), Category.Salads),
                new MenuItem("Peynirli Salata", "Normal: 250 TL, Duble: 450 TL", new BigDecimal("250"),Category.Salads),

                new MenuItem("Antrikot", "Izgara antrikot, yumuşak ve sulu.", new BigDecimal("700"), Category.MainCourses),
                new MenuItem("Kuzu Lokum", "Lokum kıvamında kuzu eti.", new BigDecimal("600"), Category.MainCourses),
                new MenuItem("Kuzu Şiş", "Şişte kuzu et spesiyali.", new BigDecimal("500"), Category.MainCourses),
                new MenuItem("Izgara Köfte", "Ev yapımı dana köfte.", new BigDecimal("450"), Category.MainCourses),
                new MenuItem("Güveç Kavurma", "Toprak güveçte dana kavurma.", new BigDecimal("850"), Category.MainCourses),
                new MenuItem("Pirzola", "Izgarada pişirilmiş kuzu pirzola.", new BigDecimal("700"), Category.MainCourses),
                new MenuItem("Balık", "Fiyat sorunuz. Günlük taze balık.", null, Category.MainCourses),

                new MenuItem("Cola & Sprite", "", new BigDecimal("100"), Category.SoftDrinks),
                new MenuItem("Soda", "", new BigDecimal("80"), Category.SoftDrinks),
                new MenuItem("Redbull", "", new BigDecimal("150"), Category.SoftDrinks),
                new MenuItem("Ayran", "Meksika menşeli bir ale bira.", new BigDecimal("80"), Category.SoftDrinks),

                new MenuItem("Tuborg & Carlsberg", "Şişe bira çeşitleri.", new BigDecimal("200"), Category.Beer),
                new MenuItem("Sol", "Meksika menşeli bir ale bira.", new BigDecimal("250"), Category.Beer),

                new MenuItem("Rakı", "Yeni Rakı Göbek 20 cl.", new BigDecimal("1000"), Category.Raki),
                new MenuItem("Rakı", "Yeni Rakı Göbek 35 cl.", new BigDecimal("1400"), Category.Raki),
                new MenuItem("Rakı", "Yeni Rakı Göbek 50 cl.", new BigDecimal("1800"), Category.Raki),
                new MenuItem("Rakı", "Yeni Rakı Göbek 70 cl.", new BigDecimal("2200"), Category.Raki),
                new MenuItem("Rakı", "Yeni Rakı Göbek 100 cl.", new BigDecimal("2600"), Category.Raki),

                new MenuItem("Rakı", "Yeni Rakı Mavi 20 cl.", new BigDecimal("900"), Category.Raki),
                new MenuItem("Rakı", "Yeni Rakı Mavi 35 cl.", new BigDecimal("1300"), Category.Raki),
                new MenuItem("Rakı", "Yeni Rakı Mavi 50 cl.", new BigDecimal("1600"), Category.Raki),
                new MenuItem("Rakı", "Yeni Rakı Mavi 70 cl.", new BigDecimal("2000"), Category.Raki),
                new MenuItem("Rakı", "Yeni Rakı Mavi 100 cl.", new BigDecimal("2300"), Category.Raki),

                new MenuItem("Rakı Tek", "Standart 4 cl servis.", new BigDecimal("400"), Category.Raki),
                new MenuItem("Rakı Duble", "Büyük boy 8 cl servis.", new BigDecimal("600"), Category.Raki),

                new MenuItem("Şarap Çeşitleri", "Red, Rosé ve White – 70 cl.", new BigDecimal("15000"), Category.Wine),
                new MenuItem("Şarap Beyaz", "Cabernet Sauvignon White – 70 cl.", new BigDecimal("17500"), Category.Raki),
                new MenuItem("Şarap Kadeh", "Kadeh servis, kırmızı veya beyaz.", new BigDecimal("400"), Category.Raki)
        );

        return ResponseEntity.ok(menuItems);
    }
}

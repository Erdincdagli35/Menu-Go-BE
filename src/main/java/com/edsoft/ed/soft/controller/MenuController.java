package com.edsoft.ed.soft.controller;

import com.edsoft.ed.soft.model.BeachCategory;
import com.edsoft.ed.soft.model.BeachMenuItems;
import com.edsoft.ed.soft.model.Category;
import com.edsoft.ed.soft.model.MenuItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = {"http://localhost:4200",
                        "https://teras-otel-menu-go.up.railway.app"})
public class MenuController {

    @GetMapping
    public ResponseEntity<List<MenuItem>> getMenu(@RequestParam(defaultValue = "TR") String lang) {
        List<MenuItem> menuItems = null;

            if (lang.equalsIgnoreCase("TR")) {
                menuItems = List.of(
                        new MenuItem("Mezeler", "Tüm mezeler sabit fiyatlıdır.", new BigDecimal("200"), Category.Appetizers),
                        new MenuItem("Deniz Mah. Mezeler", "Deniz ürünlü mezeler sabit fiyatlıdır.", new BigDecimal("350"), Category.Appetizers),

                        new MenuItem("Kalamar", "Günlük taze kalamar tava.", new BigDecimal("700"), Category.HotStarters),
                        new MenuItem("Karides", "Tereyağında sotelenmiş karides.", new BigDecimal("700"), Category.HotStarters),
                        new MenuItem("Yaprak Ciğer", "Izgara usulü yaprak ciğer.", new BigDecimal("600"), Category.HotStarters),
                        new MenuItem("Kokoreç", "Özel baharatlı ızgara kokoreç.", new BigDecimal("600"), Category.HotStarters),
                        new MenuItem("Sigara Böreği", "Kızartılmış klasik börek.", new BigDecimal("200"), Category.HotStarters),
                        new MenuItem("Paçanga", "Birim fiyatıdır, içi et ve kaşar dolgulu.", new BigDecimal("200"), Category.HotStarters),

                        new MenuItem("Yeşil Salata", "Normal: 150 TL, Duble: 300 TL", new BigDecimal("150"), Category.Salads),
                        new MenuItem("Çoban Salata", "Normal: 150 TL, Duble: 300 TL", new BigDecimal("150"), Category.Salads),
                        new MenuItem("Peynirli Salata", "Normal: 250 TL, Duble: 450 TL", new BigDecimal("250"), Category.Salads),

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
                        new MenuItem("Ayran", "", new BigDecimal("80"), Category.SoftDrinks),

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

                        new MenuItem("Şarap Çeşitleri", "Red, Rosé ve White – 70 cl.", new BigDecimal("1500"), Category.Wine),
                        new MenuItem("Şarap Beyaz", "Cabernet Sauvignon White – 70 cl.", new BigDecimal("1750"), Category.Wine),
                        new MenuItem("Şarap Kadeh", "Kadeh servis, kırmızı veya beyaz.", new BigDecimal("400"), Category.Wine)
                );
            } else if (lang.equalsIgnoreCase("EN")) {
                menuItems = List.of(
                        new MenuItem("Appetizers", "All cold appetizers have fixed pricing.", new BigDecimal("200"), Category.Appetizers),
                        new MenuItem("Seafood Appetizers", "All seafood appetizers are fixed price.", new BigDecimal("350"), Category.Appetizers),

                        new MenuItem("Calamari", "Fresh daily fried calamari.", new BigDecimal("700"), Category.HotStarters),
                        new MenuItem("Shrimp", "Sautéed shrimp in butter.", new BigDecimal("700"), Category.HotStarters),
                        new MenuItem("Liver Slices", "Grilled-style tender liver slices.", new BigDecimal("600"), Category.HotStarters),
                        new MenuItem("Kokorec", "Grilled with special spices.", new BigDecimal("600"), Category.HotStarters),
                        new MenuItem("Cigar Pastry", "Classic deep-fried pastry.", new BigDecimal("200"), Category.HotStarters),
                        new MenuItem("Pacanga", "Filled with meat and cheese.", new BigDecimal("200"), Category.HotStarters),

                        new MenuItem("Green Salad", "Regular: 150 TL, Large: 300 TL", new BigDecimal("150"), Category.Salads),
                        new MenuItem("Shepherd Salad", "Regular: 150 TL, Large: 300 TL", new BigDecimal("150"), Category.Salads),
                        new MenuItem("Cheese Salad", "Regular: 250 TL, Large: 450 TL", new BigDecimal("250"), Category.Salads),

                        new MenuItem("Ribeye", "Grilled, tender and juicy steak.", new BigDecimal("700"), Category.MainCourses),
                        new MenuItem("Lamb Delight", "Extremely tender lamb cuts.", new BigDecimal("600"), Category.MainCourses),
                        new MenuItem("Lamb Skewers", "Special grilled lamb skewers.", new BigDecimal("500"), Category.MainCourses),
                        new MenuItem("Grilled Meatballs", "Homemade beef meatballs.", new BigDecimal("450"), Category.MainCourses),
                        new MenuItem("Casserole Roast", "Beef stew in clay pot.", new BigDecimal("850"), Category.MainCourses),
                        new MenuItem("Chops", "Grilled lamb chops.", new BigDecimal("700"), Category.MainCourses),
                        new MenuItem("Fish", "Ask for price. Fresh daily fish.", null, Category.MainCourses),

                        new MenuItem("Cola & Sprite", "", new BigDecimal("100"), Category.SoftDrinks),
                        new MenuItem("Soda", "", new BigDecimal("80"), Category.SoftDrinks),
                        new MenuItem("Redbull", "", new BigDecimal("150"), Category.SoftDrinks),
                        new MenuItem("Ayran", "Mexican-style ale beer (description mismatch)", new BigDecimal("80"), Category.SoftDrinks),

                        new MenuItem("Tuborg & Carlsberg", "Bottled beer varieties.", new BigDecimal("200"), Category.Beer),
                        new MenuItem("Sol", "Mexican ale beer.", new BigDecimal("250"), Category.Beer),

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

                        new MenuItem("Single Rakı", "Standard 4 cl serving.", new BigDecimal("400"), Category.Raki),
                        new MenuItem("Double Rakı", "Large 8 cl serving.", new BigDecimal("600"), Category.Raki),

                        new MenuItem("Wine Selection", "Red, Rosé and White – 70 cl.", new BigDecimal("1500"), Category.Wine),
                        new MenuItem("White Wine", "Cabernet Sauvignon White – 70 cl.", new BigDecimal("1750"), Category.Wine),
                        new MenuItem("Wine Glass", "Served by glass – red or white.", new BigDecimal("400"), Category.Wine));
            }

        return ResponseEntity.ok(menuItems);
    }

    @GetMapping("/beach")
    public ResponseEntity<List<BeachMenuItems>> getBeachMenu(@RequestParam(defaultValue = "TR") String lang) {
        List<BeachMenuItems> menuItems = null;

        if (lang.equalsIgnoreCase("TR")) {
            menuItems = List.of(
                    new BeachMenuItems("Çay", "Demleme siyah çay", new BigDecimal("50"), BeachCategory.HotDrinks),
                    new BeachMenuItems("Türk Kahvesi", "Klasik Türk kahvesi", new BigDecimal("100"), BeachCategory.HotDrinks),
                    new BeachMenuItems("Nescafe", "Hazır granül kahve", new BigDecimal("150"), BeachCategory.HotDrinks),
                    new BeachMenuItems("Küçük Su", "330 ml su", new BigDecimal("50"), BeachCategory.HotDrinks),
                    new BeachMenuItems("Büyük Su", "1 lt su", new BigDecimal("100"), BeachCategory.HotDrinks),

                    new BeachMenuItems("Soğuk Kahve Çeşitleri", "Buzlu kahve çeşitleri", new BigDecimal("200"), BeachCategory.ColdDrinks),
                    new BeachMenuItems("Soda", "Doğal maden suyu", new BigDecimal("80"), BeachCategory.ColdDrinks),
                    new BeachMenuItems("Ayran", "Yoğurttan yapılan geleneksel içecek", new BigDecimal("80"), BeachCategory.ColdDrinks),
                    new BeachMenuItems("Ev Yapımı Limonata", "Taze sıkılmış limonlu içecek", new BigDecimal("100"), BeachCategory.ColdDrinks),
                    new BeachMenuItems("Red Bull", "Enerji içeceği", new BigDecimal("150"), BeachCategory.ColdDrinks),

                    new BeachMenuItems("Tuborg", "Şişe bira", new BigDecimal("200"), BeachCategory.Beer),
                    new BeachMenuItems("Carlsberg", "Şişe bira", new BigDecimal("200"), BeachCategory.Beer),
                    new BeachMenuItems("Sol", "Meksika usulü bira", new BigDecimal("250"), BeachCategory.Beer),

                    new BeachMenuItems("Kaşarlı Tost", "Kaşar peyniri ile hazırlanan sıcak sandviç", new BigDecimal("200"), BeachCategory.Sandawichs),
                    new BeachMenuItems("Karışık Tost", "Sucuk, salam ve kaşar içeren sandviç", new BigDecimal("300"), BeachCategory.Sandawichs),

                    new BeachMenuItems("Gözleme Çeşitleri", "Peynirli, patatesli, ıspanaklı gözlemeler", new BigDecimal("300"), BeachCategory.Snacks),

                    new BeachMenuItems("Hamburger", "Izgara köfte ile klasik hamburger", new BigDecimal("450"), BeachCategory.Burgers),
                    new BeachMenuItems("Cheese Hamburger", "Kaşarlı hamburger", new BigDecimal("500"), BeachCategory.Burgers),

                    new BeachMenuItems("Patates", "Kızartılmış patates", new BigDecimal("200"), BeachCategory.Snacks),
                    new BeachMenuItems("Sigara Böreği", "Peynirli ince yufka böreği", new BigDecimal("200"), BeachCategory.Snacks),
                    new BeachMenuItems("Bira Tabağı", "Patates, çerez, kızartmalardan oluşan tabak", new BigDecimal("400"), BeachCategory.Snacks)
            );
        } else if (lang.equalsIgnoreCase("EN")) {
            menuItems = List.of(
                    new BeachMenuItems("Tea", "Brewed black tea", new BigDecimal("50"), BeachCategory.HotDrinks),
                    new BeachMenuItems("Turkish Coffee", "Traditional Turkish coffee", new BigDecimal("100"), BeachCategory.HotDrinks),
                    new BeachMenuItems("Nescafe", "Instant granulated coffee", new BigDecimal("150"), BeachCategory.HotDrinks),
                    new BeachMenuItems("Small Water", "330 ml bottled water", new BigDecimal("50"), BeachCategory.HotDrinks),
                    new BeachMenuItems("Large Water", "1 liter bottled water", new BigDecimal("100"), BeachCategory.HotDrinks),

                    new BeachMenuItems("Iced Coffee Varieties", "Cold coffee drinks with ice", new BigDecimal("200"), BeachCategory.ColdDrinks),
                    new BeachMenuItems("Soda", "Sparkling mineral water", new BigDecimal("80"), BeachCategory.ColdDrinks),
                    new BeachMenuItems("Ayran", "Traditional yogurt-based beverage", new BigDecimal("80"), BeachCategory.ColdDrinks),
                    new BeachMenuItems("Homemade Lemonade", "Freshly squeezed lemon drink", new BigDecimal("100"), BeachCategory.ColdDrinks),
                    new BeachMenuItems("Red Bull", "Energy drink", new BigDecimal("150"), BeachCategory.ColdDrinks),

                    new BeachMenuItems("Tuborg", "Bottled beer", new BigDecimal("200"), BeachCategory.Beer),
                    new BeachMenuItems("Carlsberg", "Bottled beer", new BigDecimal("200"), BeachCategory.Beer),
                    new BeachMenuItems("Sol", "Mexican-style ale beer", new BigDecimal("250"), BeachCategory.Beer),

                    new BeachMenuItems("Toast with Cheese", "Hot sandwich with melted cheese", new BigDecimal("200"), BeachCategory.Sandawichs),
                    new BeachMenuItems("Mixed Toast", "Hot sandwich with sausage, salami and cheese", new BigDecimal("300"), BeachCategory.Sandawichs),

                    new BeachMenuItems("Stuffed Flatbreads", "Varieties filled with cheese, potato, or spinach", new BigDecimal("300"), BeachCategory.Snacks),

                    new BeachMenuItems("Hamburger", "Grilled beef patty in bun", new BigDecimal("450"), BeachCategory.Burgers),
                    new BeachMenuItems("Cheeseburger", "Hamburger with melted cheese", new BigDecimal("500"), BeachCategory.Burgers),

                    new BeachMenuItems("French Fries", "Deep-fried potato sticks", new BigDecimal("200"), BeachCategory.Snacks),
                    new BeachMenuItems("Cigar Pastry", "Fried pastry filled with cheese", new BigDecimal("200"), BeachCategory.Snacks),
                    new BeachMenuItems("Beer Plate", "Mixed snacks plate for beer", new BigDecimal("400"), BeachCategory.Snacks)
            );
        }

        return ResponseEntity.ok(menuItems);
    }

}

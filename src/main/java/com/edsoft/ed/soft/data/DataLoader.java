package com.edsoft.ed.soft.data;

import com.edsoft.ed.soft.model.Category;
import com.edsoft.ed.soft.model.MenuItemTranslation;
import com.edsoft.ed.soft.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
@Component
@RequiredArgsConstructor
public class DataLoader {

    @Autowired
    private MenuRepository menuRepository;

    @Bean
    public CommandLineRunner seedRestaurantMenu() {
        return args -> {

            if (menuRepository.count() == 0) {

                List<MenuItem> items = List.of(

                        // APPETIZERS
                        createItem(
                                "Mezeler",
                                "Yeşil Erikli Cacıki, Kabak Çiçeği Dolması, Deniz Börülcesi vs.",
                                "Appetizer Mix",
                                "Caciki with Green Plums, Stuffed Zucchini Blossoms, Samphire etc.",
                                "300",
                                Category.Appetizers
                        ),

                        createItem(
                                "Deniz Mah. Mezeler",
                                "Lakerda, Karışık Ahtapotlu Salata vs.",
                                "Seafood Appetizers",
                                "Lakerda, mixed octopus salad etc.",
                                "400",
                                Category.Appetizers
                        ),

                        createItem(
                                "Peynir",
                                "Adet",
                                "Cheese",
                                "Portion of cheese",
                                "200",
                                Category.Appetizers
                        ),

                        // HOT STARTERS
                        createItem(
                                "Kalamar",
                                "Günlük taze kalamar tava.",
                                "Calamari",
                                "Fresh fried calamari",
                                "900",
                                Category.HotStarters
                        ),

                        createItem(
                                "Karides",
                                "Zakkum özel soslu karides",
                                "Shrimp",
                                "Shrimp with special sauce",
                                "1100",
                                Category.HotStarters
                        ),

                        createItem(
                                "Kokoreç",
                                "İzmir usulü ızgara kokoreç",
                                "Kokoretsi",
                                "Izmir style grilled kokoretsi",
                                "950",
                                Category.HotStarters
                        ),

                        // SALADS
                        createItem(
                                "Yeşil Salata",
                                "Normal / Duble",
                                "Green Salad",
                                "Regular / Large",
                                "500",
                                Category.Salads
                        ),

                        createItem(
                                "Çoban Salata",
                                "Normal / Duble",
                                "Shepherd Salad",
                                "Regular / Large",
                                "500",
                                Category.Salads
                        ),

                        // MAIN COURSES
                        createItem(
                                "Antrikot",
                                "Izgara antrikot",
                                "Ribeye",
                                "Grilled ribeye steak",
                                "950",
                                Category.MainCourses
                        ),

                        createItem(
                                "Kuzu Lokum",
                                "Lokum kıvamında kuzu eti",
                                "Lamb Delight",
                                "Tender lamb meat",
                                "850",
                                Category.MainCourses
                        ),

                        createItem(
                                "Levrek",
                                "Taze deniz balığı",
                                "Sea Bass",
                                "Fresh sea fish",
                                "1000",
                                Category.MainCourses
                        ),

                        // DRINKS
                        createItem(
                                "Cola & Sprite",
                                "",
                                "Cola & Sprite",
                                "",
                                "200",
                                Category.SoftDrinks
                        ),

                        createItem(
                                "Ayran",
                                "",
                                "Ayran",
                                "",
                                "100",
                                Category.SoftDrinks
                        ),

                        // BEER
                        createItem(
                                "Tuborg & Carlsberg",
                                "Şişe bira çeşitleri",
                                "Tuborg & Carlsberg",
                                "Bottled beers",
                                "300",
                                Category.Beer
                        ),

                        // RAKI
                        createItem(
                                "Rakı (20cl)",
                                "Beylerbeyi Göbek",
                                "Rakı (20cl)",
                                "Beylerbeyi Göbek",
                                "1500",
                                Category.Raki
                        ),

                        createItem(
                                "Rakı Tek",
                                "Standart 4cl",
                                "Single Rakı",
                                "Standard 4cl",
                                "400",
                                Category.Raki
                        ),

                        // WINE
                        createItem(
                                "Şarap Çeşitleri",
                                "Kırmızı, beyaz, roze",
                                "Wine Selection",
                                "Red, white, rose",
                                "1500",
                                Category.Wine
                        )
                );

                menuRepository.saveAll(items);
            }
        };
    }

    private MenuItem createItem(
            String trName,
            String trDesc,
            String enName,
            String enDesc,
            String price,
            Category category
    ) {

        MenuItem item = new MenuItem();
        item.setPrice(new BigDecimal(price));
        item.setCategory(category);

        item.getTranslations().add(new MenuItemTranslation(
                "TR", trName, trDesc, item
        ));

        item.getTranslations().add(new MenuItemTranslation(
                "EN", enName, enDesc, item
        ));

        return item;
    }
}
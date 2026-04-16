package com.edsoft.ed.soft.service;

import com.edsoft.ed.soft.data.MenuItem;
import com.edsoft.ed.soft.data.MenuResponse;
import com.edsoft.ed.soft.model.MenuItemTranslation;
import com.edsoft.ed.soft.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService  {

    @Autowired
    MenuRepository menuRepository;

    public List<MenuResponse> listAll(String lang) {

        List<MenuItem> items = menuRepository.findAll();

        return items.stream()
                .map(item -> {

                    MenuItemTranslation translation = item.getTranslations().stream()
                            .filter(t -> t.getLang().equalsIgnoreCase(lang))
                            .findFirst()
                            .orElseGet(() ->
                                    item.getTranslations().stream().findFirst().orElse(null)
                            );

                    return new MenuResponse(
                            item.getId(),
                            translation != null ? translation.getName() : "",
                            translation != null ? translation.getDescription() : "",
                            item.getPrice(),
                            item.getCategory()
                    );
                })
                .toList();
    }

    public MenuItem getById(Long id) {
        return menuRepository.findOneById(id);
    }

    public MenuItem save(MenuItem menuItem) {
        if (menuItem.getTranslations() != null) {
            menuItem.getTranslations().forEach(t -> t.setMenuItem(menuItem));
        }
        return menuRepository.save(menuItem);
    }

    public MenuItem update(Long id, MenuItem updatedItem) {
        MenuItem existing = getById(id);

        existing.setPrice(updatedItem.getPrice());
        existing.setCategory(updatedItem.getCategory());

        // translation update (basit versiyon)
        existing.getTranslations().clear();

        if (updatedItem.getTranslations() != null) {
            updatedItem.getTranslations().forEach(t -> {
                t.setMenuItem(existing);
                existing.getTranslations().add(t);
            });
        }

        return menuRepository.save(existing);
    }

    public void delete(Long id) {
        menuRepository.deleteById(id);
    }
}
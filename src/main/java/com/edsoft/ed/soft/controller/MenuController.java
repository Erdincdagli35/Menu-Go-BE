package com.edsoft.ed.soft.controller;

import com.edsoft.ed.soft.data.MenuItem;
import com.edsoft.ed.soft.data.MenuResponse;
import com.edsoft.ed.soft.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = {"http://localhost:4200",
                        "https://terasotelmenugo-test.up.railway.app"})
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping("/restaurant")
    public ResponseEntity<List<MenuResponse>> getMenu(@RequestParam(defaultValue = "TR") String lang) {
        return ResponseEntity.ok(menuService.listAll(lang));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuItem> getById(@PathVariable Long id) {
        return ResponseEntity.ok(menuService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<MenuItem> create(@RequestBody MenuItem item) {
        return ResponseEntity.ok(menuService.save(item));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MenuItem> update(@PathVariable Long id,
                                            @RequestBody MenuItem item) {
        return ResponseEntity.ok(menuService.update(id, item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        menuService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

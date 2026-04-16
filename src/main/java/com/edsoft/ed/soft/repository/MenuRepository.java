package com.edsoft.ed.soft.repository;

import com.edsoft.ed.soft.data.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuItem, Long> {
    MenuItem findOneById(Long id);
}

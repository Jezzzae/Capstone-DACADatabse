package com.daca.dacaapp.repository;

import com.daca.dacaapp.model.Grant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrantRepository extends JpaRepository<Grant, Long> {
    Grant findById(String grantId);
}

package com.daca.dacaapp.repository;

import com.daca.dacaapp.model.Clinic;
import com.daca.dacaapp.model.Grant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic,Long> {
    Clinic findById(String clinicId);



}


package com.genericCombo.repository;
import com.genericCombo.entity.DrugDtl;


import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugComboRepo extends JpaRepository<DrugDtl,Long> { }

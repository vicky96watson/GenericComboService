package com.genericCombo.repository;

import com.genericCombo.entity.SupplierDtl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierComboRepo extends JpaRepository<SupplierDtl,Long> {
}

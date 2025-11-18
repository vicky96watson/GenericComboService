package com.genericCombo.service;

import com.genericCombo.entity.DrugDtl;
import com.genericCombo.entity.StoreDtl;
import com.genericCombo.entity.SupplierDtl;
import com.genericCombo.repository.DrugComboRepo;
import com.genericCombo.repository.StoreComboRepo;
import com.genericCombo.repository.SupplierComboRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericComboServ
{
    private final SupplierComboRepo supplierComboRepo;
    private final StoreComboRepo storeComboRepo;
    private final DrugComboRepo drugComboRepo;

    public GenericComboServ(SupplierComboRepo supplierComboRepo, StoreComboRepo storeComboRepo, DrugComboRepo drugComboRepo) {
        this.supplierComboRepo = supplierComboRepo;
        this.storeComboRepo = storeComboRepo;
        this.drugComboRepo = drugComboRepo;
    }

    public List<StoreDtl> getStoreCombo(){ return storeComboRepo.findAll();}
    public List<SupplierDtl> getSupplierCombo(){ return supplierComboRepo.findAll();}
    public List<DrugDtl> getDrugCombo(){return drugComboRepo.findAll();}



}

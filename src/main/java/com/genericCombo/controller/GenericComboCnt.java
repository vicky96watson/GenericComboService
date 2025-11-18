package com.genericCombo.controller;

import com.genericCombo.entity.DrugDtl;
import com.genericCombo.entity.StoreDtl;
import com.genericCombo.entity.SupplierDtl;
import com.genericCombo.service.GenericComboServ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/GetCombos")
public class GenericComboCnt
{
    public GenericComboServ genericComboServ ;

    public GenericComboCnt(GenericComboServ genericComboServ) {
        this.genericComboServ = genericComboServ;
    }

    @GetMapping("/stores")
    public List<StoreDtl>getStoreCombo()
    {
      return   genericComboServ.getStoreCombo();

    };

    @GetMapping("/supplier")
    public List<SupplierDtl>getSupplierCombo()
    {
        return genericComboServ.getSupplierCombo();

    }

    @GetMapping("/drug")
    public List<DrugDtl>getDrugCombo()
    {
        return genericComboServ.getDrugCombo();

    }

}

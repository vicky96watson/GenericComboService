package com.genericCombo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "hstt_drug_mst", schema = "dwh")
public class DrugDtl {

    @Id
    @Column(name = "hstnum_item_id")
    private Long hstnumItemId;

    @Column(name = "gnum_hospital_code")
    private Long gnumHospitalCode;

    @Column(name = "hstnum_group_id")
    private Long hstnumGroupId;

    @Column(name = "hstnum_subgroup_id")
    private Long hstnumSubgroupId;

    @Column(name = "sstnum_item_cat_no")
    private Long sstnumItemCatNo;

    @Column(name = "hststr_item_name")
    private String hststrItemName;

    @Column(name = "hstnum_batchno_req")
    private Long hstnumBatchnoReq;

    @Column(name = "hstnum_expirydate_req")
    private Long hstnumExpirydateReq;

    @Column(name = "hstnum_shelflife")
    private Long hstnumShelflife;

    @Column(name = "hstnum_shelflife_unit")
    private Long hstnumShelflifeUnit;

    @Column(name = "gnum_inventory_unitid")
    private Long gnumInventoryUnitid;

    @Column(name = "hstnum_purchased_leadtime")
    private Long hstnumPurchasedLeadtime;

    @Column(name = "hstnum_pur_leadtime_unit")
    private Long hstnumPurLeadtimeUnit;

    @Column(name = "hstnum_consumable_flag")
    private Long hstnumConsumableFlag;

    @Column(name = "hstnum_is_narcotic")
    private Long hstnumIsNarcotic;

    @Column(name = "gstr_remarks")
    private String gstrRemarks;

    @Column(name = "gdt_effective_frm")
    private LocalDateTime gdtEffectiveFrm;

    @Column(name = "gnum_lstmod_seatid")
    private Long gnumLstmodSeatid;

    @Column(name = "gdt_lstmod_date")
    private LocalDateTime gdtLstmodDate;

    @Column(name = "gdt_entry_date")
    private LocalDateTime gdtEntryDate;

    @Column(name = "gnum_seatid")
    private Long gnumSeatid;

    @Column(name = "gnum_isvalid")
    private Long gnumIsvalid;

    @Column(name = "hstnum_consent_req")
    private Long hstnumConsentReq;

    @Column(name = "hststr_cpa_code")
    private String hststrCpaCode;

    @Column(name = "hstnum_pregnancy_safe_flag")
    private Long hstnumPregnancySafeFlag;

    @Column(name = "hststr_foetus_effects")
    private String hststrFoetusEffects;

    @Column(name = "hstnum_trimester")
    private Long hstnumTrimester;

    @Column(name = "hstnum_breakable_flag")
    private Long hstnumBreakableFlag;
}

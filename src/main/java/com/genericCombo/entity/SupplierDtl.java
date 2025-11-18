package com.genericCombo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "hstt_supplier_mst", schema = "dwh")
public class SupplierDtl {

    @Id
    @Column(name = "hstnum_supplier_id", nullable = false)
    private Long supplierId;

    @Column(name = "gnum_hospital_code")
    private Long hospitalCode; // fixed value, optional for entity

    @Column(name = "hstnum_supplier_grade_id")
    private Integer supplierGradeId;

    @Column(name = "hststr_supplier_name", length = 100)
    private String supplierName;

    @Column(name = "hststr_contact_person", length = 100)
    private String contactPerson;

    @Column(name = "hststr_address", length = 250)
    private String address;

    @Column(name = "hststr_city_name", length = 100)
    private String city;

    @Column(name = "hststr_pincode")
    private Long pincode;

    @Column(name = "hststr_phone1", length = 50)
    private String phone1;

    @Column(name = "hststr_phone2", length = 50)
    private String phone2;

    @Column(name = "hststr_email1", length = 50)
    private String email1;

    @Column(name = "hststr_email2", length = 50)
    private String email2;

    @Column(name = "hststr_faxno1", length = 20)
    private String fax1;

    @Column(name = "hststr_faxno2", length = 20)
    private String fax2;

    @Column(name = "hststr_website", length = 100)
    private String website;

    @Column(name = "hstnum_supplier_status")
    private Integer supplierStatus;

    @Column(name = "gstr_remarks", length = 100)
    private String remarks;

    @Column(name = "gdt_effective_frm")
    private LocalDateTime effectiveFrom;

    @Column(name = "gnum_lstmod_seatid")
    private Integer lastModifiedSeatId;

    @Column(name = "gdt_lstmod_date")
    private LocalDateTime lastModifiedDate;

    @Column(name = "gdt_entry_date")
    private LocalDateTime entryDate;

    @Column(name = "gnum_seatid")
    private Integer seatId;

    @Column(name = "gnum_isvalid")
    private Integer isValid;

    @Column(name = "hststr_lst_no", length = 10)
    private String lstNo;

    @Column(name = "hststr_cst_no", length = 10)
    private String cstNo;

    @Column(name = "hststr_pan_no", length = 10)
    private String panNo;

    @Column(name = "hstnum_is_supplier")
    private Integer isSupplier;

    @Column(name = "hstnum_is_manufacturer")
    private Integer isManufacturer;

    @Column(name = "hstnum_is_agent")
    private Integer isAgent;

    @Column(name = "hstnum_is_buyer")
    private Integer isBuyer;

    @Column(name = "sstnum_item_cat_no")
    private Integer itemCategoryNo;

    @Column(name = "hstnum_is_foreign")
    private Integer isForeign;

    @Column(name = "hstnum_suppliertype_id")
    private Integer supplierTypeId;

    @Column(name = "gnum_countrycode")
    private Integer countryCode;

    @Column(name = "gnum_statecode")
    private Integer stateCode;

    @Column(name = "hststr_contract_no", length = 50)
    private String contractNo;

    @Column(name = "hstdt_contract_date")
    private LocalDateTime contractDate;

    @Column(name = "hstdt_contract_expiry_date")
    private LocalDateTime contractExpiryDate;

    @Column(name = "hstnum_maintanance_flag")
    private Integer maintenanceFlag;

    @Column(name = "hstnum_escalanation_flag")
    private Integer escalationFlag;

    @Column(name = "hstnum_turnover")
    private Integer turnover;

    @Column(name = "hstnum_turnover_unit")
    private Integer turnoverUnit;

    @Column(name = "hstnum_interface_req_flag")
    private Integer interfaceReqFlag;

    @Column(name = "num_dist_id")
    private Integer distId;

    @Column(name = "hststr_tan_no", length = 25)
    private String tanNo;

    @Column(name = "hstnum_is_central_pur")
    private Integer isCentralPurchase;

    @Column(name = "gnum_isvalid1")
    private Integer isValid1;

    @Column(name = "hstnum_approval_status")
    private Integer approvalStatus;

    @Column(name = "hststr_approval_remarks", length = 100)
    private String approvalRemarks;

    @Column(name = "gnum_approval_seatid")
    private Integer approvalSeatId;

    @Column(name = "gdt_approval_date")
    private LocalDateTime approvalDate;

    @Column(name = "hstnum_bank_id")
    private Integer bankId;

    @Column(name = "hstnum_branch_id", length = 100)
    private String branchId;

    @Column(name = "hststr_account_no", length = 100)
    private String accountNo;

    @Column(name = "hststr_ifsc_code", length = 50)
    private String ifscCode;

    @Column(name = "hststr_micr_no", length = 50)
    private String micrNo;

    @Column(name = "hststr_bank_address", length = 100)
    private String bankAddress;

    @Column(name = "hatnum_tresury_flag")
    private Integer treasuryFlag;

    @Column(name = "hstnum_advance_payment_flag")
    private Integer advancePaymentFlag;

    @Column(name = "hststr_gstn_no", length = 25)
    private String gstnNo;

    @Column(name = "hstnum_gs1_exclusion_flag")
    private Integer gs1ExclusionFlag;

    @Column(name = "hstnum_ws_enroll_flag")
    private Integer wsEnrollFlag;

    @Column(name = "hststr_ws_provider_name", length = 100)
    private String wsProviderName;

    // Getters and Setters for all fields
    // (Use Lombok @Getter @Setter if preferred)
}

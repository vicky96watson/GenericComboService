package com.genericCombo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "hstt_store_mst", schema = "dwh")
public class StoreDtl{

    @Id
    @Column(name = "hstnum_store_id", nullable = false)
    private Long storeId;

    @Column(name = "gnum_hospital_code")
    private Long hospitalCode;

    @Column(name = "hstnum_storetype_id")
    private Integer storeTypeId;

    @Column(name = "gdt_effective_frm")
    private LocalDateTime effectiveFrom;

    @Column(name = "gnum_isvalid")
    private Integer isValid;

    @Column(name = "hststr_store_name", length = 100)
    private String storeName;

    @Column(name = "hstnum_store_level")
    private Integer storeLevel;

    @Column(name = "num_building_code")
    private Integer buildingCode;

    @Column(name = "hgstr_emp_code", length = 14)
    private String empCode;

    @Column(name = "num_block_id")
    private Integer blockId;

    @Column(name = "num_floor_id")
    private Integer floorId;

    @Column(name = "hststr_owner_name", length = 100)
    private String ownerName;

    @Column(name = "hststr_phone_no", length = 60)
    private String phoneNo;

    @Column(name = "hststr_owner_address", length = 250)
    private String ownerAddress;

    @Column(name = "gnum_dept_code")
    private Integer deptCode;

    @Column(name = "hststr_contact_no", length = 50)
    private String contactNo;

    @Column(name = "gstr_remarks", length = 100)
    private String remarks;

    @Column(name = "hstnum_owner")
    private Long ownerId;

    @Column(name = "gdt_lstmod_date")
    private LocalDateTime lastModifiedDate;

    @Column(name = "gnum_lstmod_seatid")
    private Integer lastModifiedSeatId;

    @Column(name = "gdt_entry_date")
    private LocalDateTime entryDate;

    @Column(name = "gnum_seatid")
    private Integer seatId;

    @Column(name = "gnum_ward_code")
    private Long wardCode;

    @Column(name = "hstdt_financial_start_date")
    private LocalDateTime financialStartDate;

    @Column(name = "hstdt_financial_end_date")
    private LocalDateTime financialEndDate;

    @Column(name = "hstnum_is_itembound")
    private Integer isItemBound;

    @Column(name = "hstnum_newitem_flag")
    private Integer newItemFlag;

    @Column(name = "hstnum_section_mode")
    private Integer sectionMode;

    @Column(name = "hstnum_purchasing_mode")
    private Integer purchasingMode;

    @Column(name = "hstnum_is_time_bound")
    private Integer isTimeBound;

    @Column(name = "hststr_from_time", length = 5)
    private String fromTime;

    @Column(name = "hststr_to_time", length = 5)
    private String toTime;

    @Column(name = "hststr_location", length = 100)
    private String location;

    @Column(name = "num_dist_id")
    private Integer distId;

    @Column(name = "sstnum_dwh_type_id")
    private Integer dwhTypeId;

    @Column(name = "hstnum_no_beds")
    private Integer noOfBeds;

    @Column(name = "hststr_store_code", length = 20)
    private String storeCode;

    @Column(name = "hstnum_parent_store_id")
    private Long parentStoreId;

    @Column(name = "gnum_isvalid1")
    private Integer isValid1;

    @Column(name = "hststr_header1", length = 250)
    private String header1;

    @Column(name = "hststr_header2", length = 250)
    private String header2;

    @Column(name = "hststr_header3", length = 250)
    private String header3;

    @Column(name = "hstnum_map_hosp_id")
    private Integer mapHospitalId;

    @Column(name = "hststr_display_hosp_name", length = 200)
    private String displayHospitalName;

    @Column(name = "hstnum_area_type")
    private Integer areaType;

    @Column(name = "hststr_desig_name", length = 250)
    private String designationName;

    @Column(name = "hststr_tel_no", length = 250)
    private String telNo;

    @Column(name = "hststr_website", length = 250)
    private String website;

    @Column(name = "hststr_email", length = 250)
    private String email;

    @Column(name = "hststr_faxno", length = 250)
    private String faxNo;

    @Column(name = "hstnum_is_virtual")
    private Integer isVirtual;

    @Column(name = "hststr_incharge_name", length = 500)
    private String inchargeName;

    @Column(name = "hststr_pharmacist_name", length = 100)
    private String pharmacistName;

    @Column(name = "hstnum_last_issue_no")
    private Long lastIssueNo;

    @Column(name = "num_dist_id1")
    private Integer distId1;

    @Column(name = "hstdt_last_issue_date")
    private LocalDateTime lastIssueDate;

    @Column(name = "hstnum_digisign_required")
    private Integer digisignRequired;

    @Column(name = "hstnum_is_dwh")
    private Integer isDwh;

    @Column(name = "hstnum_desktop_app_flag")
    private Integer desktopAppFlag;

    @Column(name = "hstnum_last_pat_issue_no")
    private Long lastPatientIssueNo;

    @Column(name = "hstnum_offline_stk_update_flag")
    private Integer offlineStockUpdateFlag;

    @Column(name = "hstnum_phystock_flag")
    private Integer phyStockFlag;

    @Column(name = "hstnum_lstphystock_date")
    private LocalDateTime lastPhyStockDate;

    @Column(name = "hstnum_longitude")
    private Double longitude;

    @Column(name = "hstnum_latitude")
    private Double latitude;

    @Column(name = "num_zone_id")
    private Integer zoneId;

    @Column(name = "hststr_gstn_no", length = 25)
    private String gstnNo;

    @Column(name = "nin_id", length = 50)
    private String ninId;

    @Column(name = "nin_store_name", length = 50)
    private String ninStoreName;

    @Column(name = "hstnum_parent_id")
    private Long parentId;
}

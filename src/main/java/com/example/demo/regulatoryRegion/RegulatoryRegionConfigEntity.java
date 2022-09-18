package com.example.demo.regulatoryRegion;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "IDGC_VE_REG_REGION_CONFIG_B")
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
public class RegulatoryRegionConfigEntity implements Serializable {

    @Id
    @Column(name = "region_code")
    private String regionCode;
    @Column(name = "region_name")
    private String regionName;
    @Column(name = "region_desc")
    private String regionDescription;
    @Column(name = "region_effective_date")
    private  Date  regionEffectiveDate;
    @Column(name = "region_group_code")
    private String regionGroupCode;
    @Column(name = "region_purpose_code")
    private String purpose;

    @OneToMany
    @JoinColumn(name = "region_code")
    private List<RegulatoryRegionMappingEntity> regulatoryRegionMappingEntity;

    @Column(name = "record_status")
    private String status;
    @Column(name = "record_version")
    private Integer recordVersion;
    @Column(name = "is_authorized")
    private String authorized;
    @Column(name = "last_configuration_action")
    private String lastConfigurationAction;

}

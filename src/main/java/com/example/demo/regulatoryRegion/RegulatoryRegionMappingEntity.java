package com.example.demo.regulatoryRegion;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "IDGC_VE_REG_REGION_MAPPING_B")
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
public class RegulatoryRegionMappingEntity implements Serializable {

    @Id
    @Column(name = "demographic_mapping_code")
    private String demographicMappingCode;
    @Column(name = "demographic_mapping_name")
    private String demographicMappingName;

}

package com.usbank.cloudEnable.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "dp_business_date")
@Data // Lombok: adds getters and setters
public class dp_business_date {
//    @Id
    String car_id;
    String entity_nm;
    String source_system_nm;
}

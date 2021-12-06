package com.usbank.cloudEnable.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "application")
@Data // Lombok: adds getters and setters
public class Application {
	@Id
	String carid = "change-me";
	String costcenter = "change-me";
	String confidentiality = "internal";
	String assignmentgroup = "change-me";
	String additionaltagkey1="key1_value";
	String additionaltagkey2="key2_value";
}

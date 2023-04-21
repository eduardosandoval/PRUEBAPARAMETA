package com.parameter.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "employe")
public class Employee {

	@Id
	@Column(name = "idemploye", unique = true)
	private Integer idemploye;
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "documenttype")
	private String documenttype;
	@Column(name = "birthdate")
	private Date birthdate;
	@Column(name = "companydate")
	private Date companydate;
	@Column(name = "salary")
	private Double salary;
	@Column(name = "post")
	private String post;

}

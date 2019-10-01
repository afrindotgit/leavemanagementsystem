package com.hcl.leavemanagementsystem.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long employeeId;
	
	@Column(name = "employee_name", nullable = false)
	private String employeeName;
	
	@Column(name = "mobile_number", nullable = false)
	private String mobileNumber;
	
	@Column(name = "email_id", nullable = false)
	private String emailId;
	
	@Column(name = "date_of_birth", nullable = false)
	private LocalDate dateOfBirth;
	
	@Column(name = "designation", nullable = false)
	private String designation;
	
	@ManyToOne
	private Employee manager;

}

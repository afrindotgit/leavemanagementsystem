package com.hcl.leavemanagementsystem.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "leaves")
@Getter
@Setter
@ToString
public class Leaves implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long leaveId;
	
	@Column(name = "leave_type", nullable = false)
	private String leaveType;
	
	@Column(name = "available", nullable = false)
	private String available;
	
	@Column(name = "availed", nullable = false)
	private String availed;
	
	@OneToOne
	private Employee employee;
	

}

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
@Table(name = "leaverequest")
@Getter
@Setter
@ToString
public class LeaveRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long leaveRequestId;
	
	@Column(name = "from_date", nullable = false)
	private LocalDate fromDate;
	
	@Column(name = "to_date", nullable = false)
	private LocalDate toDate;
	
	@Column(name = "leave_type", nullable = false)
	private LocalDate leaveType;
	
	@Column(name = "reason", nullable = false)
	private LocalDate reason;
	
	@Column(name = "status", nullable = false)
	private LocalDate status;
	
	@ManyToOne
	private Employee employee;

}

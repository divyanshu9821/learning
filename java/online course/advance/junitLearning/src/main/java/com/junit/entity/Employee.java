package com.junit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Employee {
	private int eID;
	private String eName;
	private double eSalary;
	private Address address;
}

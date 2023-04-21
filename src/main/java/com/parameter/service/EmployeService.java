package com.parameter.service;

import java.util.Date;

import com.parameter.entity.Employee;

public interface EmployeService {

	Employee saveEmploye(String name, String lastName, String documentType, Date birthdate, Date companydate,
			String post, Double salary) throws Exception;
}

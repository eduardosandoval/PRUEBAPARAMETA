package com.parameter.Impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.parameter.entity.Employee;
import com.parameter.service.EmployeService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmployeImpl implements EmployeService  {
	private static final String Date_REGEX = "^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|"
			+ "(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))"
			+ "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3"
			+ "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|"
			+ "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|"
			+ "^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|" + "2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    private static final Pattern Date_PATTERN = Pattern.compile(Date_REGEX);
    
	@Override
	public Employee saveEmploye(String name, String lastName, String documentType, Date birthdate, Date companydate,
			String post, Double salary) throws Exception {
		// TODO Auto-generated method stub
		
		return null;
	}

	
}

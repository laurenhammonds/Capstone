package com.teksystems.capstone1.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.teksystems.capstone1.database.dao.User1DAO;
import com.teksystems.capstone1.database.entity.User1;


public class EmailUniqueImpl implements ConstraintValidator<EmailUnique, String> {

	public static final Logger LOG = LoggerFactory.getLogger(EmailUniqueImpl.class);
	
	@Autowired
	private User1DAO userDao;

	@Override
	public void initialize(EmailUnique constraintAnnotation) {

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if ( StringUtils.isEmpty(value) ) {
			return true;
		}
		
		User1 user = userDao.findByEmail(value);
		
		return ( user == null );
	}

}

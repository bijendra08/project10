package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.StudentDTO;

/**
 * Student Service interface.
 * @author Bijendra Singh
 */

public interface StudentServiceInt extends BaseServiceInt<StudentDTO> {

	/**
	 * Finds a Role by name.
	 * 
	 * 
	 */
	public StudentDTO findByEmail(String email, UserContext context);

}
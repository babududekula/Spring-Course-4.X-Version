package com.pack.service;

import com.pack.beans.Student;

public interface InstituteService 
{
	public void enquiry(Student std , String course_name);
	public void registration(Student std , String course_name);
}

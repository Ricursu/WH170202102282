package com.bl;

public class mainframe {
	student stu;
	teacher teacher;
	mainframe(student stu, teacher teacher)
	{
		this.stu = stu;
		this.teacher = teacher;
	}
	
	public String toString()
	{
		return stu.getName() + "be teached by " + teacher.getName();
	}
}

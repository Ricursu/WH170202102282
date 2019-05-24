package com.bl;

public class teacher {
	private String name;
	private int age;
	private char sex;
	
	teacher(String name, int age, char sex)
	{
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public char getSex()
	{
		return this.sex;
	}	
	public void setSex(char sex)
	{
		this.sex = sex;
	}
}

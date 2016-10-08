package com.spring.henallux.model;

import javax.validation.constraints.*;

public class User {
	@NotNull
	@Size(min=4,max=15)
	private String name;
	@NotNull
	@Min(1)
	@Max(12)
	private Integer age;
	private boolean male;
	private String hobby;
	public User(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}

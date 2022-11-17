package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {

	private String name;
	private char gender;
	@Id
	private long mobile;
	private double experience;
	private String qualification;
	private String branch;
	private double percentage;
	private String primarySkill;
	private String secondarySkill;

	public Candidate() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	@Override
	public String toString() {
		String details = "Candidate name = " + name + "\nGender = " + gender + "\nMobile Number = " + mobile
				+ "\nYear of Experience = " + experience + "\nQualification = " + qualification + "\nBranch = " + branch
				+ "\nPercentage Scored = " + percentage + "\nPrimary Skill = " + primarySkill + "\nSecondary Skill = "+ secondarySkill;
		return details;
	}

}

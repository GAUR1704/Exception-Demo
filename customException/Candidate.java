package com.prowings.customException;

public class Candidate {
	
	private String qualification;
	
	private int experience;

	public Candidate() {
		
		super();
	}

	public Candidate(int experience, String qualification) {
		
		super();
		
		this.experience = experience;
		
		this.qualification = qualification;
	}

	public int getExperience() {
		
		return experience;
	}

	public void setExperience(int experience) {
		
		this.experience = experience;
	}

	public String getQualification() {
		
		return qualification;
	}

	public void setQualification(String qualification) {
		
		this.qualification = qualification;
	}
	
	
}

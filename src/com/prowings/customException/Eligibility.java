package com.prowings.customException;

public class Eligibility {
	
	public void application(Candidate candidate) {
		
		if(candidate.getQualification().equalsIgnoreCase("Engineering")) {
			
			
			if (candidate.getExperience() >= 5)
				
				System.out.println("Eligible for this role !!!");
			
			else
				
				throw new UnderExperiencedExeption("Not enough experiance");
			
		}
		
		else
			
			throw new NotAnEngineerDegree("Candidate not have a Engineer Degree !!!");	

	}

}

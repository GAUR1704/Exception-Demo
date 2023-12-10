package com.prowings.customException;

public class Voting {
	
	public void doVote(Voter voter) {
		
		if(voter.getAge()>= 18) {
			
			if (voter.getCountry().equalsIgnoreCase("INDIA"))
					
					System.out.println("Eligible for Voting");
			
			else
				throw new InvalidCitizenException("Voter is not from India !!");
			
		}
		
		else
			
			throw new InvalidAgeException("Voter is underAge");
	}

}

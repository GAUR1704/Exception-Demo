package com.prowings.customException;

public class TestVoting {
	
	public static void main (String[] args) {
		
		System.out.println("Voting Startted !!! ");
		
		Voter voter1 = new Voter(10, "India");
		
		Voter voter2 = new Voter(22, "India");
		
		Voter voter3 = new Voter(15, "Nepal");
		
		Voter voter4 = new Voter(20, "Nepal");
		
		
		Voting voting = new Voting();
		
		voting.doVote(voter2);
		
		System.out.println("Voting Ended");
		
		
		
		
		
		
	}

}

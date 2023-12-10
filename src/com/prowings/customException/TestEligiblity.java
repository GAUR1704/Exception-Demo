package com.prowings.customException;

public class TestEligiblity {

	public static void main(String[] args) {

		System.out.println("Eligiblity cheaking Startted");

		Candidate candidate1 = new Candidate(5, "Engineering");
		Candidate candidate2 = new Candidate(3, "Engineering");
		Candidate candidate3 = new Candidate(5, "BSC");
		Candidate candidate4 = new Candidate(3, "BSC");
		
		
		Eligibility eligibility = new Eligibility();
		
		eligibility.application(candidate1);
		
		System.out.println("Eligibility Checked, Candidate is eligible for role9");

	}

}

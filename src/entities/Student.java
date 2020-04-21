package entities;

public class Student {
	
	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;
	
	public double finalNote() {
		return firstNote + secondNote + thirdNote;
	}
	
	public double missingPoint() {
		return (finalNote() < 60 )? 60 - finalNote(): 0.0;
	}
	
	public String toString() {
		System.out.printf("FINAL GRADE: %.2f%n", finalNote());
		if(finalNote() < 60 ) {
			return "FAILED" + String.format("%n") +
			       String.format("MISSING %.2f POINTS %n", missingPoint());
		}
		else {
			return "PASS";
		}
			
	}

}

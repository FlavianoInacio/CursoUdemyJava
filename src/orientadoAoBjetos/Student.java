package orientadoAoBjetos;

public class Student {
	private String name;
	private double note1;
	private double note2;
	private double note3;
	private final double totalNote = 100;
	private final double percetagePassed = 60;
	
	public void verifyYearNotes() {
		double finalGrade = getNote1()+getNote2()+getNote3();
		System.out.println("FINAL GRADE ="+finalGrade);
		if(finalGrade>(getTotalNote()*getPercetagePassed())/100) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " +verifyQuantityPointsForPassed(finalGrade)+ " Points");
		}
	}
	private double verifyQuantityPointsForPassed(double finalGrade) {
		return 	((getTotalNote()*getPercetagePassed())/100)-finalGrade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNote1() {
		return note1;
	}
	public void setNote1(double note1) {
		this.note1 = note1;
	}
	public double getNote2() {
		return note2;
	}
	public void setNote2(double note2) {
		this.note2 = note2;
	}
	public double getNote3() {
		return note3;
	}
	public void setNote3(double note3) {
		this.note3 = note3;
	}
	public double getTotalNote() {
		return totalNote;
	}
	public double getPercetagePassed() {
		return percetagePassed;
	}
	
}

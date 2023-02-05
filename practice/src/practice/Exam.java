package practice;

public class Exam {
	public static final String SUBJECT = "JAVA";
	private double score;
	
	public Exam() {}

	public Exam(double Score) {
		this.score = score;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	

	public void print() {
		System.out.println(SUBJECT + "과목 점수는" + score + "점입니다.");
	}
	

}

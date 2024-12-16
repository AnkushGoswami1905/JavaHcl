package Dec_16th;

public class Student {
	String studId;
	String studName;
	int score;
	public Student(String studId, String studName, int score) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.score = score;
	}
	public Student() {
		super();
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", score=" + score + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

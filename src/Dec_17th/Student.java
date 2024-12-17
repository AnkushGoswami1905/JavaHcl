package Dec_17th;

import java.io.Serializable;

public class Student implements Serializable{
	int studId;
	String studName;
	int score;
//	transient String address;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
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
	public Student(int studId, String studName, int score) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.score = score;
	}

}

package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details") // optional
public class StudentEntity {

	@Id
	@Column(name="student_id") // optional if property name and column name are the same, recomended to use even if they are same
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_city")
	private String studentCity;
	
	@Column(name="student_mark")
	private int studentMark;

	// mandatory as the framework has to create an obj of your entity
	public StudentEntity() {
		
	}

	public StudentEntity(int studentId, String studentName, String studentCity, int studentMark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentMark = studentMark;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public int getStudentMark() {
		return studentMark;
	}

	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentMark=" + studentMark + "]";
	}
	
	
}

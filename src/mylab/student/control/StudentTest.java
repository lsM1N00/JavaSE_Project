package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {

	public static void main(String[] args) {
		try {
			Student student = new Student("A110", "김민수", "컴퓨터공학과", 3);
			
			System.out.println("학번 :" + student.getStudentId());
			System.out.println("이름 :" + student.getName());
			System.out.println("전공 :" + student.getMajor());
			System.out.println("학년 :" + student.getGrade());
			
			student.setGrade(5);
			
			
		} catch (InvalidGradeException e) {
			System.out.println("Error 메시지= " + e.getMessage());
		}

	}

}

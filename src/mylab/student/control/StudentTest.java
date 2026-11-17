package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {

	public static void main(String[] args) {
		try {
			Student student = new Student("A110", "김민수", "컴퓨터공학과", 3);
			
			System.out.print(student.getName() + " / ");
			System.out.print(student.getMajor() + " / ");
			System.out.println(student.getGrade());
			
			int grade = 5;
			System.out.println(grade + "학년으로 변경");
			student.setGrade(grade);
			
			
		} catch (InvalidGradeException e) {
			System.out.println(e.getMessage());
		}

	}

}

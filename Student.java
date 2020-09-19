package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private String gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//constructor: prompts user to enter name and year
	public Student(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter students first name");
		this.firstname=in.nextLine();
		
		System.out.print("Enter students last name");
		this.lastname=in.nextLine();
		
		System.out.print("1 - Freshmen\n2- for Sophmore\n3 - Junior\n4 - Senior\nEnter student class level");
		this.gradeYear = in.nextLine();
		
		setStudentID();
	}
	
	//Generate an ID
	private void setStudentID() {
		//Grade Level + static ID
		id++;
		this.studentID = gradeYear +""+ id;
		
	}
	//Enroll in courses
	public void enroll() {
		//Get inside a loop,user hits 0
		do {
			System.out.print("Enter courses to enroll(Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance += costOfCourse;
			}
			else {
				break;
				}
			}while(1 != 0);
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is $" + tuitionBalance);
	}
	
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance= tuitionBalance -payment;
		System.out.println("Thank You for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {
		return "Name: " + firstname + " " + lastname +
				"\nYear:" + gradeYear +
				"\nStudent ID:" + studentID +
				"\nCourses Enrolled :" + courses +
				"\nBalance: $" + tuitionBalance;
	}
	
}

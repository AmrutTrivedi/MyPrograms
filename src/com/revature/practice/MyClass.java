package com.revature.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClass {
	
	public static void main(String args[]) {
		MyClass M1 = new MyClass();
		int sum = 0;

		System.out.println("Enter Name Of the Test:");
		Scanner Sc = new Scanner(System.in);
		String Name = Sc.nextLine();
		System.out.println("Name of the Test:" + Name);

		System.out.println("Enter Number Of Subjects : ");
		Scanner Sc1 = new Scanner(System.in);
		int num = Sc1.nextInt();
		System.out.println("Number Of Subjects are:" + num);

		List<CollegeSubject> l1 = new ArrayList<CollegeSubject>();
		CollegeSubject collegeSubject;
		int totalScore= 0;
		
		for (int i = 0; i <= num; i++) {
			collegeSubject = new CollegeSubject();
			System.out.println("Enter Name of the Subject:");
			Scanner Sub1 = new Scanner(System.in);
			String Subject = Sub1.nextLine();
			collegeSubject.setName(Subject);
			System.out.println("Enter Marks Secured : ");
			int Marks1 = Sub1.nextInt();
			collegeSubject.setScore(Marks1);
			System.out.println("Subject Marks:" + Marks1);
			totalScore = totalScore + Marks1;
			l1.add(collegeSubject);
		}
		System.out.println(totalScore);	
	}
}

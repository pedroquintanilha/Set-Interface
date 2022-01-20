package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        Set<Student> set = new HashSet<>();
		
		System.out.println("Welcome, Professor!");
		System.out.print("How many courses do you teach? ");
		int classes = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i<classes; i++) {
			
			System.out.print("How many students for course " +(i+1) +"? ");
			int numberStudents = sc.nextInt();
			System.out.println("Please enter the data of all students of course " +(i+1) + ":");
			
			for(int j=0; j<numberStudents; j++) {
				
				String data = sc.next();
				String [] str = data.split(",");
				String name = str[0];
				Integer registrationNumber = Integer.parseInt(str[1]);
				set.add(new Student(name, registrationNumber));
							
			}
			
			System.out.println();
		}
		
		System.out.print("You have a total of " +set.size()+ " different students this semester.");
		sc.close();
	}
}
			

	



package Day_45;

import java.util.ArrayList;

import java.util.*;

public class Canvas {
public static void main(String[] args) {
	
	Course course1  = new Course();
	
	course1.setName("Java Programming");
	
	ArrayList<String>teachers = new ArrayList<>();
	teachers.add("Vasyl");
	teachers.add("Murodil");
	teachers.add("Marufjon");
	teachers.add("Muhtar");
	
	course1.setTeachers(teachers);
	System.out.println(course1.toString());
	
	List<String>javaStudents = new ArrayList<>();
	javaStudents.add("Burak");
	javaStudents.add("Roman");
	javaStudents.add("Gulnar");
	course1.setStudents(javaStudents);
	System.out.println(course1.toString());
	
	course1.addTeacher("Maria");
	course1.addStudent("Ecatirina");
	
	if(course1.getTeachers().contains("Maria")) {
		System.out.println("Maria is a teacher");
	}else {
		System.out.println("Maria is not a teacher");
	}
	
	
	if(course1.getStudents().contains("ecatirina")) {
		System.out.println("ecatirina is a student");
	}else {
		System.out.println("ecatirina is not  student");
	}
	
	course1.removeTeacher("Murodil");
	course1.removeStudent("Burak");
	
	
	 if(!course1.getTeachers().contains("Muradil")) {
		 System.out.println("murodil is removed");
	 }else {
		 System.out.println("murodil is still there");
	 }
	
	  if(!course1.getStudents().contains("burak")) {
		  System.out.println("burak is not there");
	  }else {
		  System.out.println("burak is there");
	  }
	  
	  
	
	
}
}

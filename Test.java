package com.CoreJava.JavaReflectionAPI;

import java.lang.reflect.Modifier;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		Class c = Employee.class;
		System.out.println("Class name :- "+c.getName());
		
		System.out.println("Super Class :- "+c.getSuperclass().getName());
		
		Class[] cl = c.getInterfaces();
		System.out.print("Interfaces List :- ");
		
		for(Class cls :cl) {
			System.out.print(" "+cls.getName()+",");
		}
		System.out.println();
		
		int i= c.getModifiers();
		System.out.println("Access Modifier :- "+ Modifier.toString(i));
	}
	
//reflection api we are using to get metadata of particlar class
}

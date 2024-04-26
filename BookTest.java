package com.CoreJava.JavaReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BookTest {
	
	public static void main(String[] args) throws Exception{
		
		Book book =new Book();
		Class c= book.getClass();
		
		Field [] fields=c.getDeclaredFields();
		
		for(Field f: fields) {
			System.out.println("Feild name :- "+f.getName());
			System.out.println("Data type of field :- "+f.getType().getName());
			int i = f.getModifiers();
			String s = Modifier.toString(i);
			System.out.println("Modifiers of field :- "+ s);
			System.out.println("Value of field :- "+f.get(f));
			System.out.println("-------------------------");
			System.out.println("-------------------------");
		}
		
// We are retrieving metadata of methods 
		System.out.println("We are retrieving metadata of methods ");
		
		Method[] methods= c.getDeclaredMethods();
		
		for(Method m:methods) {
			System.out.println("Method Name :- "+m.getName());
			System.out.println("Method Return Type :- "+m.getReturnType().getName());
			int i =m.getModifiers();
			String s = Modifier.toString(i);
			System.out.println("Method's Modifier :- "+s);
			Class[] pts =m.getParameterTypes();
			System.out.println("Parameter Types :- ");
			for(Class pt :pts ){
				System.out.print(pt.getName()+" ");
			}
			System.out.println();
			
			Class[] ets = m.getExceptionTypes();
			System.out.println("Exception Types :- ");
			for(Class et :ets ){
				System.out.print(et.getName()+" ");
			}
			System.out.println();
			
		}
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		// We are retrieving metadata of Constructors 
		System.out.println("We are retrieving metadata of Constructors");
		
		Constructor[] constructors = c.getDeclaredConstructors();
		
		for(Constructor con:constructors) {
			System.out.println("Constructor Name :- "+con.getName());
			
			int i =con.getModifiers();
			String s = Modifier.toString(i);
			System.out.println("Constructor's Modifier :- "+s);
			Class[] pts =con.getParameterTypes();
			System.out.println("Constructor Types :- ");
			for(Class pt :pts ){
				System.out.print(pt.getName()+" ");
			}
			System.out.println();
			
			Class[] ets = con.getExceptionTypes();
			System.out.println("Exception Types :- ");
			for(Class et :ets ){
				System.out.print(et.getName()+" ");
			}
			System.out.println();
			
		}
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
	}

}

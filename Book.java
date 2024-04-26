package com.CoreJava.JavaReflectionAPI;


import java.sql.SQLException;

public class Book {

	public static int bookId = 11;
	
	static String bookName="The Monk who sold ferrari";
	
	public static String auther="Robbbin Sharma";
	
    public Book(){
		
	}

	public Book(int bookId,String bookName,String auther) throws ClassCastException,ArithmeticException{
		
	}
	
    public Book(String bookName,String auther) throws SQLException{
		
	}
    
   public Book(String bookName) throws InterruptedException{
		
	}
	
	public void add(Integer bookId,String bookName,String auther) throws SQLException,ClassCastException {
		System.out.println("Book Added Successfully");
	}
	
	public String search(int bookId) throws ArithmeticException,InterruptedException{
		return "Book Fetched Successfully";
	}
	
	public void delete(int bookId) throws SQLException{
		System.out.println("Book Deleted Successfully");
	}
}

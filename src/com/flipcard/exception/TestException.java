package com.flipcard.exception;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 int array[]=new int[2];
			
			 for(int j=0;j<=3;j++){
					
					System.out.println("print the no- " + array[j]);
					
				}
			 
			int x,i=10;
			x=i/0;
			System.out.println("output of the program--" +x);
			 
						
		}catch(ArithmeticException e){
			
			System.out.println("Exception in program" +e.getMessage());
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
			System.out.println("any Exception with Array" +e.getMessage());
		}finally{
			
			// Note:-- Finally block are used in java to close or realease the Object
			// this block is always be called !
			// This block is not to mandate(Mandetory). but its the part good java practice
			System.out.println("in finally block");
		}
	}

}

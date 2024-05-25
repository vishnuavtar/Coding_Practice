package march5;

// Task5: Write a square method which calculates the square of the given number and throw ArthematicException if number is negtive

public class Exception6 {

 
		 public static void main(String[] args){
		     square(-4);
		 }
		 // user defined method
		 public static void square(Integer num){
		     // if condition
		     if(num<0){
		         // java throw exception inside method
		         throw new ArithmeticException("Number should not be negative!");
		     }
		     // else statement
		     else{
		         System.out.println("The square is: "+num*num);
		     }
		 }
		}


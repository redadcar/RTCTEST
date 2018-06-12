package calculators;

public class Operations {
 public static int sum(int number1,int number2) {
	 return number1+number2;
 }
 
 public static int subtract(int number1,int number2){
 return number1-number2;
 }
 
 public static int multiplication(int number1,int number2) {
	 return number1*number2;
 }
 
 public static int divide(int number1, int number2) throws Exception{
	 if(number2==0) {
		throw new Exception();
	 }
	 return number1/number2;
 }
}
 

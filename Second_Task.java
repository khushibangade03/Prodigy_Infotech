import java.util.Scanner;
 
 public class GuessingGame{
	 
     public static void main(String[] args){
     Scanner scanner =new Scanner(System.in);
     int number = 1 + (int)(25 * Math.random());
	 System.out.println("The Number is choosen between 1 to 25 you have 5 trials to guess the number");
	 int k=5;
	 for(int i=1; i<=k; i++){
		 System.out.println(" Trial " + i );
		 System.out.println("Guess the Number");
		 int input = scanner.nextInt();
		 if(input > number){
			 System.out.println("Oops!! You are Wrong");
			 System.out.println("The number you have guessed is greater than actual number");
		 }
		 else if(input < number){
			 System.out.println("Oops!! You are Wrong");
			 System.out.println("The number you have guessed is lesser than actual number");
		 }
		 else{
			  System.out.println("Congratulations!!");	
			 System.out.println(" You are Correct");
              break	;		 
			 }
			 System.out.println("You lost the Game");
			 System.out.println("The Correct Number is "+ number);
	 }
	
  }
  }

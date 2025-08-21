package Java_brocode_youtube_course2025;
import java.util.*;

public class Random_Number {
	
	public static void main(String[] args) {
		//RANDOM NUMBER GENERTOR
		
		Random random=new Random();
		
		int number1;
		boolean number2;
		double number3;
		
		number1=random.nextInt(1,101);
		number2=random.nextBoolean();
		number3=random.nextDouble();
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		

	}

}

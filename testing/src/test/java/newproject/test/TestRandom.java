package newproject.test;

import java.util.Random;

import org.testng.annotations.Test;

public class TestRandom {

	String phoneNumber="911";
	@Test
	public void tst(){
		 Random random= new Random();
		   /* int x=  random.nextInt(9999);
		    System.out.println(x);
		    phoneNumber=    phoneNumber+x;*/
		    while(phoneNumber.length()<10){
		    	Random random1= new Random();
		    	phoneNumber=phoneNumber+random1.nextInt(9);
		    }
		    System.out.println(phoneNumber);
		    System.out.println(phoneNumber.length());
	}
}

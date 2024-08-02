package com.crm.JavaUtility;

import java.util.Random;

public class JavaUtilitys {

	public int getRandomNumber()
	{
		//create the object of random
		Random r =new Random();
		
		int ran=r.nextInt(400);
		return ran;
	}
}

package testScnearios;

import org.testng.annotations.Test;
import io.restassured.*;

import MainCode.*;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;



public class TestSumOfDigits {


	@Test
	public  void checkZero()
	{
		Example ex=new Example();
		int sum=ex.sumDigits(0);
		Assert.assertTrue(sum==0,"Results  Are not Expected");
		
	}
	@Test
	public  void checkSingleDigit()
	{
		Example ex=new Example();
		int sum=ex.sumDigits(1);
		Assert.assertTrue(sum==1,"Results  Are not Expected");
		
	}
	@Test
	public  void checkMaxNumber()
	{
		Example ex=new Example();
		int sum=ex.sumDigits(1111111111);
		Assert.assertTrue(sum==10,"Results  Are not Expected");
		
	}
}

package com.demo.mavenreplacer.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest
{
	@Parameters(value="myParam")
	@Test
	public void shouldReturnTrue(String param){
		System.out.println("Param injected is: " + param);
		assertThat(param, is("demo"));
	}
	
}

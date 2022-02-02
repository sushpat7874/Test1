package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Test
	@Parameters({"i","j"})
	public void Test5(int i, int j) {
		System.out.println(i+j);
	}
	
	@Test
	@Parameters("class")
	public void Test6(String name) {
		System.out.println(name);
	}
	
}

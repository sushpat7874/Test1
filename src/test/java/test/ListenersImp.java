package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

@Listeners(test.ListenersForCalling.class)
public class ListenersImp {
	
		@Test
		public void Test1() {
				System.out.println("A");
		}
		
		@Test
		public void Test2() {
			int a=5;
			int b=0;
			System.out.println(a/b);
		}
		
		@Test (timeOut=100)
		public void Test3() throws InterruptedException {
			Thread.sleep(200);
			System.out.println("C");
		}
		
		@Test //(dependsOnMethods="Test3")
		public void Test4() {
			System.out.println("D");
		}
		
}
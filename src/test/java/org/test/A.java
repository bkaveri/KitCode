package org.test;


	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class A {
		@Test
		public void test() {
			System.out.println("test1");
		}
		@AfterClass
		public void afterClass() {
			System.out.println("after class");
		}
		@BeforeClass
		public void beforeClass() {
			System.out.println("before class");
		}
		@AfterMethod
		public void afterMethod() {
			System.out.println("after method");
		}
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("before method");

		
		}
	}


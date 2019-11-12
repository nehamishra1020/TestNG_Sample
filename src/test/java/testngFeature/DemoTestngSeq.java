package testngFeature;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoTestngSeq {
  @Test
  public void f() {
	  System.out.println("I am in @test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in @BeforeMethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in @AfterMethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in @BeforeClass annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in @AfterClass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in @Beforetest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in @Aftertest annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am in @BeforeSuite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am in @AfterSuite annotation");
  }

}

package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite 运行了");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite 运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("befor test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
}

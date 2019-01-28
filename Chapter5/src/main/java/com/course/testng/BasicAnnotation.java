package com.course.testng;

import org.testng.annotations.*;


public class BasicAnnotation {
    //基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
        System.out.println("这是测试方法1");
    }

    @Test
    public void testcase2() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
        System.out.println("这是测试方法2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod这是在测试方法前运行");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod这是在测试方法后运行");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass这是在测试类前运行");

    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass这是在测试类后运行");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite这是在测试套件后运行");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite这是在测试套件后运行");
    }
}

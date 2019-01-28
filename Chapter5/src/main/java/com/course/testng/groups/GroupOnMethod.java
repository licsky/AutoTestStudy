package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @Test(groups = "server")
    public void test1() {
        System.out.println("test1 server1");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("test2 server2");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("test3 client3");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("test4 client4");
    }
    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("beforeGroupOnServer");
    }
    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("afterGroupOnServer");
    }
    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("beforeGroupOnClient");
    }
    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("afterGroupOnClient");
    }
}

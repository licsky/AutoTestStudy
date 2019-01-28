package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 什么时候我们需要用到异常测试
     * 在我们期望结果是某一个异常结果
     * 比如说我们传入了某些不合法的参数，程序抛出了异常
     * 也就是说我的预期结果就是这个异常
     */

    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions=RuntimeException.class)
    public void runTimeException(){
        System.out.println("this is exceptiontest.");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions=RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("this my exceptiontest.");
        throw new RuntimeException();

    }
}

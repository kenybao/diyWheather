package com.JDK8;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

import static java.lang.System.*;

/*
  @author 73598.
  @Date 2018/3/12 0012.
  @Time 20:42.
 */
@RunWith(JUnit4.class)
public class _1_LambdaTest {
    /*1.Lambda 表达式
     Lambda 表达式 − Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中。
     Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
     Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
     使用 Lambda 表达式可以使代码变的更加简洁紧凑。

     //性能提升 ：
    (parameters) -> expression
    或
    (parameters) ->{ statements; }
    可参考
    https://www.jianshu.com/p/f02b04344365
    */
    @Test
    public void testLambda() {
        //自己的理解就是 狭义的理解就是接口的实现在局部定义好，不必要重新实现一个接口相当于
        //lambda表达式只能出现在目标类型为函数式接口的上下文中。
        Integer c = 1;
        MathOperation add = (int a, int b) -> a + b;
        MathOperation sub = (a, b) -> a - b - c;//如果c没有声明为final，则隐式转为final
        out.println("10 - 5 - c(" + c + ") = " + sub.operation(10, 5));
        Assert.assertEquals(sub.operation(10, 5),4);
        InterfaceWithDefaultMethod im = (a) -> System.out.println(a);
        im.apply("123");

        List a = Arrays.asList("a", "aaa", "aa", "b", "d");
        for (int i = 0; i < a.size(); i++) {
            System.out.println("old way :"+a.get(i));
        }
        a.forEach(e -> {
            System.out.println("new way :" + e);
        });
        //sort 里的comparator接口实现了FunctionalInterface接口
        Arrays.asList("a", "aaa", "aa", "b", "d").sort((e1, e3) -> e1.compareTo(e3));
        //此处为何编译失败 想不懂 TODO ???
//        List ssa = Arrays.asList("a", "aaa", "aa", "b", "d");  ssa.sort((e1, e2) -> e1.compareTo(e2));
    }
    //MathOperation 是一个接口 接口中含有一个成员函数 operation
    interface MathOperation {
        int operation(int a, int b);
    }

}

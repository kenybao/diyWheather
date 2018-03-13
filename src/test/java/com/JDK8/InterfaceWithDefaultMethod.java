package com.JDK8;

/**
 * @author 73598.
 * @Date 2018/3/13 0013.
 * @Time 10:04.
 */
@FunctionalInterface
//@FunctionalInterface注解来标记你的接口是函数式接口
interface InterfaceWithDefaultMethod {


    void apply(Object obj);
//    void apply2(Object obj); //函数式接口只能声明一个抽象方法

    //same to Object.toString 接口最终有确定的类实现， 而类的最终父类是Object。
    // 因此函数式接口可以定义Object的public方法
    String toString();

    //为什么限定public类型的方法呢？因为接口中定义的方法都是public类型的。
    //clone 是Object中的 protected方法
//    Object colne();

    /*Java 8中允许接口实现方法， 而不是简单的声明， 这些方法叫做默认方法，使用特殊的关键字default。
    因为默认方法不是抽象方法，所以不影响我们判断一个接口是否是函数式接口。*/
    default void say(String name) {
        System.out.println("hello " + name);
    }

    /*Java 8以前的规范中接口中不允许定义静态方法。 静态方法只能在类中定义。 Java 8中可以定义静态方法。
    * http://colobu.com/2014/10/28/secrets-of-java-8-functional-interface/#JDK_8%E4%B9%8B%E5%89%8D%E5%B7%B2%E6%9C%89%E7%9A%84%E5%87%BD%E6%95%B0%E5%BC%8F%E6%8E%A5%E5%8F%A3
    * */
    static void staticIsAvailable() {
        System.out.println("staticIsAvailable");
    }

    //静态代码块依然不被允许在接口中定义
    //    static{
    //        System.out.println("123");
    //    }

}
package com.JDK8;

import org.junit.Test;

import java.util.function.IntConsumer;

/**
 * @author 73598.
 * @Date 2018/3/13 0013.
 * @Time 11:04.
 */
public class _2_ReferencesTest {
    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }

    @Test
    public void testCarNew() {
        Car thief = Car.create(new Supplier<Car>() {
            @Override
            public Car get() {
                return  new Car();
            }
        });
        System.out.println("-------------Constractors构造器引用------------");
//        第一种方法引用的类型是构造器引用，语法是Class::new，或者更一般的形式：Class<T>::new。注意：这个构造器没有参数。
//        因为Car::new 等价于 ()->new Car() 所以 相当于 Supplier supplier = ()->new Car() 即  Supplier supplier = Car::new;
//        以下三种为等价 等价表需要背 主要记住lambda核心就是 函数作为参数列表的一员
        Supplier supplier =  ()->new Car();
        System.out.println(Car.create(supplier).price);

        Supplier supplier1 = Car::new;
        System.out.println(Car.create(supplier1).price);

        System.out.println(Car.create(Car::new).price);


        System.out.println("------------------静态方法引用-----------------");
//        Car::new -> Car::Create();
    }


}

class Car {
    public int price ;

    public static Car create(final _2_ReferencesTest.Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

    Car(int price){
        this.price = price;
    }
    Car(){
        this.price = 10;
    }
}

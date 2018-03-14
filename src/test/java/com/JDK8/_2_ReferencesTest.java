package com.JDK8;

import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;

import static java.lang.System.*;

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
        out.println("-------------Constractors构造器引用 ClassName::new------------");
//        第一种方法引用的类型是构造器引用，语法是Class::new，或者更一般的形式：Class<T>::new。注意：这个构造器没有参数。
//        因为Car::new 等价于 ()->new Car() 所以 相当于 Supplier supplier = ()->new Car() 即  Supplier supplier = Car::new;
//        以下三种为等价 等价表需要背 主要记住lambda核心就是 函数作为参数列表的一员
        Supplier supplier =  ()->new Car();
        Supplier supplier1 = Car::new;

        out.println(Car.create(supplier).price);
        out.println(Car.create(supplier1).price);

        out.println(Car.create(()->new Car()).price);
        out.println(Car.create(Car::new).price);


        out.println("------------------静态方法引用 ClassName::staticMethodName -----------------");
//        Car::new -> Car::Create();
        Car car = Car.create(Car::new);
        Car car2 = Car.create(Car::new);
        car.price = 2;
        final List< Car > cars = Arrays.asList( car,car2 );
        //以下方式等价
        cars.forEach(item -> Car.collide(item));
        cars.forEach(Car::collide);
        //以下方式等价
        cars.forEach((item->Car.collide(item,new Car(3))));
        for (Car item : cars){
            Car.collide(item,new Car(3) );
        }
//        cars.forEach(Car::collide);//TODO 多参数时该如何写

        out.println("------------------实例方法引用-----------------");
        cars.forEach(anothersss ->car.follow(anothersss));//anotherss 为 follow的入参 需和follow参数列表car.follow(anothersss) 中的名称一致
        cars.forEach(car::follow);


        out.println("------------------Object方法引用-----------------");

        //TODO
    }


}

class Car {
    public int price ;

    public static Car create(final _2_ReferencesTest.Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        out.println("Collided " + car.toString());
    }
    public static void collide(final Car car,final Car car2) {
        out.println("Collided " + car2.toString()+"\n And  Collided " + car2.toString());
    }

    public void follow(final Car another) {
        out.println("Following the " + another.toString());
    }

    public void repair() {
        out.println("Repaired " + this.toString());
    }

    Car(int price){
        this.price = price;
    }
    Car(){
        this.price = 10;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }
}

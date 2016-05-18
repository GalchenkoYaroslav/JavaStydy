package mashines;

import cats.Cat;
import mashines.Car;
import mashines.Mashine;
import mashines.Moto;

import java.awt.*;
import java.io.BufferedInputStream;
import java.util.*;
import java.util.List;


/**
 * Created by Yaroslav on 19.04.2016.
 */
public class General {

    static int age;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String valueAge = scanner.next();
//        System.out.println();
//        General den = new General();
//          Cat cat = new Cat();
////        SmallCat smallCat = new SmallCat();
////        BigCat bigCat = new BigCat();
////        say(cat);
////        say(smallCat);
////        say(bigCat);
////
//        List list = new ArrayList<>();
//        Map map = new TreeMap<String, String>();
//        Mashine mashineCar = new Car();
//        Mashine mashineMoto = new Moto();
//        Car car = new Car();
//        doDrive(mashineMoto);
//        doDrive(mashineCar);
//        System.out.println();
        sayAge(valueAge);

    }

//    static void say(Cat cat){
//        cat.sayHello();


// }

    static void doDriveByCar(Car mashine){
        mashine.drive();
    }
    static void doDrive(Mashine mashine) {
      mashine.drive();
    }

    static void sayAge(String ageParam) {
     age = Integer.valueOf(ageParam);
        age+=10;
        System.out.println(age);
    }
    }
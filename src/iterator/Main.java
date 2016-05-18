package iterator;

import mashines.Car;
import study.abstract_classes.Audi;

import java.util.*;

/**
 * Created by Yaroslav on 17.05.2016.
 */
public class Main {

    // Створити колекцію Map покласти туди 5 обєктів типу Car
    // через Ітератор присвоїти petrol і в натупному ітераторі вивети знгачення petrol всіх машин
    // реалізувати Scanner для введення petrol в ітераторі

    public static void main(String[] args) {
        int j = 90;
        Car massCars[] = new Car[3];

        Audi carAudi = new Audi();
        Car carDodge = new Car();
        Car carMazda = new Car();
        Car carLada = new Car();
        Car carTavria = new Car();

        //Sets
        Set<Car> hashSet = new HashSet<>();
        Set<Car> treeSet = new TreeSet<>();

//        hashSet.add(carAudi);
        hashSet.add(carDodge);
        hashSet.add(carLada);

        Iterator<Car> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            Car element = iterator.next();
            element.setPetrol(j);
            j++;
            //  System.out.println(element.getPetrol() +" Hello");
        }

        iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Car element = iterator.next();
            System.out.println(element.getPetrol() + " Hello");
        }


        //Map
        Map<String, Object> map = new HashMap<>();

        map.put("Audi", carAudi);
        map.put("Audi", carLada);

        map.keySet();
        System.out.println(map.get("Audi"));

        System.out.println(map.get("Audi"));


//         LinkedList and ArrayList
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(carDodge);
        cars.add(carMazda);
        cars.add(carLada);
        ArrayList<Car> badCars = new ArrayList();
        badCars.add(carLada);
        badCars.add(carTavria);
        System.out.println("Elements in start " + cars.size());
        cars.retainAll(badCars);
        System.out.println("Elements in finish " + cars.size());
        System.out.println("Elements in finish (bad cars) " + badCars.size());

        Iterator<Car> iteratorNew = cars.iterator();

        while (iterator.hasNext()) {
            Car element = iterator.next();
            element.setPetrol(7);
        }
        for (int i = 0; i < 3; i++) {
            massCars[i] = new Car();
            massCars[i].setPetrol(11);


        }
    }
}

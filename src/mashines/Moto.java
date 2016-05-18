package mashines;

/**
 * Created by Yaroslav on 26.04.2016.
 */
public class Moto implements Mashine, Design {
   int petrol;
    @Override
    public void drive() {
        System.out.println("Drive by Moto!");
    }
    @Override
    public int countPetrol() {
        return petrol;
    }

    @Override
    public void doColor(String colorName) {

    }
}
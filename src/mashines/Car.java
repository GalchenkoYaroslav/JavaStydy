package mashines;

/**
 * Created by Yaroslav on 26.04.2016.
 */
public class Car implements Mashine, Design{

    String carColor;

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public int getPetrol() {
        return petrol;
    }

    int petrol;

    @Override
    public void drive() {
        System.out.println("Drive by Car!");
    }

    @Override
    public int countPetrol() {
        return petrol;
    }

    @Override
    public void doColor(String colorName) {
        carColor = colorName;
    }


    @Override
    public String toString() {
        return "Car";
    }
}

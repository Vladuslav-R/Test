
public class Tayota extends Car {
    public Tayota(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void drive() {
        System.out.println("дааа детка");
    }

    public void vozitDevchul () {
        System.out.println("я пушка");
    }
}

package HW9;

public class Wolf extends Predator {
    public Wolf(String area, int velocity, String color) {
        super(area, velocity, color);
    }

    @Override
    public void hunt() {
        System.out.println("Around a cows");
    }

    @Override
    public String toString() {
        return "Wolf";
    }

    @Override
    public void sounds() {
        System.out.println("Wyyyyyy");
    }

    @Override
    public void typeOfMoving() {
        System.out.println("Silent");
    }
}

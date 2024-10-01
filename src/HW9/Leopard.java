package HW9;

public class Leopard extends Predator {
    private String name;

    public String getName() {
        return name;
    }

    public Leopard(String area, int velocity, String color, String name) {
        super(area, velocity, color);

        this.name = name;
    }

    @Override
    public void hunt() {
        System.out.println("Chase a cow");
    }

    @Override
    public String toString() {
        return "Leoperd";
    }

    @Override
    public void sounds() {
        System.out.println("Meo-meo");
    }

    @Override
    public void typeOfMoving() {
        System.out.println("So fast");
    }
}

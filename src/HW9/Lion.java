package HW9;

public class Lion extends Predator {
    private String name;

    public Lion(String area, int velocity, String color, String name) {
        super(area, velocity, color);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void hunt() {
        System.out.println(name + " hunts");
    }

    @Override
    public String toString() {
        return "Lion is" + name;
    }

    @Override
    public void sounds() {
        System.out.println("R-r-r-r-r");
    }

    @Override
    public void typeOfMoving() {
        System.out.println("Fast");
    }
}

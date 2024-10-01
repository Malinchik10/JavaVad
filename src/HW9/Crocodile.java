package HW9;

public class Crocodile extends Predator {
    public String getType() {
        return type;
    }

    private String type;

    public Crocodile(String area, int velocity, String color, String type) {
        super(area, velocity, color);

        this.type = type;
    }

    @Override
    public void hunt() {
        System.out.println("Jump to a cow");
    }

    @Override
    public String toString() {
        return "Crocodile " + type ;
    }

    @Override
    public void sounds() {
        System.out.println("......");
    }

    @Override
    public void typeOfMoving() {
        System.out.println("swim");
    }
}

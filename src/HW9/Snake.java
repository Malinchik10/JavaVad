package HW9;

public class Snake extends Predator{
    public Snake(String area, int velocity, String color, String type) {
        super(area, velocity, color);

        this.type = type;
    }

    public String getType() {
        return type;
    }

    private String type;


    @Override
    public void hunt() {
        System.out.println(type + " of snake hunts");
    }

    @Override
    public String toString() {
        return "Snake " + type;
    }

    @Override
    public void sounds() {
        System.out.println("Sh-sh-sh");
    }

    @Override
    public void typeOfMoving() {
        System.out.println("Crawl");
    }
}

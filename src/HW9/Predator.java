package HW9;

public abstract class Predator {
    protected String area;
    protected int velocity;
    protected String color;

    public Predator(String area, int velocity, String color)
    {
        this.area = area;
        this.velocity = velocity;
        this.color = color;
    }


    public abstract void hunt();

    public abstract String toString();

    public abstract void sounds();

    public abstract void typeOfMoving();
}

package HW10;

public class RobotSample {
    public static void main(String[] args)
    {
        IRobot robot = new RobotCook("Повар", 1000, "Kongo", new Aggregate("Печь"));
        robot.create();
    }
}

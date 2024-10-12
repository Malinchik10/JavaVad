package HW10;

import java.util.List;

public class ShowRoom {
    private List<IRobot> robots;
    private String name;

    public ShowRoom(String name, List<IRobot> robots)
    {
        this.robots = robots;
        this.name = name;
    }

    public void init()
    {
        for (IRobot robot : robots)
        {
            robot.create();
        }
    }

    public void printPossibility()
    {
        System.out.println(name + " представляет роботов:");
        int index = 1;
        for (IRobot robot : robots)
        {
            System.out.println("Робот " + index++ + " умеет: " + robot.uniquePossibility());
        }

        System.out.println();
    }
}

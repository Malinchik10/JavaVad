package HW10;

import java.util.ArrayList;
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

    public void print()
    {
        for (IRobot robot : robots)
        {
            System.out.println("Робот умеет: " + robot.uniquePossibility());
        }
    }
}

package HW10;

import java.util.List;

public class ShowRoom {
    private List<IRobot> robots;
    private String name;

    public ShowRoom()
    {
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

    public void clean()
    {
        robots.clear();
        this.name = null;
    }

    public void addExposition(String expositionName, List<IRobot> robots)
    {
        this.name = expositionName;
        this.robots.addAll(robots);
    }
}

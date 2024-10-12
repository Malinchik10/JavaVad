package HW10;

import java.util.ArrayList;
import java.util.List;

public class ShowRoom {
    private List<IRobot> robots;
    private String name;

    public ShowRoom()
    {
        this.robots = new ArrayList<>();
        System.out.println("Создание выставки!");
    }

    public void init()
    {
        System.out.println("Распаковка роботов:");
        for (IRobot robot : robots)
        {
            robot.create();
        }
    }

    public void printPossibility()
    {
        System.out.println("Экспозиция " + name + " представляет роботов:");
        int index = 1;
        for (IRobot robot : robots)
        {
            System.out.println("Робот " + index++ + " умеет: " + robot.uniquePossibility());
        }
    }

    public void clean()
    {
        robots.clear();
        this.name = null;
        System.out.println("Очистка экспозиции");
    }

    public void addExposition(String expositionName, List<IRobot> robots)
    {
        this.name = expositionName;
        this.robots.addAll(robots);

        System.out.println("Создание экспозиции " + name);
    }
}

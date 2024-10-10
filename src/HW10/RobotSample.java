package HW10;

import java.util.ArrayList;
import java.util.List;

public class RobotSample {
    public static void main(String[] args)
    {
        IRobot cook = new RobotCook("Повар", 1000, "Kongo", new Aggregate("Печь"));
        IRobot sapper = new RobotSapper("Сапер",1000, new Aggregate("Металлоискатель"), "Сталь");
        IRobot builder = new RobotBuilder("Строитель", 1500, "Italy", new Aggregate("Кузов"), "Титан");

        List<IRobot> box = new ArrayList<IRobot>();
        box.add(cook);
        box.add(sapper);
        box.add(builder);

        ShowRoom presentation = new ShowRoom("Выставка всех роботов", box);
        presentation.init();
        presentation.print();
    }
}

package HW10;

import java.util.ArrayList;
import java.util.List;

public class MainRobots {
    public static void main(String[] args)
    {
        List<IRobot> box = createCollectionOfAllRobots();
        ShowRoom presentation = new ShowRoom("Выставка всех роботов", box);
        presentation.init();
        presentation.printPossibility();

        List<IRobot> boxOfEng = createCollectionOfEngeneringRobots();
        ShowRoom presentation2 = new ShowRoom("Выставка инженеров", boxOfEng);
        presentation2.init();
        presentation2.printPossibility();

        List<IRobot> boxOfSappers = createCollectionOfEngeneringRobots();
        ShowRoom presentation3 = new ShowRoom("Выставка саперов", boxOfSappers);
        presentation2.init();
        presentation2.printPossibility();
    }

    private static List<IRobot> createCollectionOfAllRobots()//return box
    {
        IRobot cook = new RobotCook("Повар", 1000, "Kongo", new Aggregate("Печь"));
        IRobot sapper = new RobotSapper("Сапер",1000, new Aggregate("Металлоискатель"), "Сталь");
        IRobot sapper2 = new RobotSapper("Сапер2",1200, new Aggregate("Металлоискатель"), "Сталь");
        IRobot builder = new RobotBuilder("Строитель", 1500, "Italy", new Aggregate("Кузов"), "Титан");

        ArrayList<IRobot> box = new ArrayList<IRobot>();//интерфейс IRobot
        box.add(cook); //новый экземпляр класса box ; this. - этот класс, как объект - динамический
        box.add(sapper);
        box.add(sapper2);
        box.add(builder);

        return box;
    }

    private static List<IRobot> createCollectionOfEngeneringRobots()
    {
        IEngineerRobot sapper = new RobotSapper("Сапер",1000, new Aggregate("Металлоискатель"), "Сталь");
        IEngineerRobot sapper2 = new RobotSapper("Сапер2",1200, new Aggregate("Металлоискатель"), "Сталь");
        IEngineerRobot builder = new RobotBuilder("Строитель", 1500, "Italy", new Aggregate("Кузов"), "Титан");

        List<IRobot> box = new ArrayList<IRobot>();
        box.add(sapper);
        box.add(sapper2);
        box.add(builder);

        return box;
    }
    private static List<IRobot> createCollectionOfSapperRobots()
    {
        RobotSapper sapper = new RobotSapper("Сапер",1000, new Aggregate("Металлоискатель"), "Сталь");
        RobotSapper sapper2 = new RobotSapper("Сапер2",1200, new Aggregate("Металлоискатель"), "Сталь");
        RobotSapper sapper3 = new RobotSapper("Сапер3",1000, new Aggregate("Щуп"), "Сталь");

        List<IRobot> box = new ArrayList<IRobot>();
        box.add(sapper);
        box.add(sapper2);
        box.add(sapper3);

        return box;
    }
}

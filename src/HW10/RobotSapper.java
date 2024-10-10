package HW10;

public class RobotSapper extends Robot implements IEngineerRobot {
    String material;
    public RobotSapper(String model, int power, Aggregate aggregate, String material)
    {
        super(model, power, null, aggregate);

        this.material = material;
    }

    @Override
    public void create() {
        this.status = EStatus.Work;
        System.out.println(String.format("Robot '%s' created!", model));
    }

    @Override
    public void repair() {
        this.status = EStatus.Work;
    }

    @Override
    public void exchangeMainAggregate(Aggregate aggregate) {
        exchangeAggregate(aggregate);
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public String uniquePossibility() {
        return "Разминирование";
    }

    @Override
    public void solveTask() {

    }
}

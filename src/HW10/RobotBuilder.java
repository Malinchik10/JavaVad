package HW10;

public class RobotBuilder extends Robot implements IEngineerRobot{

    String material;
    public RobotBuilder(String model, int power, String madeIn, Aggregate aggregate, String material)
    {
        super(model, power, madeIn, aggregate);
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
    } //

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
        return "Строит";
    }

    @Override
    public void solveTask() {

    }
}


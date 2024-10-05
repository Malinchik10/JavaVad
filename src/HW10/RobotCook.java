package HW10;

public class RobotCook extends Robot implements IRobot{


    public RobotCook(String model, int power, String madeIn, Aggregate aggregate)
    {
        super(model, power, madeIn, aggregate);
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
}

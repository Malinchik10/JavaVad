package HW10;

public class RobotBuilder implements IEngineerRobot {
    EStatus status;
    String model;
    int power;
    Aggregate aggregate;
    String madeIn;
    boolean isOn;
    String material;

    public RobotBuilder(String model, int power, String madeIn, Aggregate aggregate, String material)
    {
        this.model = model;
        this.power = power;
        this.madeIn = madeIn;
        this.aggregate = aggregate;
        this.material = material;
    }

    public void create() {
        this.status = EStatus.Work;
        System.out.println(String.format("Robot '%s' created!", model));
    }

    public void repair() {
        this.status = EStatus.Work;
    } //

    public void exchangeMainAggregate(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public String uniquePossibility() {
        return "Строит";
    }

    public void solveTask() {

    }
}


package HW10;

public abstract class Robot {
    protected EStatus status;
    protected String model;
    protected int power;
    protected Aggregate aggregate;

    protected String madeIn;

    protected boolean isOn;

    protected Robot(String model, int power, String madeIn, Aggregate aggregate)
    {
        this.model = model;
        this.power = power;
        this.madeIn = madeIn;
        this.aggregate = aggregate;

        this.status = EStatus.NotCreated;
    }

    protected void exchangeAggregate(Aggregate aggregate)
    {
        this.aggregate = aggregate;
    }
}

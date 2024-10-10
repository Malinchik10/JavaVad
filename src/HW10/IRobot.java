package HW10;

public interface IRobot {
    void create();
    void repair();
    void exchangeMainAggregate(Aggregate aggregate);
    void on();
    void off();
    String uniquePossibility ();
}

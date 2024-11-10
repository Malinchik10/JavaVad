package HW_16;

public class Car {
    private String _model;
    private int _timeout;
    private int _distance;

    public Car(String model, int timeout, int distance)
    {
        _model = model;
        _timeout = timeout;
        _distance = distance;
    }

    public void Drive()
    {
        for (int i = 0; i < _distance; i++) {
            System.out.println("Driving " + _model);
            try {
                Thread.sleep(_timeout);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

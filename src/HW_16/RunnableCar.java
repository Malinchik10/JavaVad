package HW_16;

public class RunnableCar implements Runnable{
    private String _model;
    private int _timeout;
    private int _distance;

    public RunnableCar(String model, int timeout, int distance)
    {
        _model = model;
        _timeout = timeout;
        _distance = distance;
    }

    @Override
    public void run() {
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

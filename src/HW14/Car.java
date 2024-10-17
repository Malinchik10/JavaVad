package HW14;

import java.io.Serializable;

public class Car implements Serializable {
    public String model;
    public int velocity;

    public Car(String model, int velocity) {
        this.model = model;
        this.velocity = velocity;
    }
}

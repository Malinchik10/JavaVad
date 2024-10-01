package HW9;

public class PredatorSample {

    public static void main(String[] args) {

        var leo = new Leopard("Asia", 30, "Yellow", "Leo");
        var lion = new Lion("Africa", 30, "Yellow", "Tom");
        var snake = new Snake("Africa", 10, "black", "cobra");

        Predator[] predators = { leo, lion, snake };
        for (Predator predator : predators) {
            predator.hunt();
        }

    }

}

package HW8;

public class Bird extends Animal {
    private String species;
    private int maxAltitude;

    public Bird(String color, String species, int maxAltitude) {
        super(color);

        this.species = species;
        this.maxAltitude = maxAltitude;
    }

    public void song() {
        System.out.println(species + "songs sth");
    }

    public void eat() {
        System.out.println(species + " eat fruits");
    }

    public void care() {
        System.out.println(species + " cares");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", maxAltitude=" + maxAltitude +
                '}';
    }

//    @Override
//    public String toString() {
//        return "hello";
//    }

    @Override
    public void say() {
        System.out.println(species + " songs");
    }
}

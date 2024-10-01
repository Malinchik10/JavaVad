package HW8;

public class Bird extends Animal {
    private String species;
    private int maxAltitude;

    public Bird(String color, String species, int maxAltitude)
    {
        super(color);

        this.species = species;
        this.maxAltitude = maxAltitude;
    }

    public void Song()
    {
        System.out.println(species + "songs sth");
    }

    public void eat()
    {
        System.out.println(species + " eat worms");
    }

    public void care()
    {
        System.out.println(species + " cares");
    }

    @Override
    public void say() {
        System.out.println(species + " songs");
    }
}

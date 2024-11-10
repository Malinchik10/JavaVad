package HW_17;

public class City {
    private final int _id;

    public String get_name() { return _name; }
    private final String _name;

    public int get_population() { return _population; }
    private final int _population;

    public Continent get_continent() { return _continent; }
    private final Continent _continent;

    public City(int id, String name, int population, Continent continent) {
        _id = id;
        _name = name;
        _population = population;
        _continent = continent;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s, population = %d, location = %s", _id, _name, _population, _continent);
    }
}

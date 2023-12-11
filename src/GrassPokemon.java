public class GrassPokemon extends Pokemon{

    private double height;
    private int weight;
    public GrassPokemon(String name, String food, double height, int weight) {
        super(name, food);
        this.height = height;
        this.weight = weight;
    }

    public void printHeightWeight() {
        System.out.println(getName() + " weighs " + getWeight() + " and is " + getHeight() + " tall");
    }

    public void leechSeed() {
        System.out.println(getName() + " is throwing a leech seed");
    }

    @Override
    public String toString() {
        return "GrassPokemon{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

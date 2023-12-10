public class GrassPokemon extends Pokemon{

    private double height;
    private int weight;
    public GrassPokemon(String name, String food, double height, int weight) {
        super(name, food);
        this.height = height;
        this.weight = weight;
    }

//    Hier moeten nog 2 methodes komen

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

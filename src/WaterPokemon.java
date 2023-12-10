public class WaterPokemon extends Pokemon{
    private String sound;
    private int defence;
    public WaterPokemon(String name, String food, String sound, int defence) {
        super(name, food);
        this.sound = sound;
        this.defence = defence;
    }

//    Hier moeten nog 2 methodes komen

    public void speaks(){
        System.out.println(getName() + " says: " + getSound());
    }


    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}

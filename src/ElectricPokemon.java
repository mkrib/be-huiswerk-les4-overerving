public class ElectricPokemon extends Pokemon{

    private int level;
    private int hp;

    public ElectricPokemon(String name, String food, int level, int hp) {
        super(name, food);
        this.level = level;
        this.hp = hp;
    }

    public void levelUp() {
        System.out.println("Good job! " + getName() + " has now reached level " + (getLevel() + 1));
    }

    public void scratch() {
        System.out.println(getName() + " scratches ");
    }

    @Override
    public String toString() {
        return "ElectricPokemon{" +
                "level=" + level +
                ", xp=" + hp +
                '}';
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

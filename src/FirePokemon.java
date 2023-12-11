public class FirePokemon extends Pokemon{
    private int attack;
    private int accuracy;
    public FirePokemon(String name, String food, int attack, int accuracy) {
        super(name, food);
        this.attack = attack;
        this.accuracy = accuracy;
    }

    public void thunderPunch() {
        System.out.println(getName() + " is doing a thunder punch");
    }
    public void solarBeam() {
        System.out.println(getName() + " is sending a solar beam");
    }

    public void printAttack() {
        System.out.println(getName() + " has attack level: " + getAttack());
    }

    @Override
    public String toString() {
        return "FirePokemon{" +
                "attack=" + attack +
                ", accuracy=" + accuracy +
                '}';
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}

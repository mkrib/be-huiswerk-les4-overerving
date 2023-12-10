public class FirePokemon extends Pokemon{
    private int attack;
    private int accuracy;
    public FirePokemon(String name, String food, int attack, int accuracy) {
        super(name, food);
        this.attack = attack;
        this.accuracy = accuracy;
    }

//    Hier moeten nog 2 methodes komen
    public void thunderPunch() {
        System.out.println(getName() + " is attacking you with a thunder punch");
    }
    public void solarBeam() {
        System.out.println(getName() + " is attacking you with a solar beam");
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

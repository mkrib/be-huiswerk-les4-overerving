public class Main {
    public static void main(String[] args) {
        FirePokemon firePokemon = new FirePokemon("Charmander", "grass", 200, 5);
        WaterPokemon waterPokemon = new WaterPokemon("Empoleon", "plankton", "beep beep", 6);
        GrassPokemon grassPokemon = new GrassPokemon("Oddish", "seeds", 0.5, 5);
        ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu", "leafs", 4, 35);
        firePokemon.introduce();
        firePokemon.printAttack();
        firePokemon.solarBeam();
        firePokemon.thunderPunch();
        System.out.println(" ");

        waterPokemon.introduce();
        waterPokemon.printDefence();
        waterPokemon.speaks();
        waterPokemon.eats();
        System.out.println(" ");

        grassPokemon.introduce();
        grassPokemon.printHeightWeight();
        grassPokemon.leechSeed();
        System.out.println(" ");

        electricPokemon.introduce();
        electricPokemon.eats();
        electricPokemon.scratch();
        electricPokemon.levelUp();
        System.out.println(" ");

    }
}

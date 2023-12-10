public class Pokemon {
    private String name;
    private String food;

    public Pokemon(String name, String food) {
        this.name = name;
        this.food = food;
    }

    // Hier moeten nog 2 methodes komen

    public void eats() {
        System.out.println(getName() + " is eating " + getFood());
    }

    public void introduce(){
        System.out.println("Hi, my name is " + getName());
    }

    //    Getter moet een returnwaarde hebben
    public String getName(){
        return name;
    }

//    Setter hoeft niets te returnen, dus void. Wel aangeven welke waarde de setter gaat ontvangen als parameter (in dit geval name).
    public void setName(String name){
        if (name != null) {
            this.name = name;
        }
    }

    public String getFood(){
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

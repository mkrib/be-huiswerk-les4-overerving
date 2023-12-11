public class Pokemon {
    private String name;
    private String food;

    public Pokemon(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public void eats() {
        System.out.println(getName() + " is eating " + getFood());
    }

    public void introduce(){
        System.out.println("Hi, my name is " + getName());
    }

    public String getName(){
        return name;
    }

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

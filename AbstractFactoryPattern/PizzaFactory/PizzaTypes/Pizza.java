package AbstractFactoryPattern.PizzaFactory.PizzaTypes;

public abstract class Pizza {
    public abstract void prepare();
    String name;
    Pizza dough,cheese,pepperoni,sauce;
    public void bake(){
        System.out.println("Preparing...");
    }
    public void cut(){
        System.out.println("Cutting...");
    }
    public void pack(){
        System.out.println("packing...");
    }
    public String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
}

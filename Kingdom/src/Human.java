public class Human {
    private String name;
    protected int health;

    public Human(String name) {
        this.name = name;
        PopulationObserver.incresePopulation();
        System.out.println(name+ ". Population : "+ PopulationObserver.getPopulation());
    }

    public String getName() {
        return name;
    }
}

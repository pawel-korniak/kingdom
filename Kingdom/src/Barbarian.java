public class Barbarian extends Human implements ConstructedPerson {
    public Barbarian(String name,int health) {
        super(name);
        this.health = health;
    }

    @Override
    public void attack(CanBeDamaged arg) {

    }

    @Override
    public void acceptDamage(int damage) {

    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String getTheName() {
        return null;
    }
}

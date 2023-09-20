package patternvisiteur;

public class Zombie implements Enemy {
	private String name;
    private int health;

    public Zombie(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
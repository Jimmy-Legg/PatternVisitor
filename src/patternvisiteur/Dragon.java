package patternvisiteur;

class Dragon implements Enemy {
    private String name;
    private int health;

    public Dragon(String name, int health) {
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

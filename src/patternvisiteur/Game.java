package patternvisiteur;
import java.util.ArrayList;
import java.util.List;

public class Game {
	public static void main(String[] args) {
		List<Enemy> enemies = new ArrayList<>();
		enemies.add(new Squelette("Squelette 1", 50));
		enemies.add(new Dragon("Dragon 1", 1000));
		enemies.add(new Zombie("Zombie 1", 30));
		enemies.add(new Pigmen("Pigmen 1", 30));

		StatsDisplayVisitor visitor = new StatsDisplayVisitor();

		for (Enemy enemy : enemies) {
			enemy.accept(visitor);
		}
	}
}

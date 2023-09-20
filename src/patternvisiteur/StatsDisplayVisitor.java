package patternvisiteur;


public class StatsDisplayVisitor implements Visitor {
    @Override
    public void visit(Squelette squelette) {
        System.out.println("Stats du gobelin :");
        System.out.println("Nom : " + squelette.getName());
        System.out.println("Points de vie : " + squelette.getHealth());
        // Afficher d'autres statistiques spécifiques aux gobelins
    }

    @Override
    public void visit(Dragon dragon) {
        System.out.println("Stats du dragon :");
        System.out.println("Nom : " + dragon.getName());
        System.out.println("Points de vie : " + dragon.getHealth());
        // Afficher d'autres statistiques spécifiques aux dragons
    }

    @Override
    public void visit(Zombie zombie) {
        System.out.println("Stats du zombie :");
        System.out.println("Nom : " + zombie.getName());
        System.out.println("Points de vie : " + zombie.getHealth());
        // Afficher d'autres statistiques spécifiques aux zombies
    }
    @Override
    public void visit(Pigmen pigmen) {
        System.out.println("Stats du pigmen :");
        System.out.println("Nom : " + pigmen.getName());
        System.out.println("Points de vie : " + pigmen.getHealth());
        // Afficher d'autres statistiques spécifiques aux zombies
    }
}

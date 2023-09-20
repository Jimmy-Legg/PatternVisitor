package patternvisiteur;

public interface Visitor {
    void visit(Squelette squelette);
    void visit(Dragon dragon);
    void visit(Zombie zombie);
    void visit(Pigmen pigmen);
}


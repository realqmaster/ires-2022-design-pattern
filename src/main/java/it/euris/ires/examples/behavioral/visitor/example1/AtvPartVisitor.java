package it.euris.ires.examples.behavioral.visitor.example1;

public interface AtvPartVisitor {

    void visit(Fender fender);

    void visit(Oil oil);

    void visit(Wheel wheel);

    void visit(PartsOrder partsOrder);

}

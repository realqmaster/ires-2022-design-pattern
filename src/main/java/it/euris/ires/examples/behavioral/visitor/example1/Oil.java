package it.euris.ires.examples.behavioral.visitor.example1;

public class Oil implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}

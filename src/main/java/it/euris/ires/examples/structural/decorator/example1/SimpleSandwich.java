package it.euris.ires.examples.structural.decorator.example1;

public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}

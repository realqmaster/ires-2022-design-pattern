package it.euris.ires.examples.behavioral.command.example1;

// invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}

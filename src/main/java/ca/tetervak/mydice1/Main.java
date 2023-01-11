package ca.tetervak.mydice1;

import ca.tetervak.mydice1.model.Die;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        out.println("Hello from MyDice1 App!");

        Die die = new Die();
        out.println("Initial die value: " + die.getValue());

        out.print("Die rolling values:");
        for (int i = 1; i <= 5; i++) {
            die.roll();
            out.print(" " + die.getValue());
        }
        out.println();

        die.reset();
        out.println("Die reset value: " + die.getValue());

        out.println("See you later!");
    }
}

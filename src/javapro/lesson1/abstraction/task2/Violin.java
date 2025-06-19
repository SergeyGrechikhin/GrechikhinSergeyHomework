package javapro.lesson1.abstraction.task2;

public class Violin extends MusicalInstrument{
    public Violin(String instrumentType) {
        super(instrumentType);
    }

    @Override
    public void PrintTypeInstrument() {
        super.PrintTypeInstrument();
    }

    @Override
    void playNote() {
        System.out.println("Fa");

    }
}

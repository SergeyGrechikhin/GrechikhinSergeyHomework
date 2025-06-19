package javapro.lesson1.abstraction.task2;

public class Guitar extends MusicalInstrument{
    public Guitar(String instrumentType) {
        super(instrumentType);
    }

    @Override
    public void PrintTypeInstrument() {
        super.PrintTypeInstrument();
    }

    @Override
    void playNote() {
        System.out.println("Do");

    }
}

package javapro.lesson1.abstraction.task2;

public class Piano extends MusicalInstrument{
    public Piano(String instrumentType) {
        super(instrumentType);
    }

    @Override
    void playNote() {
        System.out.println("Mi");
    }

    @Override
    public void PrintTypeInstrument() {
        super.PrintTypeInstrument();
    }
}

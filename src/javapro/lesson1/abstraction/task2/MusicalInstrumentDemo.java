package javapro.lesson1.abstraction.task2;

public class MusicalInstrumentDemo {
    public static void main(String[] args) {
        MusicalInstrument musicalInstrument1 = new Guitar("Guitar");
        MusicalInstrument musicalInstrument2 = new Piano("Piano");
        MusicalInstrument musicalInstrument3 = new Violin("Violin");
       musicalInstrument1.PrintTypeInstrument();
        musicalInstrument1.playNote();
        musicalInstrument2.PrintTypeInstrument();
        musicalInstrument2.playNote();
        musicalInstrument3.PrintTypeInstrument();
        musicalInstrument3.playNote();
    }
}

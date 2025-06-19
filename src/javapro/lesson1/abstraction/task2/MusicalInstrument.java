package javapro.lesson1.abstraction.task2;

abstract class MusicalInstrument {
private String instrumentType;

    public MusicalInstrument(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }
   abstract  void playNote();
    public void PrintTypeInstrument(){
        System.out.println("Instrument Type");
        System.out.println("Device " + instrumentType);
    }
}

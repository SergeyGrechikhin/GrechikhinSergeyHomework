package javapro.homework2.task1;

public class Cat implements Animal {
   private String animalname;

    public Cat(String animalname) {
        this.animalname = animalname;
    }

    public String getAnimalname() {
        return animalname;
    }

    @Override
    public String getType() {
        return "Cat";
    }

}

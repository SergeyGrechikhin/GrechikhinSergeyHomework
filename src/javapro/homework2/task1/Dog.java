package javapro.homework2.task1;

public class Dog implements Animal {
   private String animalname;

    public Dog(String animalname) {
        this.animalname = animalname;
    }

    public String getAnimalname() {
        return animalname;
    }

    @Override
    public String getType() {
        return "Dog";
    }


}

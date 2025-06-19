package javapro.homework2.task1;

public class AnimalService {
    boolean found = false;
    public void printOnlyDogs(Animal[] animal) {
        for (int i = 0; i < animal.length; i++) {
            if("Dog".equals(animal[i].getType())){
                Dog dog = (Dog) animal[i];

                System.out.println("Dog with name " + dog.getAnimalname());
                found = true;
            }
        }
        if(!found){
            System.out.println("Dogs not found");
        }

    }
}

package javapro.homework2.task1;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animal =  {
                new Cat("Bars"),  new Cat("Murzik"), new Cat("Kit"),new Dog("Sharik"),new Dog("Laki")
        };


        AnimalService animalService = new AnimalService();
        System.out.println("Only Dog");
        animalService.printOnlyDogs(animal);


    }
}

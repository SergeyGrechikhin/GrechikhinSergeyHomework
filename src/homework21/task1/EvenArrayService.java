package homework21.task1;

import java.util.Arrays;

public class EvenArrayService {
    int[] array = {1,2,3,4,5,6,7,8,9,10};
   public int[] myEvenArray(){


       System.out.println("Первый массив" + Arrays.toString(array));
       int evencounter = 0;
       for (int i = 0; i < array.length; i++) {
           if (array[i] % 2 == 0){
               evencounter++;
           }
       }

       int[] evenarray = new int[evencounter];
       int index = 0;
       for (int i = 0; i < array.length; i++) {
           if (array[i] % 2 == 0){
               evenarray[index] = array[i];
               index++;

           }


       }
       System.out.println("Второй массив только с чётными числами" + Arrays.toString(evenarray));
       return evenarray;
   }

}




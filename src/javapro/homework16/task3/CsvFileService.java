package javapro.homework16.task3;

import java.util.Arrays;

public class CsvFileService {
    public void integers (String[] lines){
        String operation = lines[1] ;
        int[] numbers = Arrays.stream(lines, 2 , lines.length).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(lines));

        switch (operation){
            case "sum"-> {
                int sum = Arrays.stream(numbers).sum();
                System.out.println("Summa = " + sum );
            }
            case "mult"-> {
                int mult = Arrays.stream(numbers).reduce(1, (a,b)->a*b);
                System.out.println("Mult = " + mult );
            }
            default -> System.out.println("Invalid operation");
        }
    }

    public void doubles(String[] lines){
        String operation = lines[1] ;
        double[] numbers = Arrays.stream(lines, 2, lines.length).mapToDouble(Double::parseDouble).toArray();
        System.out.println(Arrays.toString(lines));
        switch (operation){
            case "avg" -> {
                double avg = Arrays.stream(numbers).average().orElse(0.0);
                System.out.println("Avg = " + avg );
            }
            case "min"-> {
                double min = Arrays.stream(numbers).min().orElse(0.0);
                System.out.println("Min = " + min );
            }
            case "max" -> {
                double max = Arrays.stream(numbers).max().orElse(0.0);
                System.out.println("Max = " + max  );
            }
            default -> System.out.println("Invalid operation");
        }
    }

    public void strings(String[] lines){
        String operation = lines[1] ;
        String[] words = Arrays.copyOfRange(lines, 2 , lines.length);
        System.out.println(Arrays.toString(lines));
        switch (operation){
            case "count" -> System.out.println("Quantity words : " + words.length );
            case "print" -> {
                System.out.println("Print String : "  );
                for (int i = 0; i < words.length; i++) {
                    System.out.println(  words[i]);

                }
            }

            default -> System.out.println("Invalid operation");
        }

    }


}

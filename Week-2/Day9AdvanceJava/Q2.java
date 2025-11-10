package Day9AdvanceJava;

//Task
//Functional Interface
//Create a functional interface: NumberRule with method: boolean apply(int n);
//Lambda
//Define two rules using lambda: isEven → returns true if number is even,
//isPrime → returns true if number is prime


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@FunctionalInterface
interface NumberRule{
    public boolean apply(int n);
}

public class Q2 {
    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7);
        List<Integer> nums = Arrays.asList(2, 3, 10, 15, 8, 21, 14, 7);
        NumberRule isEven = (number) -> number%2==0;
        NumberRule isPrime = (number) -> {
            if(number < 2) return false;
            for(int divisor=2; divisor<=Math.sqrt(number); divisor++){
                if(number%divisor == 0)
                    return false;
            }
            return true;
        };

        nums.forEach((num)->{
            System.out.println("Number "+num+" is "+ (isEven.apply(num) ? "Even Number" : "Odd Number"));
            System.out.println("Number "+num+" is "+ (isPrime.apply(num) ? "Prime Number" : "Not Prime"));
        });

//        Functional Interface and Lambda Part done above
//        -------------------------------------------------------------------------------------------------
        List<Integer> numsFiltered = nums.stream().filter(number -> isEven.apply(number) && isPrime.apply(number)).map(num -> num*num).toList();

        Optional<Integer> firstSquaredNumber = numsFiltered.stream().findFirst();
        firstSquaredNumber.ifPresentOrElse(
                value -> System.out.println("First squared value is "+value)
                        ,()-> System.out.println("No matching number found")
                    );
    }
}

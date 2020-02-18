import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String name = "Themba";
        int number = 5;
        String[] words = new String[]{"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        String[] testa = new String[]{"the", "quick", "brown", "fox", "ate", "my", "chick"};
        int[] numbers = new int[]{11, 87, 12, 66, 95, 110, 77,8};
        int[] integers = new int[]{10, 5, 87, 44, 15, 11, 74,45};


        System.out.println("Excercise: Hello");
        Hello(name);
        System.out.println();
        System.out.println(" Exercise: check if a number is even or odd");
        Even_or_Odd();
        System.out.println();
        System.out.println("Exercise: Draw a square");
        Triangle(2);
        System.out.println();
        Square(4);
        System.out.println();
        System.out.println("Exercise: Draw a right handed triangle");
        Triangle(2);
        System.out.println();
        Triangle(4);
        System.out.println();
        System.out.println("Exercise: Draw an isosceles triangle");
        //Isosceles(2);
        Isosceles(4);
        System.out.println();
        System.out.println("Exercise: find the longest string");
        LongestString(words);
        System.out.println();
        System.out.println("Exercise: combine two lists/arrays");
        CombinedArrays(numbers,integers);
        System.out.println();
        System.out.println("Exercise: Frame some text");
        Box(testa);
    }
    public static void Hello(String name) {
        System.out.println(name);
    }
    public static void Even_or_Odd()
    {
        int number;
        System.out.println("Please enter a number: ");
        Scanner userInput = new Scanner(System.in);
        number=userInput.nextInt();

        if((number%2)==0)
        {
            System.out.println(number+" is an Even number.");
        }
        else {
            System.out.println(number+ " is an Odd number.");
        }

    }
    public static void Triangle(int number) {
        for (int num = 1; num <= number; num++) {
            for (int num1 = 0; num1 < num; num1++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void Square(int number) {
        for (int num = 1; num <= number; ++num) {
            for (int num1 = 1; num1 < number; num1++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void Isosceles(int number) {


        for (int num = 1; num < number; num++) {
            for (int num1 = num; num1 < number; num1++) {
                System.out.print(" ");
            }
            for (int num2 = 1; num2 < (num * 2); num2++) {
                System.out.print("#");
            }
            System.out.println("\n");
        }
    }
    public static void LongestString(String[] words) {
        String name = words[0], temp = "";
        for (int num = 0; num < words.length; num++) {
            if (words[num].length() > name.length()) {
                temp = words[num];
            }
        }
        System.out.println(temp);
    }
    public static void CombinedArrays(int[] words, int[] names) {
        int temp = words.length + names.length;
        ArrayList<Integer> mixture = new ArrayList<>(temp);
        mixture.add(words[0]);
        for(int x = 0, y = 0; x < temp; x++,y ++) {
            if(x < words.length)
            {
                if(!mixture.contains(words[x]))
                    mixture.add(words[x]);
                mixture.add(names[y]);
            }
        }
        System.out.println(mixture);
    }
    public static void Box(String[] words) {
        System.out.println("**********");
        for (int num = 0; num < words.length; num++) {
            System.out.println("* " + words[num] + "\t *");
        }
        System.out.println("**********");
    }



}

package exercises;

import java.util.Scanner;

public class Exercise20210114 {

    public static void main(String [] args) {
        int nums[] = {1, 1, 2, 3, 5, 8, 13, 21};

//        for (int i : nums) {
//            System.out.println(i);
//        }

//        for (int i : nums) {
//            if(i%2 == 1) {
//                System.out.println(i);
//            }
//        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";
        String[] words = str.split(" ");
//        for(String word: words){
//            System.out.println(word);
//        }

        String[] lines = str.split("\\.");
        for(String line: lines){
            System.out.println(line);
        }
    }
}

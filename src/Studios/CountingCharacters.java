package Studios;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Map;

public class CountingCharacters {

    public static void main(String [] args){
        var sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        sentence = sentence.toLowerCase();

        HashMap<Character, Integer> freqs = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            freqs.merge(c, 1, Integer::sum);
        }
        System.out.println("Frequencies:\n" + freqs);
    }

    /*
    public static void HashMap(String sentence){


    }

    public static void ArrayApproach(String sentence){
//        char[] charInSent = sentence.toCharArray();
//        for (char i: sentence.toCharArray()){

        }
    }

    public static void ArrayListApproach(String sentence){

    }
*/
}

package hashtable;
import java.util.*;
public class HashMapMain {

	 public static void main(String[] args) {

	        String sentence = "Paranoid are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations" ;
	        Map<String, Integer> myHashMap = new HashMap<>();
	        String[] words = sentence.toLowerCase().split( " ");
	        for (String word : words) {
	            Integer value =  myHashMap.get(word);
	            if(value == null) {
	                value =1;
	            }
	            else {
	                value = value + 1;
	            }
	            myHashMap.put(word, value);

	        }
	        myHashMap.remove("avoidable");
	        System.out.println(myHashMap);
	        int frequency = myHashMap.get("paranoid");
	        System.out.println("Frequency of paranoid is: "+frequency);


	    }
}

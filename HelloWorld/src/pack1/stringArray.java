package pack1;

import java.util.Arrays;
import java.util.List;

public class stringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[]{"C++", "Java", "C", "Python"};
		 
        // Convert String Array to List
        List<String>wordslist = Arrays.asList(words);
        String tocheck = "Java";
        if(wordslist.contains(tocheck)){
           System.out.println("The word " + tocheck + " present in string array");
        }
       else
       System.out.println("The word " + tocheck + " not present in string array" );

	}

}

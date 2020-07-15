
package wordseparator;

/**
 * This program separates run together strings
 * @author Ashika Shallow July 14, 2020
 */

import java.util.Scanner;

public class WordSeparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        String input;
              
        System.out.println("Enter a run sentence: ");
        input = kb.nextLine();
        
        System.out.println();
        
        StringBuilder str = new StringBuilder();       
        char[] inputArray = input.toCharArray();
                      
        // Insert spaces at uppercase letters
        for(int i = 0; i < inputArray.length; i++){           
            str.append(inputArray[i]);
            if(Character.isUpperCase(inputArray[i]) && i != 0)
                str.insert(str.length() - 1, " ");
            
        }
        
        // Convert uppercase letters to lowercase except the first letter        
        for (int j = 1; j < str.length(); j++){
            if(Character.isUpperCase(str.charAt(j))){
                char letter = Character.toLowerCase(str.charAt(j));
                str.setCharAt(j, letter);
            }
        }
        
        System.out.println(str);            
    }
    
}

package tow.characters;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Joniyed
 */
public class TowCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        String str = input.next();
        
        List<Character> charList = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        
        System.out.println(charList);
        
    }
    
}

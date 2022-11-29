import java.util.Scanner;

public class NumberOfCharacters {
    public static boolean didWeCheckThisCharacter(String sentence,int characterIndex ){
        for(int i = 0 ; i< characterIndex ; i++){
            if(sentence.charAt(characterIndex)== sentence.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the sentence : ");
        String sentence = scanner.nextLine().trim();
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(didWeCheckThisCharacter(sentence,i))
                continue;
            else if (sentence.charAt(i) == ' ')
                continue;

            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(i) == sentence.charAt(j) ){
                    counter++;
                }
            }
            System.out.println(sentence.charAt(i) + "  " + counter);
            counter = 0;
        }
    }
}

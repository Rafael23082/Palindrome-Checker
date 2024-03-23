import java.util.Scanner;
public class Palindrome {

    String temp1 = "";
    String temp2 = "";
    public void palindrome_checker(String word, int pos, int count){
        if (count == 1) {
            pos++;
            if (pos < word.length()) {
                temp1 += word.charAt(pos);
                palindrome_checker(word, pos, 1);
            } else {
                pos = word.length();
                palindrome_checker(word, pos , 2);
            }
        }
        if (count == 2) {
            pos--;
            if (pos > -1) {
                temp2 += word.charAt(pos);
                palindrome_checker(word, pos, 2);
            } else {
                if (temp1.toLowerCase().equals(temp2.toLowerCase())){
                    System.out.println("The word " + word + " is a palindrome");
                } else{
                    System.out.println("The word " + word + " is not a palindrome");
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scn.nextLine();

        Palindrome run = new Palindrome();
        run.palindrome_checker(word, -1, 1);
    }
}
public class PangramChecker {

    public boolean isPangram(String input) {
    // boolean pangram = false;
     input = input.toLowerCase();

     if(input.length() < 26)
      return false;

      //loops through the entire alphabet looking for the match in the given input sentence
      for (char ch = 'A'; ch <= 'Z'; ch++) {
          // if statement checks if the the letter is found in the sentence AND makes sure that both upper case
          // and lowercase letters are cheked. Note: if ASCI value of 'F' = 70, then ASCI value of 'f' would be equal to
          // (F+32). In the second condition below, type casting to char translates the int value(ASCI) to the actual letter
          // and looks for it in the sentence. IF the letter is not found, then the indexOf() returns -1.
 			    if (input.indexOf(ch) < 0 && input.indexOf((char) (ch + 32)) < 0)
 				       return false;
 			}

     return true;
    }
}

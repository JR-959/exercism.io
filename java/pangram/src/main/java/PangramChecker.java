public class PangramChecker {

    public boolean isPangram(String input) {
    // boolean pangram = false;
     input = input.toLowerCase();

     if(input.length() < 26)
      return false;

      //loops through the entire alphabet looking for the match in the given input sentence
      for (char ch = 'A'; ch <= 'Z'; ch++) {
 			    if (input.indexOf(ch) < 0 && input.indexOf((char) (ch + 32)) < 0)
 				       return false;
 			}

     return true;
    }
}

import java.lang.IllegalArgumentException;

public class Hamming {
    private String left;
    private String right;

    Hamming(String leftStrand, String rightStrand) {
        this.left = leftStrand;
        this.right = rightStrand;

        if(left.length() != right.length()) {
          throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
      int d = 0;

      for (int i=0; i < left.length(); i++ ) {
        if(left.charAt(i) != right.charAt(i))
          d++;
      }// end of for loop
      return d;
    }

}

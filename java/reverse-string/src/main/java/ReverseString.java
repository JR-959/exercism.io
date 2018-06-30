class ReverseString {

    String reverse(String inputString) {

      String s = "";
      if(inputString.length()>0){
          for(int i=inputString.length()-1; i>=0; i--)
          {
            s+=inputString. charAt(i);
          }
      }

      return s;
    }

}

class RaindropConverter {

    String convert(int number) {
      String s = "";
      if(number%3 != 0 && number%5 != 0 && number%7 != 0)
        return String.valueOf(number);
      else{
        if (number%3 == 0)
          s+= "Pling";
        if (number%5 == 0)
          s+= "Plang";
        if (number%7 == 0)
          s+= "Plong";
      }
      return s;
    }

}

class Acronym {

    private String phrase = "";

    Acronym(String phrase) {
        this.phrase = phrase;
    }


    String get() {
      String[] words = phrase.split("[\\s,-]+"); //--> regex inside the double quotes
      String acronym = "";

      for(String word : words)
      {
        String piece = word.substring(0,1).toUpperCase();
        acronym+= piece;
      }

      return acronym;
    }

}

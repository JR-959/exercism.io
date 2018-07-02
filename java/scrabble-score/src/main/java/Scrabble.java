import java.util.Arrays;
class Scrabble {

    String word = "";
    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        //Set<String> set1 = new Set<String>();
        String[] set1 = new String[]{"A","E","I","O","U","L","N","R","S","T"};
        //HashSet<String> set2 = new HashSet<String>();
        String[] set2 = new String[]{"D","G"};
        //String[] set1> set3 = new HashSet<String>();
        String[] set3 = new String[]{"B","C","M","P"};
        //HashSet<String> set4 = new HashSet<String>();
        String[] set4 = new String[]{"F","H","V","W","Y"};
        //HashSet<String> set5 = new HashSet<String>();
        String[] set5 = new String[]{"K"};
        //HashSet<String> set8 = new HashSet<String>();
        String[] set8 = new String[]{"J","X"};
        //HashSet<String> set10 = new HashSet<String>();
        String[] set10 = new String[]{"Q","Z"};

        int score = 0;
        for(int i=0; i < word.length();i++)
        {
            if(Arrays.asList(set1).contains(word.substring(i,i+1)))
              score+=1;
            if(Arrays.asList(set2).contains(word.substring(i,i+1)))
              score+=2;
            if(Arrays.asList(set3).contains(word.substring(i,i+1)))
              score+=3;
            if(Arrays.asList(set4).contains(word.substring(i,i+1)))
              score+=4;
            if(Arrays.asList(set5).contains(word.substring(i,i+1)))
              score+=5;
            if(Arrays.asList(set8).contains(word.substring(i,i+1)))
              score+=8;
            if(Arrays.asList(set10).contains(word.substring(i,i+1)))
              score+=10;

        }

        return score;

    }

}

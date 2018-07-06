import java.util.List;
import java.util.ArrayList;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        int binaryValue = Integer.valueOf(Integer.toBinaryString(number));
        List<Signal> sl = new ArrayList<Signal>();

        if(binaryValue > 10000)
        {
          if(binaryValue%10000 >= 1000 )
            sl.add(Signal.JUMP);

          if(binaryValue%1000 >= 100 )
            sl.add(Signal.CLOSE_YOUR_EYES);

          if(binaryValue%100 >= 10 )
            sl.add(Signal.DOUBLE_BLINK);

          if(binaryValue%10 == 1 )
            sl.add(Signal.WINK);

        }
        else
        {

              if(binaryValue%10 == 1 )
                sl.add(Signal.WINK);

              if(binaryValue%100 >= 10 )
                sl.add(Signal.DOUBLE_BLINK);

              if(binaryValue%1000 >= 100 )
                sl.add(Signal.CLOSE_YOUR_EYES);

              if(binaryValue%10000 >= 1000 )
                sl.add(Signal.JUMP);

        }

        return sl;
    }

}

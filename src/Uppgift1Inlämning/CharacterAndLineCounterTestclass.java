package Uppgift1Inlämning;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;



public class CharacterAndLineCounterTestclass {

    @Test
    public void linecountTestCase() {

        Counter counter = new Counter();

        counter.addLine("Hej");

        counter.addLine("Jag heter Albin");

        assertEquals(2,counter.getLineCount());


    }


    @Test
    public void charcountTestCase() {

        Counter counter = new Counter();

        counter.addLine("Hej");

        counter.addLine("Jag heter Albin");

        assertEquals(18,counter.getCharCount());



    }


    @Test
    public void startconditionTestCase() {

        Counter counter = new Counter();
        ;

        assertEquals(0,counter.getLineCount());

        assertEquals(0,counter.getCharCount());

    }


    }

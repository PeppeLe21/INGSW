package org.example;



import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.Date;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AlgoritmoTest
{
    private static int[] array = new int[]{1,4,5,8,12,34,65,78,89,99};
    private int[] anorderA = null;
    private static int[] orderArrayOne = new int[]{1,4,6,9,10};
    private static int[] orderArrayZero =new int[]{10,9,6,4,1};
    Algoritmo f = new Algoritmo();

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Inizio con i test");

        /*
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }*/
    }

    @Before
    public void beforeAnorderArray(){
        anorderA = new int[]{4,1,6,9,10};
        /*for(int i=0;i< anorderA.length;i++) {
            System.out.print(anorderA[i]+" ");
        }
        System.out.println();*/
    }

    @Test
    public void shouldStringAllNumber(){
        //DateTime ora = new DateTime();
        //System.out.println(ora);
        assertEquals(290,f.stringToIntConverter("290"));
        //System.out.println(ora);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldCharInString(){
        //DateTime ora  = new DateTime();
        //System.out.println(ora);
        System.out.println("shouldCharInStringException");
        f.stringToIntConverter("2s343");
        //System.out.println(ora);
    }

}

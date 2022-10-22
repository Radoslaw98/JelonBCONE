package Zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    @Test
   void  shouldPrintRectangle(){
        //given
        Rectangle rectangleTest= new Rectangle(5,10,"*");
        String expectedRectangle =
                """
                *****
                *   *
                *   *
                *   *
                *   *
                *   *
                *   *
                *   *
                *   *
                *****
                """;

        //when
    //String rectangle = rectangleTest.printRectangle();
        //then
      //  Assertions.assertEquals(expectedRectangle,rectangle);
    }

}
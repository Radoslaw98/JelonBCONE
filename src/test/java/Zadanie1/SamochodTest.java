package Zadanie1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SamochodTest {

    @Test
    void kilometersToReview() {
        //given
        Samochod samochodTest= new Samochod(Marka.BMW,5_000);
        //when
        int zwroci= samochodTest.kilometersToReview();
        //then
        Assertions.assertEquals(15_000,zwroci);
    }

    @Test
    void kilometersToReviewTestInBooleanFalse(){
        //given
        Samochod samochodTest= new Samochod(Marka.BMW, 5_000);
        //when
        int zwrot= samochodTest.kilometersToReview();
        //then
        Assertions.assertFalse(zwrot==14_000);
    }
//TDD- TEST DRIVEN DEVELOPMENT



}
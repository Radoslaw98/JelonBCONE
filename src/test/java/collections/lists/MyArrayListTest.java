package collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {


    @Test
    public void add(){
        //Given
        List<String> list= new MyArrayList();
        //When
        list.add("Test");
        //Then
        Assertions.assertEquals(1,list.size());
    }
    @Test
    public void shouldAdd3Elements(){
        //Given
        List<String> list= new MyArrayList();
        //When
        list.add("List");
        list.add("List");
        list.add("List");

        //Then
        Assertions.assertEquals(3,list.size());

    }

    @Test
    public void shouldReturnIndexOfElement(){

        //Given
        List<Integer> list= new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        //When
        int i = list.indexOf(3);


        //Then
        Assertions.assertEquals(2,i);
    }

    @Test
    public  void shouldReturnIndexOfElementIfthereIsMoreThanOneTheSameElement(){
        //Given
        List<Integer> list= new MyArrayList();
        list.add(1);
        list.add(1);
        list.add(3);

        //When
        int i = list.indexOf(1);


        //Then
        Assertions.assertEquals(0,i);

    }

    @Test
    public  void shouldReturnMinus1IfThereIsNoElementInTheList(){
        //Given
        List<Integer> list= new MyArrayList();
        list.add(1);
        list.add(1);
        list.add(3);

        //When
        int i = list.indexOf(0);


        //Then
        Assertions.assertEquals(-1,i);

    }
    @Test
    public void shouldReturnTheElementAtTheSpecifiedPositionInTheList(){
        //Given
        List<Integer> list= new MyArrayList();
        list.add(10);
        list.add(2);
        list.add(3);
        //When
        Integer integer = list.get(0);
        //Then
        Assertions.assertEquals(10,integer);
    }

    @Test
    public void shouldReturnIndexOutOfBoundsException(){
        //Given
        List<Integer> list= new MyArrayList();
        list.add(10);
        list.add(2);
        list.add(3);
        //When&Then
        Assertions.assertThrows(IndexOutOfBoundsException.class,()->list.get(10000));
    }

    @Test
    public  void shouldRemoveElementFromTheList(){
        //Given
        List<Integer> list= new MyArrayList();
        list.add(10);
        list.add(2);
        list.add(3);
        Integer integer = list.get(1);
        //When
        Integer remove = list.remove(1);
//Then
        Assertions.assertEquals(integer,remove);
        Assertions.assertEquals(2,list.size());
    }
}
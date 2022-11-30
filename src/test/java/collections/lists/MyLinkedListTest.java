package collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    public void shouldAdd(){
        //Given
        List nodeList= new MyLinkedList();
        //When
        nodeList.add("test");
        nodeList.add("Inne");
        //Then
        Assertions.assertEquals(2,nodeList.size());
    }

    @Test
    public void shouldContains(){

        //Given
        List nodeList= new MyLinkedList();
        nodeList.add("test");
        nodeList.add("Inne");
        nodeList.add("Trzeci");
        //When
        boolean test = nodeList.contains("Trzeci");
        //Then
        Assertions.assertEquals(true,test);
    }

}
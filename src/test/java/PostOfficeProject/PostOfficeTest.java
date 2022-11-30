package PostOfficeProject;

import ProjectHouse.PostOfficeProject.Package;
import ProjectHouse.PostOfficeProject.PostOffice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PostOfficeTest {
    @Test
    public void shouldSendThePackage(){
        //given
        PostOffice postOffice= new PostOffice();
        Package package1=new Package("R.O.D","Jelon",1500);

        //when
        double v = postOffice.sendThePackage(package1, 100);

        //then
        Assertions.assertEquals(92,v);

    }




}
package collections.maps;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {


    @Test
    public void shouldAddUserToMap() {
        //given
//        Map<String,User> map=new HashMap<>();
        UserRepository userRepository = new UserRepository();
        User user = new User();
        //when
        userRepository.add(user);
        //then
        Assertions.assertEquals(1, userRepository.getMap().size());
    }


    @Test
    public void shouldReturnCountOfUsersInRepository() {
        //given
//        Map<String,User> map=new HashMap<>();
        UserRepository userRepository = new UserRepository();
        User user = new User();
        User user1 = new User("123", "1234");
        userRepository.add(user);
        userRepository.add(user1);

        //when
        int i = userRepository.countUser();
        //then
//        Assertions.assertEquals(1,userRepository.getMap().size());
        Assertions.assertEquals(2, i);
    }
@Test
    public void shouldContainsEmail() {
        //given
        UserRepository userRepository = new UserRepository();
        User user1 = new User("123", "1234");
        userRepository.add(user1);
        //when
        boolean b = userRepository.containsEmail("123");

        //then
        Assertions.assertTrue(b);
    }

    @Test
    public void shouldReturnUser() {
        //given
        UserRepository userRepository = new UserRepository();
        User user1 = new User("123", "1234");
        User user2 = new User("567", "2344");
        userRepository.add(user1);
        userRepository.add(user2);
        //when
        User b = userRepository.getUser("567");

        //then
        Assertions.assertEquals(user2,b);
    }

    @Test
    public void shouldLoginUser() {
        //given
        UserRepository userRepository = new UserRepository();
        User user1 = new User("123", "1234");
        User user2 = new User("567", "2344");
        userRepository.add(user1);
        userRepository.add(user2);
        //when
        User b = userRepository.login("123","1234");

        //then
        Assertions.assertEquals(user1,b);
    }
    @Test
    public void shouldThrowExceptionWhenWrongDataGiven() {
        //given
        UserRepository userRepository = new UserRepository();
        User user1 = new User("123", "1234");
        User user2 = new User("567", "2344");
        userRepository.add(user1);
        userRepository.add(user2);

        //When&&Then
        Assertions.assertThrows(WrongDataException.class,()->userRepository.login("123","11111"));
    }
}
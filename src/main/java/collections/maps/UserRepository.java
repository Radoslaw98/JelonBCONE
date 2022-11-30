package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    /*

Stwórz klasę User, obiekty typu User mają posiadać pola email, password, points oraz role (enum którego wartości mogą przyjmować np pozycje ADMIN, CLIENT itp).

Zaimplementuj i przetestuj klasę UserRepository z mapą, w której kluczami będą maile użytkowników a wartościami obiekty użytkowników.

Stwórz metody:
 add - przyjmującą obiekt typu User i dodająca go do mapy
countUsers - zwracająca liczbę użytkowników w repozytorium
containsMail - zwracająca true jeśli na liście znajduje się dany mail
get - przyjmująca mail i zwracająca obiekt typu User
login - przyjmującą email i password użytkownika i zwracająca zalogowanego użytkownika lub rzucająca wyjątek z odpowiednią wiadomością jeśli podano błędny email lub password
remove - pozwalająca usunąć użytkownika po mailu
containsAdmin - zwracająca true jeśli na liście znajduje się przynajmniej jeden obiekt o roli ADMIN
	addPoints - metoda dodaje x punktów wszystkim klientom
add - przyjmującą dwie wartości String i tworząca User dodając go do mapy ustalając ilość punktów oraz role na domyślne wartości. (wykorzystaj odpowiedni konstruktor)

     */

private Map<String,User> map = new HashMap<>();

public void add(User user){

    map.put(user.getEmail(),user);
}

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }



    public int countUser(){
   return map.size();
    }

    public boolean containsEmail(String email){
    if(map.containsKey(email))
    return true;
    else
        return false;
    }

    public User getUser(String email){
//    if(map.containsKey(email)){
        return map.get(email);
//    }
//    else
//        return null;
    }

   // login - przyjmującą email i password użytkownika i zwracająca zalogowanego użytkownika lub rzucająca wyjątek z odpowiednią wiadomością jeśli podano błędny email lub password

    public User login(String email, String password) {
    if(map.containsKey(email) && map.get(email).getPassword().equals(password) && map.get(email).getEmail().equals(email))
    return map.get(email);
    else
        throw new WrongDataException("wrong login or password");

    }
}

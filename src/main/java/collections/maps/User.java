package collections.maps;

public class User {



   private String email;

   private String password;

   private int points;
   private Role role;


   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public User(String email, String password) {
      this.email = email;
      this.password = password;
      this.points = points;
      this.role = role;
   }
   public User() {
      this.email = email;
      this.password = password;
      this.points = points;
      this.role = role;
   }

}

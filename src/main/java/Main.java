import controller.UserController;
import model.RoleEnum;
import model.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();
//        userController.addUser("mk@mk.pl", "mk",  RoleEnum.ROLE_USER", true, LocalDate.now(),"secrete_code");
        userController.addUser("mk@mk.pl","mk", RoleEnum.ROLE_USER, true, LocalDate.now(), "XXX");
   }

}

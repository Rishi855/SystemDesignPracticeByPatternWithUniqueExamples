package AllPattternRunnerClasses;

import ChainResponsibility.SystemLogin.Authorize;
import ChainResponsibility.SystemLogin.Handlers.Handler;
import ChainResponsibility.SystemLogin.Handlers.PasswordHandle;
import ChainResponsibility.SystemLogin.Handlers.RoleHandle;
import ChainResponsibility.SystemLogin.Handlers.UsernameHandle;

public class LoginDemo {
    public void run(){
        Handler handle = new UsernameHandle(new PasswordHandle(new RoleHandle()));
        Authorize authorize = new Authorize(handle);

        
        System.out.println("____________________________________________");
        System.out.println("Ruehsikesh AND Swami123");
        if(authorize.login("Rushikesh","Swami123")){
            System.out.println("Successfull login completed");
        }else{
            System.out.println("Please try again");
        }

        System.out.println("____________________________________________");
        System.out.println("Vikas AND Vikas1234");
        if(authorize.login("Vikas","Vikas1234")){
            System.out.println("Successfull login completed");
        }else{
            System.out.println("Please try again");
        }

        
        System.out.println("____________________________________________");
        System.out.println("Nishiti AND Taras123");
        if(authorize.login("Nishiti","Taras123")){
            System.out.println("Successfull login completed");
        }else{
            System.out.println("Please try again");
        }
        
        System.out.println("____________________________________________");
    }
}

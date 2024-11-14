package ChainResponsibility.SystemLogin;

import ChainResponsibility.SystemLogin.Handlers.Handler;

public class Authorize {

    Handler handler;
    public Authorize(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String username,String password){
        System.out.println("Login is processing...");
        if(handler.handle(username, password)){
            System.out.println("Login is processing passed....");
            return true;
        }
        else{
            System.out.println("Login processing failed....");
            return false;
        }
    }

    
}

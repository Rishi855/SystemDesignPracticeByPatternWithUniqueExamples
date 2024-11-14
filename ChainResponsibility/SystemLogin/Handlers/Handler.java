package ChainResponsibility.SystemLogin.Handlers;

import ChainResponsibility.SystemLogin.Database;

public abstract class Handler {
    
    Database database = new Database();
    
    public Handler nextHandler;
    public Handler(){

    }

    public Handler(Handler handle) {
        nextHandler = handle;
    }
    public abstract boolean handle(String userName,String password);

    public boolean handleNext(String userName,String password){
        if(nextHandler!=null){
            return nextHandler.handle(userName,password);
        }
        return true;
    }
    
}

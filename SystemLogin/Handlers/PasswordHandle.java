package SystemLogin.Handlers;

public class PasswordHandle extends Handler{

    public PasswordHandle(){

    }

    public PasswordHandle(Handler handler) {
        super(handler);
    }

    @Override
    public boolean handle(String userName, String password) {
        if(database.isValidPassword(userName, password)){
            return handleNext(userName, password);
        }
        return false;
    }
    
}

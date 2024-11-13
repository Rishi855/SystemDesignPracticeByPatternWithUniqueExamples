package SystemLogin.Handlers;



public class UsernameHandle extends Handler {

    public UsernameHandle(){

    }
    public UsernameHandle(Handler handler) {
        super(handler);
    }

    @Override
    public boolean handle(String userName, String password) {
        if(database.isValidUserName(userName)){
            return handleNext(userName, password);
        }
        return false;
    }
}

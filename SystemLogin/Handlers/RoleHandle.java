package SystemLogin.Handlers;

public class RoleHandle extends Handler{

    public RoleHandle() {
        super();
    }
    public RoleHandle(Handler handler) {
        super(handler);
    }

    @Override
    public boolean handle(String userName, String password) {
        if(database.isValidRole(userName)){
            return true;
        }
        return false;
    }
}

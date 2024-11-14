package ChainResponsibility.SystemLogin;
import java.util.*;;
public class Database {
    Map<String,String> usernamePassword = new HashMap<>();
    Map<String,Roles> usernameRole = new HashMap<>();
    public Database(){
        usernamePassword.put("Rushikesh","Swami123");
        usernamePassword.put("Vivek","Jadhav123");
        usernamePassword.put("Nishita", "Taras123");

        usernameRole.put("Rushikesh",Roles.CEO);
        usernameRole.put("Vivek",Roles.HR);
        usernameRole.put("Nishita",Roles.Employee);
    }

    public boolean isValidUserName(String username){
        if(usernamePassword.containsKey(username)) return true;
        else return false;
    }

    public boolean isValidPassword(String username,String password){
        if(usernamePassword.get(username).equals(password)) return true;
        else return false;
    }

    public boolean isValidRole(String username){
        if(usernameRole.get(username)==Roles.CEO || usernameRole.get(username)==Roles.HR) return true;
        else return false;
    }

    public enum Roles{
        CEO,
        HR,
        Manager,
        Employee
    }
}
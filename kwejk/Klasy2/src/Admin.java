import java.util.ArrayList;
import java.util.List;

public class Admin {

    private String username;
    private List<String> roles = new ArrayList<>();

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getUsers() {
        return roles;
    }

    public void setUsers(List<String> roles) {
        this.roles = roles;
    }



}

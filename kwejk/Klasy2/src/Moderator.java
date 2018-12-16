/* import java.util.ArrayList;
import java.util.List;

public class Moderator {

    private String username;
    private List<String> articles  = new ArrayList<>();

    public Moderator(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getArticles() {
        return articles;
    }

    public void setArticles(List<String> articles) {
        this.articles = articles;
    }

    public static void main(String[] args) {
        Admin admin = new Admin("admin");
        Admin admin1 = new Admin("Klaudiusz admin");
        Admin admin2 = new Admin(" Roman admin");
        Admin admin3 = new Admin("Kleofacy admin");

        Moderator moderator = new Moderator("moderator");
        Moderator moderator2 = new Moderator("moderator Robert");
        Moderator moderator3 = new Moderator("moderator Zdzich");

        List<> users = new ArrayList<>();
        users.add(admin);
        users.add(admin1);
        users.add(admin2);
        users.add(admin3);
        users.add(moderator);
        users.add(moderator2);
        users.add(moderator3);

        for {user; users}{
            System.out.println(user.getUsername);
        }
    }
}
*/
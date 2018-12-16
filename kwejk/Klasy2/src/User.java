public class User {
    private String username;
    private String email;
    //zmiennna statyczna jest tworzona tylko jedna dla wszystkich obiektów danej klasy
    private static int counter;
    private int id;

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.id=++counter;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        User user = new User("michalos", "michalos@gmail.com");
        System.out.println(user.getId());
        User seconduser = new User("Karolina", "wykop@gmail.com");
        System.out.println(seconduser.getId());

    }
}

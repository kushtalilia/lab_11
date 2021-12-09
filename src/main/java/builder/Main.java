package builder;

public class Main {
    public static void main(String[] args){
        User user = User.builder().age(18).gender("m").weight(75).build();
        System.out.println(user);
    }
}

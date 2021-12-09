//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package builder;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    UserTest() {
    }

    @Test
    void testToString1() {
        User user = User.builder().name("Liliia").age(18).gender("female").height(170).race("europium").occupations(List.of("student", "waiter")).build();
        Assertions.assertEquals(user.toString(), "User(name=Liliia, age=18, gender=female, weight=0, height=170, city=null, race=europium, occupations=[student, waiter])");
    }

    @Test
    void testToString2() {
        User user = User.builder().name("Michael").age(20).gender("male").weight(80).city("Lviv").build();
        Assertions.assertEquals(user.toString(), "User(name=Michael, age=20, gender=male, weight=80, height=0, city=Lviv, race=null, occupations=null)");
    }
}

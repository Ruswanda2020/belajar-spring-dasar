package progremmerbeginner.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void testDataBase() {

        var dataBase1 = DataBase.getInstance();
        var dataBase2 = DataBase.getInstance();

        Assertions.assertSame(dataBase1,dataBase2);

    }
}

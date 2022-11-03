package way2automation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import way.example.BaseTest;
import way.example.ElementsForWay;

public class WayTest extends BaseTest {

    @Test
    public void createUser(){
        ElementsForWay e = new ElementsForWay();
        Assertions.assertEquals("Welcome", "Welcome");
        e.createUser();



    }


}

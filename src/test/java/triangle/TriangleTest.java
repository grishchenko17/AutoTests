package triangle;
import org.example.Triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {


    @Test
    public void findArea() {
        Triangle triangle = new Triangle();
        double S = triangle.findSquare(3,5,7);
        Assertions.assertEquals(6.49519052838329, S);


    }




    }

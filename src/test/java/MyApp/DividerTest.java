package MyApp;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DividerTest {

    @Test
    void doCalc() {

        Divider divider = new Divider();
        double r = divider.doCalc(3, 2);

        assertEquals(1.5, r);
        // to work:
        // assertEquals(1, r); // as we badly did nto consider int/float issues.

    }
}
package KataExercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void upDownCheck() {
        String upDown = UpAndDownTheStringGrows.STRANGE_STRING.toUpperCase().toLowerCase();
        int length = UpAndDownTheStringGrows.STRANGE_STRING.length();
        int upDownLength = upDown.length();
        assertTrue(upDownLength > length,
                "your string: \"" + UpAndDownTheStringGrows.STRANGE_STRING + "\".length() = " + length       + "\n" +
                        "after .toUpperCase().toLowerCase():\n"                                                   +
                        "result     : \"" + upDown                       + "\".length() = " + upDownLength + "\n" +
                        length + " >= " + upDownLength + "\n"
        );
    }
}
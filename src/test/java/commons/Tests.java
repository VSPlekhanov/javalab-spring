package commons;

import lab.model.*;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Tests {

    public static String APPLICATION_CONTEXT_XML_FILE_NAME =
            "application-context.xml";

    public static Person getExpectedPerson() {
        return new UsualPerson(
                1,
                "John",
                "Smith",
                new SimpleCountry(1, "Russia", "RU"),
                35,
                1.78f,
                true,
                Arrays.asList(new SimpleContact("TELEPHONE", "222-33-22"),
                                new SimpleContact("EMAIL", "jkhafg@kjhsd.ru")),
                false);
         }
}

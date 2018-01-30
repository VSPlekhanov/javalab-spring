import lab.model.SimpleCountry;
import lab.model.UsualPerson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    private static final String APPLICATION_CONTEXT_XML_FILE_NAME =
            "application-context.xml";

    private BeanFactory context = new ClassPathXmlApplicationContext(
            APPLICATION_CONTEXT_XML_FILE_NAME);


    @Test
    void testInitPerson() {
        assertEquals(getExpectedPerson(), context.getBean("person"));
    }

    private UsualPerson getExpectedPerson() {
        return new UsualPerson(
                1,
                "John Smith",
                new SimpleCountry(1, "Russia", "RU"),
                35,
                1.78f,
                true,
                Arrays.asList("222-33-22", "jkhafg@kjhsd.ru"));
    }
}

import in.specmatic.test.SpecmaticJUnitSupport;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.samples.petclinic.PetClinicApplication;

import java.io.IOException;

public class ContractTest extends SpecmaticJUnitSupport {
    private static ConfigurableApplicationContext context;

    @BeforeAll
    public static void setUp() {
        System.setProperty("host", "localhost");
        System.setProperty("port", "9966");
        System.setProperty("SPECMATIC_GENERATIVE_TESTS","true");
//        context = SpringApplication.run(PetClinicApplication.class);
    }

    @AfterAll
    public static void tearDown() throws IOException {
        if (context != null)
            context.close();
    }

}

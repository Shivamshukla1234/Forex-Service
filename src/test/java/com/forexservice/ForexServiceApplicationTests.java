package com.forexservice;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ForexServiceApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(ForexServiceApplicationTests.class);
    @Test
    public void contextLoads(){
        logger.info("Test case executing ....");
        assertEquals(true,true);
    }
}

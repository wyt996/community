package cn.wyt.community.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityApplicationTests {

    @Test
    public void contextLoads() {
        Date date = new Date();
        System.out.println(date);
    }

}

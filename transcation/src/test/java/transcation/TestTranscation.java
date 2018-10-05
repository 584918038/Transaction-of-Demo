package transcation;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xsh.BootApplication;
import com.xsh.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BootApplication.class})
public class TestTranscation {
	
	@Resource
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("aaa", "bbb", 200d);
    }
}

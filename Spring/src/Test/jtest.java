package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.User;
import com.spring.service.UserService;

class jtest {

	@Test
	void test() {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*User u=(User)ctx.getBean("user01");
		u.setAge(20);
		u.setName("≈÷ª¢");
		System.out.println(u.toString());*/
		UserService us= (UserService) ctx.getBean("userService");
		us.add();
	}

}

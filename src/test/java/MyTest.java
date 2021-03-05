import com.Cai.pojo.Hello;
import com.Cai.pojo.People;
import com.Cai.pojo.Student;
import com.Cai.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author Cai
 * @Date 2021-03-03 16:48
 */
public class MyTest {
    public static void main(String[] args) {
//        获取Spring的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        取出对象
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.getString());

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");
        User user1 = context.getBean("user2", User.class);//两行一样
        System.out.println(user);
        System.out.println(user1);
    }

    @Test
    public void test_(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        People people = context.getBean("people",People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}


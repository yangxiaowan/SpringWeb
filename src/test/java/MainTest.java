import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.yangwan.action.LoginAction;
import com.yangwan.beans.Person;
import com.yangwan.beans.QualifierTestBean;
import com.yangwan.beans.SolutionBean;
import com.yangwan.service.LoginService;


public class MainTest {

	public static void main(String[] args) {
		String[] locations = {"file:C:/Users/bw/Desktop/yw/SpringWeb/src/main/resources/spring/application-config.xml"};     
        ApplicationContext ctx =      
            new ClassPathXmlApplicationContext(locations);
        LoginService loginService = (LoginService)ctx.getBean("loginservice");
        loginService.printLoginServiceInformation();
        LoginAction loginAction = (LoginAction)ctx.getBean("loginaction");
        loginAction.printLoginActionInformation();
	}

}

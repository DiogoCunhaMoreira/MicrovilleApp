package diogomoreira.microvilleApp;


import diogomoreira.microvilleApp.DAO.ProductDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/spring-config.xml");

        ProductDAO productDAO = context.getBean(ProductDAO.class);

        Product product = new Product();








        }

}

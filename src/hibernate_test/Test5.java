package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp5 = session.get(Employee.class, 3);
//            session.delete(emp5);

            session.createQuery("delete Employee " +
                    "where name = 'Oleg'").executeUpdate();




            session.getTransaction().commit();
        } finally {
            factory.close();
            System.out.println("Done");
        }
    }
}

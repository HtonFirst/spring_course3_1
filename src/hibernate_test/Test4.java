package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp1 = session.get(Employee.class, 1);
//            emp1.setSalary(700000);
            session.createQuery("update Employee set salary=220000 " +
                    "where name= 'Mikhail'").executeUpdate();

            session.getTransaction().commit();
        } finally {
            factory.close();
            System.out.println("Done");
        }
    }
}

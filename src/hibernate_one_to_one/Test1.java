package hibernate_one_to_one;

import hibernate_one_to_one.entity.Employee;
import hibernate_one_to_one.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//            Employee emp = new Employee
//                    ("Alex", "Kozlov", "IT", 500000);
//            Detail detail = new Detail
//                    ("SPb", "12232343432", "skdjfl@jdfl");
//            emp.setEmpDetails(detail);
//
//            Employee emp = new Employee
//                    ("Oleg", "Smirnov", "Sales", 300000);
//            Detail detail = new Detail
//                    ("Vyborg", "67744884", "Oleg@jdfl");
//            emp.setEmpDetails(detail);

            session.beginTransaction();

//            session.save(emp);

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!!!");
        }finally {
            session.close();
            factory.close();
        }


    }
}

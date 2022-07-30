package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session =null;

        try {
            session = factory.getCurrentSession();

//            Employee emp = new Employee
//                    ("Nickolas", "Ivanov", "HR", 350000);
//            Detail detail = new Detail("New-York", "4364573452", "Nikki@mail.ru");
//            detail.setEmployee(emp);
//            emp.setEmpDetails(detail);

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
//            System.out.println(detail.getEmployee());
            detail.getEmployee().setEmpDetails(null);
            session.delete(detail);

//            session.save(detail);

            session.getTransaction().commit();
            System.out.println("Done!!!!!");
        } finally {
            session.close();
            factory.close();
        }
    }
}

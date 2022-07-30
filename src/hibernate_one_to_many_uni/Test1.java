package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//            Department department = new Department
//                    ("HR", 2_000_000, 50_000);
//
//            Employee emp1 = new Employee("Ekaterina", "Svetlov", 200_000);
//            Employee emp2 = new Employee("Petr", "Gorodov", 50_000);
//
//            department.addEmployee(emp1);
//            department.addEmployee(emp2);
//
//            session.beginTransaction();
//
//            session.save(department);
//********************************************************************************

//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//********************************************************************************

            session.beginTransaction();

            Department department = session.get(Department.class, 2);

//            Employee employee = session.get(Employee.class, 1);

            session.delete(department);
//            System.out.println(employee);
//            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("DONE!!!");
        }finally {
            session.close();
            factory.close();
        }
    }
}

package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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

        try{
//            session = factory.getCurrentSession();
//
//            Department department = new Department
//                    ("Sales", 3_500_000, 100_000);
//
//            Employee emp1 = new Employee("Ivan", "Petrov", 300_000);
//            Employee emp2 = new Employee("Valentina", "Smirnova", 250_000);
//            Employee emp3 = new Employee("Anton", "Sidorov", 150_000);
//
//            department.addEmployee(emp1);
//            department.addEmployee(emp2);
//            department.addEmployee(emp3);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");

//            *********************************************************************************

            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 3);

            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());

//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp);
//            System.out.println(emp.getDepartment());

//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//
//
//
            session.getTransaction().commit();
            System.out.println("DONE!!!!");

        } finally {
            session.close();
            factory.close();
        }

    }
}

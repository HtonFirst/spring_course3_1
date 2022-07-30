package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//            Section section1 = new Section("Dance");
//
//            Child child1 = new Child("Olga", 12);
//            Child child2 = new Child("Grisha", 9);
//            Child child3 = new Child("Pavlik", 8);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");

            //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//
//            Section section2 = new Section("Volleyball");
//            Section section3 = new Section("Chess");
//            Section section4 = new Section("Painting");
//
//            Child child = new Child("Igor", 10);
//
//
//
//            child.addSectionsToChild(section2);
//            child.addSectionsToChild(section3);
//            child.addSectionsToChild(section4);

            //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//            session.beginTransaction();
//
//            Section section =  session.get(Section.class, 1);
//
//            System.out.println(section);
//            System.out.println(section.getListOfChildren());
//
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");

            //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

            session.beginTransaction();

//            Section section =  session.get(Section.class, 7);
//            session.delete(section);

            Child child = session.get(Child.class, 6);
            session.delete(child);




            session.getTransaction().commit();
            System.out.println("DONE!!!");

        } finally {
            session.close();
            factory.close();
        }
    }
}

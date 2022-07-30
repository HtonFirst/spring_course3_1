package hibernate_many_to_many.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String sectionName;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH,
                            CascadeType.DETACH, CascadeType.MERGE})
    @JoinTable(name = "child_section"
            , joinColumns = @JoinColumn(name = "section_id")
            , inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private List<Child> listOfChildren;

    public Section() {
    }

    public Section(String sectionName) {
        this.sectionName = sectionName;
    }

    public void addChildToSection(Child child) {
        if (listOfChildren == null) {
            listOfChildren = new ArrayList<>();
        }
        listOfChildren.add(child);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public List<Child> getListOfChildren() {
        return listOfChildren;
    }

    public void setListOfChildren(List<Child> listOfChildren) {
        this.listOfChildren = listOfChildren;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", sectionName='" + sectionName + '\'' +
                '}';
    }
}

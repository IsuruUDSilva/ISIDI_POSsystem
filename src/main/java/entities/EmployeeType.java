package entities;

import javax.persistence.*;

@Entity
@Table(name = "m02_employee_type")
public class EmployeeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "M02_ID")
    private Integer m02ID;

    @Column(name = "M02_NAME")
    private String m02Name;

    public Integer getM02ID() {
        return m02ID;
    }

    public void setM02ID(Integer m02ID) {
        this.m02ID = m02ID;
    }

    public String getM02Name() {
        return m02Name;
    }

    public void setM02Name(String m02Name) {
        this.m02Name = m02Name;
    }
}

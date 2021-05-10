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

}

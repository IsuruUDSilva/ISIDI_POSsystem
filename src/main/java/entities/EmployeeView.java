package entities;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table(name = "vw_m01_employee")
public class EmployeeView {

    @Id
    @Column(name = "M01_ID")
    private Integer m01Id;

    @Column(name = "M01_TYPE_ID_M02")
    private int m01TypeIdM02;

    @Column(name = "M02_NAME")
    private String m02Name;

    @Column(name = "M01_ACTIVE")
    private int m01_active;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "M01_FIRST_NAME")
    private String m01FirstName;

    @Column(name = "M01_LAST_NAME")
    private String m01LastName;

    @Column(name = "M01_ADDRESS")
    private String m01Address;

    @Column(name = "M01_PHONE")
    private String m01Phone;

    @Column(name = "M01_NIC")
    private String m01Nic;

    @Column(name = "M01_USER_NAME")
    private String m01UserName;

    public Integer getM01Id() {
        return m01Id;
    }

    public int getM01TypeIdM02() {
        return m01TypeIdM02;
    }

    public String getM02Name() {
        return m02Name;
    }

    public int getM01_active() {
        return m01_active;
    }

    public String getIsActive() {
        return isActive;
    }

    public String getM01FirstName() {
        return m01FirstName;
    }

    public String getM01LastName() {
        return m01LastName;
    }

    public String getM01Address() {
        return m01Address;
    }

    public String getM01Phone() {
        return m01Phone;
    }

    public String getM01Nic() {
        return m01Nic;
    }

    public String getM01UserName() {
        return m01UserName;
    }
}

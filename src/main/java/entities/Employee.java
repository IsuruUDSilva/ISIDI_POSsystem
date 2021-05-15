package entities;

import javax.persistence.*;

@Entity
@Table(name = "m01_employee")
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "M01_ID")
    private Integer m01Id;

    @Column(name = "M01_TYPE_ID_M02")
    private int m01Type;

    @Column(name = "M01_ACTIVE")
    private int m01Active;

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

    @Column(name = "M01_PASSWORD")
    private String m01Password;

    public Integer getM01Id() {
        return m01Id;
    }

    public void setM01Id(Integer m01Id) {
        this.m01Id = m01Id;
    }

    public int getM01Type() {
        return m01Type;
    }

    public void setM01Type(int m01Type) {
        this.m01Type = m01Type;
    }

    public int getM01Active() {
        return m01Active;
    }

    public void setM01Active(int m01Active) {
        this.m01Active = m01Active;
    }

    public String getM01FirstName() {
        return m01FirstName;
    }

    public void setM01FirstName(String m01FirstName) {
        this.m01FirstName = m01FirstName;
    }

    public String getM01LastName() {
        return m01LastName;
    }

    public void setM01LastName(String m01LastName) {
        this.m01LastName = m01LastName;
    }

    public String getM01Address() {
        return m01Address;
    }

    public void setM01Address(String m01Address) {
        this.m01Address = m01Address;
    }

    public String getM01Phone() {
        return m01Phone;
    }

    public void setM01Phone(String m01Phone) {
        this.m01Phone = m01Phone;
    }

    public String getM01Nic() {
        return m01Nic;
    }

    public void setM01Nic(String m01Nic) {
        this.m01Nic = m01Nic;
    }

    public String getM01UserName() {
        return m01UserName;
    }

    public void setM01UserName(String m01UserName) {
        this.m01UserName = m01UserName;
    }

    public String getM01Password() {
        return m01Password;
    }

    public void setM01Password(String m01Password) {
        this.m01Password = m01Password;
    }
}


package entities;


import javax.persistence.*;

@Entity
@Table(name = "m04_product_category")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "M04_ID")
    private Integer m04ID;

    @Column(name = "M04_NAME")
    private String m04Name;

    public Integer getM04ID() {
        return m04ID;
    }

    public void setM04ID(Integer m04ID) {
        this.m04ID = m04ID;
    }

    public String getM04Name() {
        return m04Name;
    }

    public void setM04Name(String m04Name) {
        this.m04Name = m04Name;
    }
}


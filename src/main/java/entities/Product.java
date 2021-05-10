package entities;

import javax.persistence.*;


@Entity
@Table(name = "m03_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "M03_ID")
    private Integer m03ID;

    @Column(name = "M03_NAME")
    private String m03Name;

    @Column(name = "M03_SIZE")
    private String m03Size;

    @Column(name = "M03_UNIT_PRICE")
    private double m03UnitPrice;

    @Column(name = "M03_QUANTITY")
    private int m03Quantity;

    @Column(name = "M03_CATEGORY_ID_M04")
    private int m03CategoryIDM04;

    public Integer getM03ID() {
        return m03ID;
    }

    public void setM03ID(Integer m03ID) {
        this.m03ID = m03ID;
    }

    public String getM03Name() {
        return m03Name;
    }

    public void setM03Name(String m03Name) {
        this.m03Name = m03Name;
    }

    public String getM03Size() {
        return m03Size;
    }

    public void setM03Size(String m03Size) {
        this.m03Size = m03Size;
    }

    public double getM03UnitPrice() {
        return m03UnitPrice;
    }

    public void setM03UnitPrice(double m03UnitPrice) {
        this.m03UnitPrice = m03UnitPrice;
    }

    public int getM03CategoryIDM04() {
        return m03CategoryIDM04;
    }

    public void setM03CategoryIDM04(int m03CategoryIDM04) {
        this.m03CategoryIDM04 = m03CategoryIDM04;
    }

    public int getM03Quantity() {
        return m03Quantity;
    }

    public void setM03Quantity(int m03Quantity) {
        this.m03Quantity = m03Quantity;
    }
}

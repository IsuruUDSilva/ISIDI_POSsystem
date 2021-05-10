package entities;

import javax.persistence.*;

@Entity
@Table(name = "m05_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "M05_ID")
    private Integer m05ID;

    @Column(name = "M05_CODE")
    private int m05Code;

    @Column(name = "M05_PRODUCT_ID_M03")
    private int m05ProductIDM03;

    @Column(name = "M05_QUANTITY")
    private int m05Quantity;

    public Integer getM05ID() {
        return m05ID;
    }

    public void setM05ID(Integer m05ID) {
        this.m05ID = m05ID;
    }

    public int getM05Code() {
        return m05Code;
    }

    public void setM05Code(int m05Code) {
        this.m05Code = m05Code;
    }

    public int getM05ProductIDM03() {
        return m05ProductIDM03;
    }

    public void setM05ProductIDM03(int m05ProductIDM03) {
        this.m05ProductIDM03 = m05ProductIDM03;
    }

    public int getM05Quantity() {
        return m05Quantity;
    }

    public void setM05Quantity(int m05Quantity) {
        this.m05Quantity = m05Quantity;
    }
}

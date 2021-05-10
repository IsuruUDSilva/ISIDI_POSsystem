package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "m06_bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "M06_ID")
    private Integer m06ID;

    @Column(name = "M06_ORDER_CODE")
    private int m06OrderCode;

    @Column(name = "M06_DATE_AND_TIME")
    private Date m06DateAbdTime;

    @Column(name = "M06_CASHIER_ID_M01")
    private int m06CashierIDM01;

    @Column(name = "M06_PAYMENT_METHOD")
    private int m06PaymentMthod;

    @Column(name = "M06_TOTAL_PRICE")
    private double m06TotalPrice;

    public Integer getM06ID() {
        return m06ID;
    }

    public void setM06ID(Integer m06ID) {
        this.m06ID = m06ID;
    }

    public int getM06OrderCode() {
        return m06OrderCode;
    }

    public void setM06OrderCode(int m06OrderCode) {
        this.m06OrderCode = m06OrderCode;
    }

    public Date getM06DateAbdTime() {
        return m06DateAbdTime;
    }

    public void setM06DateAbdTime(Date m06DateAbdTime) {
        this.m06DateAbdTime = m06DateAbdTime;
    }

    public int getM06CashierIDM01() {
        return m06CashierIDM01;
    }

    public void setM06CashierIDM01(int m06CashierIDM01) {
        this.m06CashierIDM01 = m06CashierIDM01;
    }

    public double getM06TotalPrice() {
        return m06TotalPrice;
    }

    public void setM06TotalPrice(double m06TotalPrice) {
        this.m06TotalPrice = m06TotalPrice;
    }

    public void setM06PaymentMthod(int m06PaymentMthod) {
        this.m06PaymentMthod = m06PaymentMthod;
    }

    public int getM06PaymentMthod() {
        return m06PaymentMthod;
    }

}


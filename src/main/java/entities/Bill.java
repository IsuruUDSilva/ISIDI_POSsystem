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

}

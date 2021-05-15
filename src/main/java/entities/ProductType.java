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

    @Column(name = "M04_IS_MAIN_CATEGORY")
    private int m04IsMainCategory;

    @Column(name = "M04_MAIN_CATEGORY_ID_M04")
    private Integer m04MainCategoryIdM04;

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

    public int getM04IsMainCategory() {
        return m04IsMainCategory;
    }

    public void setM04IsMainCategory(int m04IsMainCategory) {
        this.m04IsMainCategory = m04IsMainCategory;
    }

    public Integer getM04MainCategoryIdM04() {
        return m04MainCategoryIdM04;
    }

    public void setM04MainCategoryIdM04(Integer m04MainCategoryIdM04) {
        this.m04MainCategoryIdM04 = m04MainCategoryIdM04;
    }
}


package entities.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "z01_tables")
public class DBTable {
    @Id
    @Column(name = "Z01_ID")
    private Integer z01Id;

    @Column(name = "Z01_TABLE_NAME")
    private String z01TableName;

    @Column(name = "Z01_REFFERENCE_NAME")
    private String z01ReferenceName;

    @Column(name = "Z01_VIEW_NAME")
    private String z01ViewName;

    public Integer getZ01Id() {
        return z01Id;
    }

    public void setZ01Id(Integer z01Id) {
        this.z01Id = z01Id;
    }

    public String getZ01TableName() {
        return z01TableName;
    }

    public void setZ01TableName(String z01TableName) {
        this.z01TableName = z01TableName;
    }

    public String getZ01ReferenceName() {
        return z01ReferenceName;
    }

    public void setZ01ReferenceName(String z01ReferenceName) {
        this.z01ReferenceName = z01ReferenceName;
    }

    public String getZ01ViewName() {
        return z01ViewName;
    }

    public void setZ01ViewName(String z01ViewName) {
        this.z01ViewName = z01ViewName;
    }
}

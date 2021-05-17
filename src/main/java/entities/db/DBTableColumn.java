package entities.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "z02_columns")
public class DBTableColumn implements Serializable {

    @Id
    @Column(name = "Z02_ID_Z01")
    private int z02IdZ01;

    @Id
    @Column(name = "Z02_COLUMN_NAME")
    private String z02ColumnName;

    @Column(name = "Z02_COLUMN_DISPLAY_NAME")
    private String z02ColumnDisplayName;

    @Column(name = "Z02_COLUMN_LENGTH")
    private int z02Length;

    @Column(name = "Z02_SEQUENCE")
    private int z02Sequence;

    @Column(name = "Z02_TYPE")
    private int z02Type;


    public int getZ02IdZ01() {
        return z02IdZ01;
    }

    public void setZ02IdZ01(int z02IdZ01) {
        this.z02IdZ01 = z02IdZ01;
    }

    public String getZ02ColumnName() {
        return z02ColumnName;
    }

    public void setZ02ColumnName(String z02ColumnName) {
        this.z02ColumnName = z02ColumnName;
    }

    public String getZ02ColumnDisplayName() {
        return z02ColumnDisplayName;
    }

    public void setZ02ColumnDisplayName(String z02ColumnDisplayName) {
        this.z02ColumnDisplayName = z02ColumnDisplayName;
    }

    public int getZ02Length() {
        return z02Length;
    }

    public void setZ02Length(int z02Length) {
        this.z02Length = z02Length;
    }

    public int getZ02Sequence() {
        return z02Sequence;
    }

    public void setZ02Sequence(int z02Sequence) {
        this.z02Sequence = z02Sequence;
    }

    public int getZ02Type() {
        return z02Type;
    }

    public void setZ02Type(int z02Type) {
        this.z02Type = z02Type;
    }


}

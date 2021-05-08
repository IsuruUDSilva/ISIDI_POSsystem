package utility.DbManager;

import java.sql.ResultSet;

public interface DbManagerI {

    ResultSet getData();
    ResultSet getData(String data);
    ResultSet getData(String data, String filter);
    ResultSet getData(int data);
    ResultSet getData(int data, String filter);


}

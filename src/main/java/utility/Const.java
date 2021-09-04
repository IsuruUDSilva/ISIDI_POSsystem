package utility;

public final class Const {
    //-----------------------------------------identifiers---------------------------------------------------
    public static final String EMPLOYEE_TABLE_IDENTIFIER = "M01";
    public static final String BILL_TABLE_IDENTIFIER = "M06";
    public static final String DB_TABLE_IDENTIFIER = "Z01";
    public static final String DB_TABLE_COLUMN_IDENTIFIER = "Z02";
    //-------------------------------------------queries-----------------------------------------------------
    public static final String WHERE = " WHERE ";
    public static final String AND = " AND ";

    //Regarding EmployeeM01 table-----------------
    public static final String EMPLOYEE_SELECT_ALL_QUERY = "FROM Employee " + EMPLOYEE_TABLE_IDENTIFIER;
    public static final String EMPLOYEE_SELECT_ALL_QUERY_WITH_WHERE = EMPLOYEE_SELECT_ALL_QUERY + WHERE + EMPLOYEE_TABLE_IDENTIFIER + ".";
    public static final String ACTIVE_EMPLOYEE_SELECT = EMPLOYEE_SELECT_ALL_QUERY_WITH_WHERE + "m01Active = 1";

    //Regarding z0 tables
    public static final String DB_TABLE_SELECT_ALL_QUERY = "FROM DBTable " + DB_TABLE_IDENTIFIER;
    public static final String DB_TABLE_SELECT_ALL_QUERY_WITH_WHERE = DB_TABLE_SELECT_ALL_QUERY + WHERE + DB_TABLE_IDENTIFIER + ".";

    //Regarding z02Table;
    public static final String DB_TABLE_COLUMNS_SELECT_ALL = "FROM DBTableColumn " + DB_TABLE_COLUMN_IDENTIFIER;
    public static final String DB_TABLE_COLUMNS_SELECT_ALL_QUERY_WITH_WHERE = DB_TABLE_COLUMNS_SELECT_ALL + WHERE + DB_TABLE_COLUMN_IDENTIFIER + ".";

    // Regarding vw_m01_employee view --------------
    public static final String EMPLOYEE_VW_SELECT_ALL_QUERY = "FROM EmployeeView " + EMPLOYEE_TABLE_IDENTIFIER;
    public static final String EMPLOYEE_VW_SELECT_ALL_QUERY_WITH_WHERE = EMPLOYEE_VW_SELECT_ALL_QUERY + WHERE + EMPLOYEE_TABLE_IDENTIFIER + ".";

    //Regarding z01 references
    public static final String EMPLOYEE_TABLE_REFERENCE = "employee";

    //Regarding BillM06 table------------------------
//    public static final String BILL_SELECT_ALL_
    public enum employeeType {
        Admin,
        Manager,
        Cashier
    }
}

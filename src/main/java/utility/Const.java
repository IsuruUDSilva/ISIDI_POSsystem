package utility;

public final class Const {
    //-----------------------------------------identifiers---------------------------------------------------
    public static final String EMPLOYEE_TABLE_IDENTIFIER = "M01";
    public static final String BILL_TABLE_IDENTIFIER = "M06";
    //-------------------------------------------queries-----------------------------------------------------
    public static final String WHERE = " WHERE ";
    public static final String AND = " AND ";

    //Regarding EmployeeM01 table-----------------
    public static final String EMPLOYEE_SELECT_ALL_QUERY = "FROM Employee " + EMPLOYEE_TABLE_IDENTIFIER;
    public static final String EMPLOYEE_SELECT_ALL_QUERY_WITH_WHERE = EMPLOYEE_SELECT_ALL_QUERY + WHERE + EMPLOYEE_TABLE_IDENTIFIER + ".";
    public static final String ACTIVE_EMPLOYEE_SELECT = EMPLOYEE_SELECT_ALL_QUERY_WITH_WHERE + "m01Active = 1";


    //Regarding BillM06 table------------------------
//    public static final String BILL_SELECT_ALL_
    public enum employeeType{
        Admin,
        Manager,
        Cashier

    }
}

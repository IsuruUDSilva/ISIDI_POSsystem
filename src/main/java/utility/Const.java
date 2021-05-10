package utility;

public final class Const {
    //-----------------------------------------identifiers---------------------------------------------------
    public static final String EMPLOYEE_TABLE_IDENTIFIER = "M01";

    //-------------------------------------------queries-----------------------------------------------------
    public static final String WHERE = " WHERE ";

    //Regarding EmployeeM01 table-----------------
    public static final String EMPLOYEE_SELECT_ALL_QUERY = "FROM Employee " + EMPLOYEE_TABLE_IDENTIFIER;
    public static final String EMPLOYEE_SELECT_ALL_QUERY_WITH_WHERE = EMPLOYEE_SELECT_ALL_QUERY + WHERE + EMPLOYEE_TABLE_IDENTIFIER + ".";
    // from Employee m01 where m01.
}

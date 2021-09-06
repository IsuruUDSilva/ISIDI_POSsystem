package utility;

import java.util.HashMap;
import java.util.Map;

public enum EmployeeTypeEnum {
    ADMIN("Admin", 1),
    MANAGER("Manager", 2),
    CASHIER("Cashier", 3);

    private static final Map<String, EmployeeTypeEnum> BY_LABEL = new HashMap<>();

    static {
        for (EmployeeTypeEnum type : values()) {
            BY_LABEL.put(type.key, type);
        }
    }

    private final String key;
    private final Integer value;

    EmployeeTypeEnum(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    public static EmployeeTypeEnum getEnum(String key) {
        return BY_LABEL.get(key);
    }
}

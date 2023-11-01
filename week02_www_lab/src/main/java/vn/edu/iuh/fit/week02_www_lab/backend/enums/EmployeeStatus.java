package vn.edu.iuh.fit.week02_www_lab.backend.enums;

public enum EmployeeStatus {
    ACTIVE(1),
    IN_ACTIVE(0),
    TERMIATED(-1);

    private int value;

    EmployeeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static EmployeeStatus fromValue(int value) {
        for (EmployeeStatus status : EmployeeStatus.values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid role value: " + value);
    }

    public void setValue(int value) {
        this.value = value;
    }
}

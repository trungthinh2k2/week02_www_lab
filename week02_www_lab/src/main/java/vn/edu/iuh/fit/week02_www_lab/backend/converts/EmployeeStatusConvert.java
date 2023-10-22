package vn.edu.iuh.fit.week02_www_lab.backend.converts;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.EmployeeStatus;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class EmployeeStatusConvert implements AttributeConverter<EmployeeStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(EmployeeStatus employeeStatus) {
        if (employeeStatus == null) {
            return null;
        }
        return employeeStatus.getValue();
    }

    @Override
    public EmployeeStatus convertToEntityAttribute(Integer integer) {
        if (integer == null) {
            return null;
        }
        return Stream.of(EmployeeStatus.values())
                .filter(c -> c.getValue() == integer)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}


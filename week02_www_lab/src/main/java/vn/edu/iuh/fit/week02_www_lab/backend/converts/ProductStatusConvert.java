package vn.edu.iuh.fit.week02_www_lab.backend.converts;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import vn.edu.iuh.fit.week02_www_lab.backend.enums.ProductStatus;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class ProductStatusConvert implements AttributeConverter<ProductStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ProductStatus employeeStatus) {
        if (employeeStatus == null) {
            return null;
        }
        return employeeStatus.getValue();
    }

    @Override
    public ProductStatus convertToEntityAttribute(Integer integer) {
        if (integer == null) {
            return null;
        }
        return Stream.of(ProductStatus.values())
                .filter(c -> c.getValue() == integer)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}

package me.shaivil.nursease.utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.Pattern;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = {})
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Pattern(regexp = "^(?=.*[!@#$%^&*()]).+$", message = "Must contain at least one special character including !@#$%^&*()")
@ReportAsSingleViolation
public @interface RequiresSpecialCharacters {
    String message() default "Must contain at least one special character including !@#$%^&*()";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

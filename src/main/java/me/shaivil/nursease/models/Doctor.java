package me.shaivil.nursease.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document(collation = "doctors")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id private String uuid = UUID.randomUUID().toString();
    @Field private String medicalField = "N/A";
    @Field private boolean currentlyAssigned = false;
    @Field private double hoursWorked = 0.0;
    @Field private String username, password;

}

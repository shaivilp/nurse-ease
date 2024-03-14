package me.shaivil.nursease.models.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Document(collation = "patients")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id private String uuid = UUID.randomUUID().toString();
    @Field private String name;
    @Field private int age;
    @Field private double weight;
    @Field private Date dob;
    @Field private String condition = "Unknown";
    @Field private String diagnosis = "Unknown";
    @Field @DBRef
    List<Doctor> assignedDoctors;
}

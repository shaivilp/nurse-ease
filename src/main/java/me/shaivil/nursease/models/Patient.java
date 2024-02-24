package me.shaivil.nursease.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Document(collation = "patients")
@Getter @Setter
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

    public Patient(String name, Date dob, int age, int weight){
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.weight = weight;
    }

    public Patient(String name, Date dob, int age, int weight, String condition){
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.weight = weight;
        this.condition = condition;
    }
}

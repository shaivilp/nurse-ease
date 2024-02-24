package me.shaivil.nursease.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document(collation = "doctors")
@Getter @Setter
@NoArgsConstructor
public class Doctor {
    @Id private String uuid = UUID.randomUUID().toString();
    @Field private String medicalField = "N/A";
    @Field private boolean currentlyAssigned = false;
    @Field private double hoursWorked = 0.0;
    @Field private String username, password;

    public Doctor(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Doctor(String username,  String password, String medicalField){
        this.username = username;
        this.password = password;
        this.medicalField = medicalField;
    }


}

package me.shaivil.nursease.repositories;

import me.shaivil.nursease.models.Doctor;
import me.shaivil.nursease.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface PatientRepository extends MongoRepository<Patient, String> {

    Patient findByUUID(String uuid);
    Doctor findByName(String name);
    void deleteByUUID(String username);
    void deleteByNameAndDob(String name, Date dob);
}

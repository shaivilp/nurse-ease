package me.shaivil.nursease.repositories;

import me.shaivil.nursease.models.entities.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {

    Doctor findByUUID(String uuid);
    Doctor findByUsername(String username);
    void deleteByUsername(String username);
}

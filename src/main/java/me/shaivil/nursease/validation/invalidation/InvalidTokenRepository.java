package me.shaivil.nursease.validation.invalidation;

import me.shaivil.nursease.mongo.MongoConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvalidTokenRepository extends MongoRepository<InvalidToken, String> {
    InvalidToken findByToken(String token);
    void deleteByToken(String token);
}

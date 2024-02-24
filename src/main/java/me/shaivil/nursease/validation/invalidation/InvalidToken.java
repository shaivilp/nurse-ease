package me.shaivil.nursease.validation.invalidation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "invalidTokens")
@Getter @Setter
public class InvalidToken {
    @Id private String id;
    @Field private String token;
    @Field private String userId;

    public InvalidToken(String token, String userId){
        this.token = token;
        this.userId = userId;
    }
}

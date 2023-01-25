package sauceDemo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String zipCode;
}

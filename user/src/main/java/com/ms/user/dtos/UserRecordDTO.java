package com.ms.user.dtos;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class UserRecordDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    public UserRecordDTO() {
    }

    public UserRecordDTO(@NotBlank String name, @NotBlank @Email String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRecordDTO)) return false;
        UserRecordDTO that = (UserRecordDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "UserRecordDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

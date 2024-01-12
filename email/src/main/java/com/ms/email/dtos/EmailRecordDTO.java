package com.ms.email.dtos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class EmailRecordDTO implements Serializable {

    private UUID userId;
    private String emailTo;
    private String subject;
    private String text;

    public EmailRecordDTO() {
    }

    public EmailRecordDTO(UUID userId, String emailTo, String subject, String text) {
        this.userId = userId;
        this.emailTo = emailTo;
        this.subject = subject;
        this.text = text;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailRecordDTO)) return false;
        EmailRecordDTO that = (EmailRecordDTO) o;
        return Objects.equals(userId, that.userId) && Objects.equals(emailTo, that.emailTo) && Objects.equals(subject, that.subject) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, emailTo, subject, text);
    }

    @Override
    public String toString() {
        return "EmailRecordDTO{" +
                "userId=" + userId +
                ", emailTo='" + emailTo + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

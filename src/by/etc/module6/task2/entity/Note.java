package by.etc.module6.task2.entity;

import java.time.LocalDate;

public class Note {
    private String subject;
    private LocalDate date;
    private String email;
    private String message;

    public Note(){
        this.subject = "";
        this.date = LocalDate.of(1, 1, 1);
        this.email = "";
        this.message = "";
    }

    public Note(String subject, LocalDate date, String email, String message){
        this.subject = subject;
        this.date = date;
        this.email = email;
        this.message = message;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return String.format("Subject: %-20s date: %-12s email: %-20s message: %s",
                subject, date, email, message);
    }
}

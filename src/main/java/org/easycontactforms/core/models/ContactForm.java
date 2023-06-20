package org.easycontactforms.core.models;

import org.easycontactforms.core.dtos.ContactFormDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@Table(name = "contact_form")
@AllArgsConstructor
public class ContactForm {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @NotNull
    @Email
    private String email;

    private String name;

    private String subject;

    @NotNull
    @Column(length = 10240)
    private String message;

    @NotNull
    private boolean emailSent;


    public ContactForm(String email, String name, String subject, String message){
        this.email = email;
        this.name = name;
        this.subject = subject;
        this.message = message;
        this.emailSent = false;
    }
    public static ContactForm fromContactFormDto(ContactFormDto contactFormDto){
        return new ContactForm(contactFormDto.getEmail(), contactFormDto.getName(), contactFormDto.getSubject(), contactFormDto.getMessage());
    }
}

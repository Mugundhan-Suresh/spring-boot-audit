package com.mugundhan.spring_audit.spring_audit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Audited
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int pages;

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setName(String name){
        this.name = name;
    }
}

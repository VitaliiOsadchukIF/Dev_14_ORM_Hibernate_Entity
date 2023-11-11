package org.example.database.entities;


import lombok.Data;
import jakarta.persistence.*;


// Анотація @Entity вказує, що цей клас є сутністю, яку можна зберігати в базі даних.
@Data
@Entity
@Table(name = "planet")
public class Planet {
    // Анотація @Id позначає поле як ідентифікатор.
    @Id
    @Column(name = "id", length = 10)
    private String id;

    // Анотація @Column вказує назву стовпця в таблиці та його властивості.
    @Column(name = "name", length = 500, nullable = false)
    private String name;


}

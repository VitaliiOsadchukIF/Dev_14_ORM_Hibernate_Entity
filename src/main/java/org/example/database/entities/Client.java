package org.example.database.entities;


import jakarta.persistence.*;
import lombok.Data;


// Анотація @Entity вказує, що цей клас є сутністю, яку можна зберігати в базі даних.
@Data
@Entity
@Table(name = "client")
public class Client {
    // Анотація @Id позначає поле як первинний ключ.
    // Анотація @GeneratedValue вказує, що значення цього поля буде автоматично згенеровано.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // Анотація @Column вказує назву стовпця в таблиці та його властивості.
    @Column(name = "name", length = 200, nullable = false)
    private String name;


}

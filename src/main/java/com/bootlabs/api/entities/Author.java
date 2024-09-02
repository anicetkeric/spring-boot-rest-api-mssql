package com.bootlabs.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * JPA entity class for "Author"
 *
 * @author @bootteam
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author")
public class Author implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastname;

    @Column(name = "firstname", length = 255)
    private String firstname;

    @OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();
}

package com.bootlabs.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * JPA entity class for "Book"
 *
 * @author @bootteam
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "description")
    private String description;

    @Column(name = "page")
    private Integer page;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JsonIgnoreProperties("books")
    private Author author;

}

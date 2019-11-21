package ru.itvitality.sbrf.cu.library.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column
    private String name;

    @Column
    private String author;

    @OneToMany(targetEntity = Movement.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private List<Movement> movements;

    public Long getId() {
        return id;
    }

    public Book setId( Long id ) {
        this.id = id;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn( String isbn ) {
        this.isbn = isbn;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName( String name ) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor( String author ) {
        this.author = author;
        return this;
    }

    public List<Movement> getMovements() {
        return movements;
    }

    public Book setMovements( List<Movement> movements ) {
        this.movements = movements;
        return this;
    }
}

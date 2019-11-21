package ru.itvitality.sbrf.cu.library.entities;

import javax.persistence.*;

@Entity
@Table(name = "placement")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn()
public class Placement{
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public Placement setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Placement setName(String name) {
        this.name = name;
        return this;
    }
    /*@OneToOne(targetEntity = Holder.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Holder> holders;*/
}

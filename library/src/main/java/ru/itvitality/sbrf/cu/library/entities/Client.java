package ru.itvitality.sbrf.cu.library.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("client")
public class Client extends Holder {
    @Column
    private String address;

    @Column(name = "phone", nullable = false)
    private String phone;

    public String getAddress() {
        return address;
    }

    public Client setAddress( String address ) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Client setPhone( String phone ) {
        this.phone = phone;
        return this;
    }
    /*@OneToOne(targetEntity = Holder.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Holder> holders;*/
}

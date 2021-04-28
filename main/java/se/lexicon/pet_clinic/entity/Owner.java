package se.lexicon.pet_clinic.entity;

import lombok.Data;


@Data
@Entity
public class Owner {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false,updatable = false)
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String telephone;

}

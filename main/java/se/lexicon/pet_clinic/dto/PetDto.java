package se.lexicon.pet_clinic.dto;

import lombok.Data;
import se.lexicon.pet_clinic.entity.Owner;

import java.time.LocalTime;

@Data
public class PetDto {
    // todo: implement PetDto
    // OK
    private String id;
    private String name;
    private LocalTime birthDate;
    private PetType petType;
    private Owner owner;


}

package se.lexicon.pet_clinic.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class VisitDto {
    // todo: implement VisitDao
    // OK

    private String id;
    private Pet pet;
    private LocalDate visitDate;
    private String description;
}

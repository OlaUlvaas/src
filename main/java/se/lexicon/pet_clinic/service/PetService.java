package se.lexicon.pet_clinic.service;

import se.lexicon.pet_clinic.dto.PetDto;

import java.util.List;

public interface PetService {

    // todo: define SAVE, UPDATE, DELETE, Find All, FIND BY ID, find By Name, find By PetTypeName, find By OwnerFirstNameAndLastName, find By OwnerTelephone


    PetDto save(PetDto dto);
    PetDto update(PetDto dto) throws DataNotFoundException;



    OwnerDto findById(String id) throws DataNotFoundException;

    void deleteById(String id);

    List<OwnerDto> getAll();

    List<OwnerDto> advanceSearch(String firstName, String lastname);
}

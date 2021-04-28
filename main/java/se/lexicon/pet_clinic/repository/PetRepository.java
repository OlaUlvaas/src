package se.lexicon.pet_clinic.repository;


public interface PetRepository extends CrudRepository<Pet, String>{

    // todo: implement basic CRUD //OK

    List<Pet> findByNameIgnoreCase(String name);
    //todo: select pet by name // OK
    List<Pet> findByPetTypeIgnoreCase(String type);
    //todo: select pet by pet type name // OK
    List<Pet> findByOwnerIgnoreCase(String firstName, String lastName);
    //todo: select pet by owner first name and last name // OK
    List<Pet> findByOwnerIgnoreCase(String telephone);
    //todo: select pet by owner telephone / OK
}

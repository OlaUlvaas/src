package se.lexicon.pet_clinic.repository;

public interface VisitRepository extends CrudRepository <Visit, String>{
    // todo: implement basic CRUD // OK

    //todo: select visit by pet name // OK
    List<Pet> findByPetNameIgnoreCase(String petName);

    //todo: select visit by pet type name // OK
    List<Pet> findByPetPetType(String petType);
}

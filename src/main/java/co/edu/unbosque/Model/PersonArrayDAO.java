package co.edu.unbosque.Model;

import co.edu.unbosque.Model.persistance.Person;

import java.util.ArrayList;

public class PersonArrayDAO {

    private ArrayList<Person> persons;

    public PersonArrayDAO(){
         persons = new ArrayList<Person>();
    }

    public boolean addPerson (Person person){
        try {
            persons.add(person);
            return true;
        }catch (Exception e){
            System.out.println("Ocurrio un error al agregar" + e);
            return false;
        }
    }

    public ArrayList<Person>getPersons(){
        return persons;
    }
}

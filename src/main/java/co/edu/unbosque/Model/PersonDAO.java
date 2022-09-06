package co.edu.unbosque.Model;

import co.edu.unbosque.Model.persistance.Archivo;
import co.edu.unbosque.Model.persistance.Person;

import java.io.IOException;
import java.util.ArrayList;

public class PersonDAO {

    public ArrayList<Person> personas;
    private Archivo archivo;

    public PersonDAO () throws IOException {
        personas = new ArrayList<>();
        archivo = new Archivo();
    }

    public boolean savePersona(Person person){
        try {
            personas.add(person);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean saveInFile(Person person) throws IOException, ClassNotFoundException {
        try{
            return archivo.savePerson(person);
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<Person> readFile(){
        try{
            ArrayList<Person> persons = archivo.getPerson();
            return persons;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

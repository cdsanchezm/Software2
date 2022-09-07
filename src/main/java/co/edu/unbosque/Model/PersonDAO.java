package co.edu.unbosque.Model;

import co.edu.unbosque.Model.persistance.Archive;
import co.edu.unbosque.Model.persistance.Person;

import java.io.IOException;
import java.util.ArrayList;

public class PersonDAO {

    public ArrayList<Person> personas;
    private Archive archivo;

    public PersonDAO () throws IOException {
        personas = new ArrayList<>();
    }





}

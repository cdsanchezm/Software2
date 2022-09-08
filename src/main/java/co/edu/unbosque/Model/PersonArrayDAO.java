package co.edu.unbosque.Model;

import co.edu.unbosque.Model.persistance.Person;

import java.util.ArrayList;

public class PersonArrayDAO {

    private ArrayList<Person> persons;

    public PersonArrayDAO(){
         persons = new ArrayList<Person>();
    }

    public Person findPerson(int num_identification, ArrayList<Person> persons) {
        Person find = null;
        if (!persons.isEmpty()) {
            for (int i = 0; i < persons.size(); i++) {

                if (persons.get(i).getNum_identification() == num_identification) {
                    find = persons.get(i);

                }
            }
        }
        return find;
    }

    public boolean addPerson (String name, String lastname, String tip_identification, int num_identification, String sex, int age, ArrayList<Person>persons) {
        boolean validate = false;
        if (findPerson(num_identification, persons) == null) {
            Person person = new Person(tip_identification, num_identification, sex, age, name, lastname);
            persons.add(person);

            validate = true;
        } else
            validate = false;
        return validate;
    }

    public ArrayList<Person>getPersons(){
        return persons;
    }
}

package co.edu.unbosque.Model;

import co.edu.unbosque.Model.persistance.Archive;
import co.edu.unbosque.Model.persistance.Person;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class PersonBinaryDAO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Archive archivo;
    private ArrayList<Person>persons;


    public PersonBinaryDAO(Archive archivo){
        this.archivo = archivo;
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

    public boolean addperson (String name, String lastname, String tip_identification, int num_identification, String sex, int age, ArrayList<Person>persons, File file){
        boolean validate = false;

        if (findPerson(num_identification, persons) == null){
            Person person = new Person(tip_identification, num_identification, sex,age,name,lastname);
            persons.add(person);

            archivo.writeFile(persons, file);
            validate = true;
        }else
            validate = false;

        return validate;
    }

    public boolean deletePerson(int num_identification, ArrayList<Person> persons, File file) {
        boolean validate = false;
        try {

            for (int i = 0; i < persons.size(); i++) {
                if (num_identification == persons.get(i).getNum_identification()) {

                    persons.remove(i);
                    file.delete();
                    file.createNewFile();
                    archivo.writeFile(persons, file);
                    validate = true;

                }
            }
            return validate;
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return validate;
    }

    public boolean editPersons(String name, String lastname, String tip_identification, int num_identification, String sex, int age, ArrayList<Person>persons, File file)
            throws IOException {

        for (int i = 0; i < persons.size(); i++) {
            if (num_identification == persons.get(i).getNum_identification()) {
                persons.get(i).setNames(name);
                persons.get(i).setLastnames(lastname);
                persons.get(i).setAge(age);
                persons.get(i).setTip_identification(tip_identification);
                persons.get(i).setSex(sex);
                file.delete();
                file.createNewFile();
                archivo.writeFile(persons, file);
                return true;
            }
        }
        return false;
    }


    public String ShowList(ArrayList<Person> persons) {
        String lista = "Informacion de las Personas Guardadas " + "\n" + "\n";

        for (int i = 0; i < persons.size(); i++) {
            lista = lista.concat(persons.get(i).toString() + "\n");
        }
        return lista;
    }

}

package co.edu.unbosque.Model.persistance;

import java.io.*;
import java.util.ArrayList;

public class Archivo {

    private File file;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ArrayList<Person> persons;

    public Archivo() throws IOException{
        persons = new ArrayList<>();
        file = new File("src/main/resources/persons.dat");
    }

    public boolean savePerson (Person person) throws IOException, ClassNotFoundException {
        try {
            getPerson();
            output = new ObjectOutputStream(new FileOutputStream(file));
            persons.add(person);
            output.writeObject(persons);
            output.close();
            return true;
        } catch (IOException e){
            System.out.println("An error occurred" + e);
            return false;
        }
    }

    public ArrayList<Person> getPerson() throws IOException, ClassNotFoundException {
        try {
            input = new ObjectInputStream(new FileInputStream(file));
            persons = (ArrayList<Person>) input.readObject();
            input.close();
            return persons;
        } catch (IOException e) {
            System.out.println("An error occurred " + e);
            return null;
        }
    }
}

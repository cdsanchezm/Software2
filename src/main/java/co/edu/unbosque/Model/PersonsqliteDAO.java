package co.edu.unbosque.Model;

import co.edu.unbosque.Model.persistance.Person;

import java.sql.*;
import java.util.ArrayList;

public class PersonsqliteDAO {

    private Connection connection;

    public void Sqlite() {
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/ingSoftwareDAO.sqlite");
            if(connection != null){
                System.out.println("Conexión exitosa con sqlite");
                connection.createStatement().execute("CREATE TABLE IF NOT EXISTS person (id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(50), lastname VARCHAR(50), num_identification INTEGER, type_identification VARCHAR(60),sex VARCHAR(50) ,age INTEGER)");
            }
        } catch (Exception e) {
            System.err.println("error in cath " + e);
            System.out.println("Error de conexion " + e);
        }
    }

    public boolean savePerson(String name, String lastname, String tip_identification, int num_identification, String sex, int age){
        try {
            connection.createStatement().execute(
                    "INSERT INTO person VALUES (null, '"+name+"','"+lastname+"', '"+num_identification+"', '"+tip_identification+"', '"+sex+"',"+age+")");
                return true;
            }catch (SQLException e){
            System.err.println("Ocurrio un error" + e);
            return false;
        }
    }

    public boolean UpdatePerson (String name, String lastname, String tip_identification, String sex, int age, int num_identification){
        try {
            connection.createStatement().execute(
                    "UPDATE person SET name='"+name+"', SET lastname='"+lastname+"', SET type_identification = '"+tip_identification+"', SET sex= '"+sex+"', SET age = '"+age+"' WHERE num_identification = "+num_identification);
                return true;
        } catch (SQLException e){
            System.err.println("Ocurrio un error" + e);
            return false;
        }
    }

    public boolean DeletePerson ( int num_identification){
        try {
            connection.createStatement().execute(
                    "DELETE FROM person WHERE num_identification="+num_identification
            );
             return true;
        } catch (SQLException e){
             System.err.println("Ocurrio un error" + e);
             return false;
        }
    }

   public ArrayList<Person> getPerson() {
             try{
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
                 ArrayList<Person> personas = new ArrayList<>();
                 while (resultSet.next()){
                     personas.add(new Person(resultSet.getString("type_identification"),resultSet.getInt("num_identification"),resultSet.getString("sex"),resultSet.getInt("age"), resultSet.getString("name"), resultSet.getString("lastname")));
                 }
                 return personas;
             }catch (Exception e){
                 System.err.println("error in cath " + e);
                 System.out.println("Error de conexion " + e);
                 return null;
             }
         }
}

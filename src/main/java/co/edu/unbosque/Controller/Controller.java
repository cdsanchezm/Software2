package co.edu.unbosque.Controller;

import co.edu.unbosque.Model.PersonArrayDAO;
import co.edu.unbosque.Model.PersonBinaryDAO;
import co.edu.unbosque.Model.PersonsqliteDAO;
import co.edu.unbosque.Model.persistance.Archive;
import co.edu.unbosque.Model.persistance.Person;
import co.edu.unbosque.View.ButtonItem;
import co.edu.unbosque.View.MainPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class Controller implements ActionListener {

    private MainPanel mainPanel;
    private File fperson;
    private Archive archPerson;
    private PersonBinaryDAO personBinaryDAO;
    private PersonArrayDAO personArrayDAO;
    private PersonsqliteDAO personsqliteDAO;
    private ArrayList<Person>persons;
    public Object[] items;
    public Controller(){

        fperson = new File("src/main/resources/person.dat");
        archPerson = new Archive(fperson);
        personArrayDAO = new PersonArrayDAO();
        personsqliteDAO = new PersonsqliteDAO();
        personBinaryDAO = new PersonBinaryDAO(archPerson);
        persons = new ArrayList<Person>();



        mainPanel = new MainPanel();
        assignListeners();
        items = new ButtonItem[]{
                new ButtonItem("Opcion 1"),
                new ButtonItem("Opcion 2"),
                new ButtonItem("Opcion 3"),
                new ButtonItem("Opcion 4"),
                new ButtonItem("Opcion 5"),
                new ButtonItem("Opcion 6"),
                new ButtonItem("Opcion 7"),
                new ButtonItem("Opcion 8"),
                new ButtonItem("Opcion 9"),
                new ButtonItem("Opcion 0"),
                new ButtonItem("Opcion 10"),
                new ButtonItem("Opcion 11"),
                new ButtonItem("Opcion 12"),
                new ButtonItem("Opcion 13"),
                new ButtonItem("Opcion 14"),
                new ButtonItem("Opcion 15"),
                new ButtonItem("Opcion 16"),
                new ButtonItem("Opcion 17"),
                new ButtonItem("Opcion 18"),
                new ButtonItem("Opcion 19"),
                new ButtonItem("Opcion 20"),
                new ButtonItem("Opcion 21"),
                new ButtonItem("Opcion 22"),
                new ButtonItem("Opcion 23"),
                new ButtonItem("Opcion 24"),
                new ButtonItem("Opcion 25")
        };
    }

    public void assignListeners(){
        mainPanel.getHomePanel().getCreate().addActionListener(this);
        mainPanel.getHomePanel().getList().addActionListener(this);

        mainPanel.getCreatePanel().getBack().addActionListener(this);
        mainPanel.getCreatePanel().getSaveBinary().addActionListener(this);
        mainPanel.getCreatePanel().getSaveArray().addActionListener(this);
        mainPanel.getCreatePanel().getSaveSql().addActionListener(this);

        mainPanel.getListPanel().getBack().addActionListener(this);
        mainPanel.getListPanel().getClear().addActionListener(this);
        mainPanel.getListPanel().getListBinary().addActionListener(this);
        mainPanel.getListPanel().getListArray().addActionListener(this);
        mainPanel.getListPanel().getListSQL().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        //CHANGE PANEL
        if (command.equals("CREATE-USER")){
            changeTab("CREATE");
        }
        if (command.equals("LIST-USER")){
            changeTab("LIST");
        }
        if (command.equals("BACK-LIST")){
            changeTab("HOME");
        }
        if (command.equals("BACK-CREATE")){
            changeTab("HOME");
        }
        //PANEL CREATE USER
        if (command.equals("SAVE-BINARY")){
            String name = mainPanel.getCreatePanel().getNameUser().getText();
            String lastName = mainPanel.getCreatePanel().getLastname().getText();
            String idType = mainPanel.getCreatePanel().getTypeID().getSelectedItem().toString();
            String numberId = mainPanel.getCreatePanel().getNumberID().getText();
            String sex = mainPanel.getCreatePanel().getSex().getText();
            String age = mainPanel.getCreatePanel().getAge().getText();
            personBinaryDAO.addperson(name,lastName,idType,Integer.parseInt(numberId),sex,Integer.parseInt(age),persons,fperson);

            System.out.println(name+" " + lastName+" " + idType+" " + numberId+" " +sex+" " +age );
        }
        if (command.equals("SAVE-ARRAY")){
            String name = mainPanel.getCreatePanel().getNameUser().getText();
            String lastName = mainPanel.getCreatePanel().getLastname().getText();
            String idType = mainPanel.getCreatePanel().getTypeID().getSelectedItem().toString();
            String numberId = mainPanel.getCreatePanel().getNumberID().getText();
            String sex = mainPanel.getCreatePanel().getSex().getText();
            String age = mainPanel.getCreatePanel().getAge().getText();

            personArrayDAO.addPerson(name,lastName,idType,Integer.parseInt(numberId),sex,Integer.parseInt(age),persons);

            System.out.println(name+" " + lastName+" " + idType+" " + numberId+" " +sex+" " +age );
        }
        if (command.equals("SAVE-SQL")){
            String name = mainPanel.getCreatePanel().getNameUser().getText();
            String lastName = mainPanel.getCreatePanel().getLastname().getText();
            String idType = mainPanel.getCreatePanel().getTypeID().getSelectedItem().toString();
            int numberId = Integer.parseInt(mainPanel.getCreatePanel().getNumberID().getText());
            String sex = mainPanel.getCreatePanel().getSex().getText();
            int age = Integer.parseInt(mainPanel.getCreatePanel().getAge().getText());
            personsqliteDAO.Sqlite();
            personsqliteDAO.savePerson(name,lastName,idType,numberId,sex,age);

            System.out.println(name+" " + lastName+" " + idType+" " + numberId+" " +sex+" " +age );
            System.out.println(persons);
        }
        //List
        if (command.equals("LIST-BINARY")){
           mainPanel.getListPanel().getUsers().setListData(items);
           System.out.println("imprime");
        }
        if (command.equals("LIST-CLEAR")){
            mainPanel.getListPanel().getUsers().removeAll();
            mainPanel.getListPanel().getUsers().repaint();

            System.out.println("imprime");
        }
    }

    public void changeTab(String option) {
        if (option.equals("HOME")) {

            mainPanel.getHomePanel().setVisible(true);
            mainPanel.getCreatePanel().setVisible(false);
            mainPanel.getListPanel().setVisible(false);
            mainPanel.getContentPane().add(  mainPanel.getHomePanel(), BorderLayout.CENTER);

        }
        if (option.equals("CREATE")) {

            mainPanel.getHomePanel().setVisible(false);
            mainPanel.getCreatePanel().setVisible(true);
            mainPanel.getListPanel().setVisible(false);
            mainPanel.getContentPane().add( mainPanel.getCreatePanel(), BorderLayout.CENTER);

        }
        if (option.equals("LIST")) {

            mainPanel.getHomePanel().setVisible(false);
            mainPanel.getCreatePanel().setVisible(false);
            mainPanel.getListPanel().setVisible(true);
            mainPanel.getContentPane().add(  mainPanel.getListPanel(), BorderLayout.CENTER);

        }


    }

}
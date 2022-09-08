package co.edu.unbosque.View;

import javax.swing.*;

public class CreatePanel extends JPanel {

    private JLabel background;
    private JTextField name,lastname,age,sex,numberID;
    private JComboBox<String> typeID;

    private JButton saveBinary, saveArray, saveSql, back;

    public CreatePanel(){
        setLayout(null);

        initializeComponents();

        setVisible(false);
    }

    public void initializeComponents(){

        name = new JTextField();
        name.setBounds(30,165,190,25);
        name.setVisible(true);
        add(name);

        lastname = new JTextField();
        lastname.setBounds(330,165,190,25);
        lastname.setVisible(true);
        add(lastname);

        typeID = new JComboBox<>();
        typeID.addItem("Cédula");
        typeID.addItem("Tarjeta de Identidad");
        typeID.setBounds(30,245,190,25);
        typeID.setVisible(true);
        add(typeID);

        numberID = new JTextField();
        numberID.setBounds(330,245,190,25);
        numberID.setVisible(true);
        add(numberID);

        sex = new JTextField();
        sex.setBounds(30,330,190,25);
        sex.setVisible(true);
        add(sex);

        age = new JTextField();
        age.setBounds(330,330,190,25);
        age.setVisible(true);
        add(age);

        back = new JButton(new ImageIcon(getClass().getResource("/back.png")));
        back.setBounds(30,25,45,45);
        back.setActionCommand("BACK-CREATE");
        back.setVisible(true);
        add(back);

        saveBinary = new JButton("Save Binary");
        saveBinary.setBounds(30,400,150,30);
        saveBinary.setActionCommand("SAVE-BINARY");
        saveBinary.setVisible(true);
        add(saveBinary);

        saveArray = new JButton("Save Array");
        saveArray.setBounds(200,400,150,30);
        saveArray.setActionCommand("SAVE-ARRAY");
        saveArray.setVisible(true);
        add(saveArray);

        saveSql = new JButton("Save SQL");
        saveSql.setBounds(370,400,150,30);
        saveSql.setActionCommand("SAVE-SQL");
        saveSql.setVisible(true);
        add(saveSql);

        background = new JLabel();
        background.setBounds(-1,-37,995,570);
        background.setIcon(new ImageIcon(getClass().getResource("/backgroundCreate.png")));
        add(background);
    }

    public JTextField getNameUser() {
        return name;
    }

    public void setName(JTextField name) {
        this.name = name;
    }

    public JTextField getLastname() {
        return lastname;
    }

    public void setLastname(JTextField lastname) {
        this.lastname = lastname;
    }

    public JTextField getAge() {
        return age;
    }

    public void setAge(JTextField age) {
        this.age = age;
    }

    public JTextField getSex() {
        return sex;
    }

    public void setSex(JTextField sex) {
        this.sex = sex;
    }

    public JTextField getNumberID() {
        return numberID;
    }

    public void setNumberID(JTextField numberID) {
        this.numberID = numberID;
    }

    public JComboBox<String> getTypeID() {
        return typeID;
    }

    public void setTypeID(JComboBox<String> typeID) {
        this.typeID = typeID;
    }

    public JButton getSaveBinary() {
        return saveBinary;
    }

    public void setSaveBinary(JButton saveBinary) {
        this.saveBinary = saveBinary;
    }

    public JButton getSaveArray() {
        return saveArray;
    }

    public void setSaveArray(JButton saveArray) {
        this.saveArray = saveArray;
    }

    public JButton getSaveSql() {
        return saveSql;
    }

    public void setSaveSql(JButton saveSql) {
        this.saveSql = saveSql;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }
}

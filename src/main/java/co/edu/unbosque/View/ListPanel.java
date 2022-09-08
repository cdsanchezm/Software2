package co.edu.unbosque.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ListPanel extends JPanel {

    private JLabel background;
    private JList users;
    private DefaultListModel<Object[]> usersList;
    private JScrollPane bar;
    private JButton listBinary, listArray, listSQL, clear,back;
    private JButton listBinary1, listCasandra1, listSQL1, clear1;

    public ListPanel(){
        setLayout(null);

        initializeComponents();

        setVisible(false);
    }

    public void  initializeComponents() {

        back = new JButton(new ImageIcon(getClass().getResource("/back.png")));
        back.setBounds(30,25,45,45);
        back.setActionCommand("BACK-LIST");
        back.setVisible(true);
        add(back);

        ArrayList<JButton> botones = new ArrayList<>();

        listBinary = new JButton("List Binary");
        listBinary.setBounds(510, 150, 130, 50);
        listBinary.setActionCommand("LIST-BINARY");
        listBinary.setVisible(true);
        add(listBinary);

        listArray = new JButton("List Array");
        listArray.setBounds(510, 220, 130, 50);
        listArray.setActionCommand("LIST-ARRAY");
        listArray.setVisible(true);
        add(listArray);

        listSQL = new JButton("List SQL");
        listSQL.setBounds(510,290,130,50);
        listSQL.setActionCommand("LIST-SQL");
        listSQL.setVisible(true);
        add(listSQL);

        clear = new JButton("CLEAR");
        clear.setBounds(510,360,130,50);
        clear.setActionCommand("LIST-CLEAR");
        clear.setVisible(true);
        add(clear);

        listBinary1 = new JButton("List Binary");
        listBinary1.setBounds(10, 30, 80, 30);
        listBinary1.setActionCommand("LIST-BINARY");
        listBinary1.setVisible(true);
        botones.add(listBinary1);

        listCasandra1 = new JButton("List Casandra");
        listCasandra1.setBounds(100, 30, 80, 30);
        listCasandra1.setActionCommand("LIST-CASANDRA");
        listCasandra1.setVisible(true);
        botones.add(listCasandra1);

        listSQL1 = new JButton("List SQL");
        listSQL1.setBounds(190, 30, 80, 30);
        listSQL1.setActionCommand("LIST-SQL");
        listSQL1.setVisible(true);
        botones.add(listSQL1);

        clear1 = new JButton("CLEAR");
        clear1.setBounds(280, 30, 80, 30);
        clear1.setActionCommand("LIST-CLEAR");
        clear1.setVisible(true);
        botones.add(clear1);

        users = new JList();
        users.setCellRenderer(new ButtonListRenderer());
        users.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        users.setSelectedIndex(0);
        users.setVisibleRowCount(5);
        users.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent event)
            {
                clickButtonAt(event.getPoint());
            }
        });
        bar = new JScrollPane(users);
        bar.setBounds(170,110,300,340);
        bar.setVisible(true);
        add(bar);



        background = new JLabel();
        background.setBounds(-1,-37,995,570);
        background.setIcon(new ImageIcon(getClass().getResource("/backgroundList.png")));
        add(background);
    }
    private void clickButtonAt(Point point)
    {
        int index = users.locationToIndex(point);
        ButtonItem item = (ButtonItem) users.getModel().getElementAt(index);
        item.getButton().doClick();
    }

    public JList getUsers() {
        return users;
    }

    public void setUsers(JList users) {
        this.users = users;
    }

    public DefaultListModel<Object[]> getUsersList() {
        return usersList;
    }

    public void setUsersList(DefaultListModel<Object[]> usersList) {
        this.usersList = usersList;
    }

    public JScrollPane getBar() {
        return bar;
    }

    public void setBar(JScrollPane bar) {
        this.bar = bar;
    }

    public JButton getListBinary() {
        return listBinary;
    }

    public void setListBinary(JButton listBinary) {
        this.listBinary = listBinary;
    }

    public JButton getListArray() {
        return listArray;
    }

    public void setListArray(JButton listArray) {
        this.listArray = listArray;
    }

    public JButton getListSQL() {
        return listSQL;
    }

    public void setListSQL(JButton listSQL) {
        this.listSQL = listSQL;
    }

    public JButton getClear() {
        return clear;
    }

    public void setClear(JButton clear) {
        this.clear = clear;
    }

    public JButton getListBinary1() {
        return listBinary1;
    }

    public void setListBinary1(JButton listBinary1) {
        this.listBinary1 = listBinary1;
    }

    public JButton getListCasandra1() {
        return listCasandra1;
    }

    public void setListCasandra1(JButton listCasandra1) {
        this.listCasandra1 = listCasandra1;
    }

    public JButton getListSQL1() {
        return listSQL1;
    }

    public void setListSQL1(JButton listSQL1) {
        this.listSQL1 = listSQL1;
    }

    public JButton getClear1() {
        return clear1;
    }

    public void setClear1(JButton clear1) {
        this.clear1 = clear1;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }
}

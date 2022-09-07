package co.edu.unbosque.View;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {

    private JLabel background;
    private JButton create, list;

    public HomePanel(){
        setLayout(null);

        initializeComponents();

        setVisible(true);
    }

    public void initializeComponents(){
        setBackground(Color.green);

        create = new JButton("Create User");
        create.setBounds(144,171,190,70);
        create.setActionCommand("CREATE-USER");
        create.setVisible(true);
        add(create);

        list = new JButton("List Users");
        list.setBounds(144,305,190,70);
        list.setActionCommand("LIST-USER");
        list.setVisible(true);
        add(list);

        background = new JLabel();
        background.setBounds(-1,-37,995,570);
        background.setIcon(new ImageIcon(getClass().getResource("/backgroundHome.png")));
        add(background);
    }

    public JButton getCreate() {
        return create;
    }

    public void setCreate(JButton create) {
        this.create = create;
    }

    public JButton getList() {
        return list;
    }

    public void setList(JButton list) {
        this.list = list;
    }
}

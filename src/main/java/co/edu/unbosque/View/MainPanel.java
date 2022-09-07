package co.edu.unbosque.View;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {

    private HomePanel homePanel;
    private CreatePanel createPanel;
    private ListPanel listPanel;
    public MainPanel(){
        setTitle("Dao Project Software 2");
        setSize(882,534);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout(0,0));

        InitializeComponents();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void InitializeComponents(){
        homePanel = new HomePanel();
        createPanel = new CreatePanel();
        listPanel = new ListPanel();
        getContentPane().add(listPanel,BorderLayout.CENTER);
    }

    public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }


}

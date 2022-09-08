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
        getContentPane().add(homePanel,BorderLayout.CENTER);
    }

    public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    public HomePanel getHomePanel() {
        return homePanel;
    }

    public void setHomePanel(HomePanel homePanel) {
        this.homePanel = homePanel;
    }

    public CreatePanel getCreatePanel() {
        return createPanel;
    }

    public void setCreatePanel(CreatePanel createPanel) {
        this.createPanel = createPanel;
    }

    public ListPanel getListPanel() {
        return listPanel;
    }

    public void setListPanel(ListPanel listPanel) {
        this.listPanel = listPanel;
    }
}

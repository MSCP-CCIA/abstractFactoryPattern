package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewMain extends JFrame{
    private JPanel viewMain;
    private JTextField revision_id;
    private JTextField revision_date;
    private JTextField estado_revision;
    private JButton revisiónBasicaButton;
    private JButton revisiónEspecializadaButton;
    private JButton buscarButton;

    public viewMain() {
        revisiónBasicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        revisiónEspecializadaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        setContentPane(viewMain);
        setTitle("View");
        setSize(800, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}

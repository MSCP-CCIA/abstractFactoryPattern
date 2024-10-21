package views;

import Controller.ObjectController;
import Model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewExamenes extends JFrame{
    private JTextField examen_id;
    private JTextField nombre_examen;
    private JTextField descripcion_examen;
    private JTextField fecha_examen;
    private JTextField resultado_examen;
    private JTextField afiliado_id;
    private JButton crearButton;
    private JPanel viewExamen;

    public viewExamenes(int revision_id, String revision_date, String estado_revision, ObjectController objectController, String tipo_autorización) {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tipo_autorización.equals("Basica")) {
                    objectController.listarRevisiones(new RevisionesBasicas(revision_id, revision_date, estado_revision,
                            new RevisionesBasicasExamen(Integer.parseInt(examen_id.getText()), nombre_examen.getText(),
                                    descripcion_examen.getText(), fecha_examen.getText(), resultado_examen.getText(),
                                    Integer.parseInt(afiliado_id.getText()))));
                    System.out.println("Exámen con revisión Básica creado");
                } else if (tipo_autorización.equals("Especializada")) {
                    objectController.listarRevisiones(new RevisionesBasicas(revision_id, revision_date, estado_revision,
                            new RevisionesEspecializadasExamen(Integer.parseInt(examen_id.getText()), nombre_examen.getText(),
                                    descripcion_examen.getText(), fecha_examen.getText(), resultado_examen.getText(),
                                    Integer.parseInt(afiliado_id.getText()))));
                    System.out.println("Exámen con revisión Especializada creado");
                } else {
                    System.out.println("Tipo de autorización inexistente");
                }
            }
        });

        setContentPane(viewExamen);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}

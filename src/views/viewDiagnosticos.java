package views;

import Controller.ObjectController;
import Model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewDiagnosticos extends JFrame{
    private JTextField diagnostico_id;
    private JTextField descripcion_diagnostico;
    private JTextField cita_id;
    private JTextField examen_id;
    private JTextField medico_id;
    private JTextField fecha_diagnostico;
    private JTextField afiliado_id;
    private JButton crearButton;
    private JPanel viewDiagnosticos;

    public viewDiagnosticos(int revision_id, String revision_date, String estado_revision, ObjectController objectController, String tipo_autorización) {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tipo_autorización.equals("Basica")) {
                    objectController.listarRevisiones(new RevisionesBasicas(revision_id, revision_date, estado_revision,
                            new RevisionesBasicasDiagnostico(Integer.parseInt(diagnostico_id.getText()),
                                    descripcion_diagnostico.getText(), Integer.parseInt(cita_id.getText()),
                                    Integer.parseInt(examen_id.getText()), Integer.parseInt(medico_id.getText()),
                                    fecha_diagnostico.getText(), Integer.parseInt(afiliado_id.getText()))));
                    System.out.println("Diagnóstico con revisión Básica creado");
                } else if (tipo_autorización.equals("Especializada")) {
                    objectController.listarRevisiones(new RevisionesBasicas(revision_id, revision_date, estado_revision,
                            new RevisionesEspecializadasDiagnostico(Integer.parseInt(diagnostico_id.getText()),
                                    descripcion_diagnostico.getText(), Integer.parseInt(cita_id.getText()),
                                    Integer.parseInt(examen_id.getText()), Integer.parseInt(medico_id.getText()),
                                    fecha_diagnostico.getText(), Integer.parseInt(afiliado_id.getText()))));
                    System.out.println("Diagnóstico con revisión Especializada creado");
                } else {
                    System.out.println("Tipo de autorización inexistente");
                }
            }
        });

        setContentPane(viewDiagnosticos);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}

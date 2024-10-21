package views;

import Controller.ObjectController;
import Model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewMedicamentos extends JFrame{
    private JTextField medicamento_id;
    private JTextField nombre_medicamento;
    private JTextField descripcion_medicamento;
    private JTextField diagnostico_id;
    private JTextField dosis;
    private JTextField frecuencia;
    private JTextField afiliado_id;
    private JButton crearButton;
    private JPanel viewMedicamentos;


    public viewMedicamentos(int revision_id, String revision_date, String estado_revision, ObjectController objectController, String tipo_autorización) {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tipo_autorización.equals("Basica")) {
                    objectController.listarRevisiones(new RevisionesBasicas(revision_id, revision_date, estado_revision,
                            new RevisionesBasicasMedicamento(Integer.parseInt(medicamento_id.getText()), nombre_medicamento.getText(),
                                    descripcion_medicamento.getText(), Integer.parseInt(diagnostico_id.getText()),
                                    dosis.getText(), frecuencia.getText(), Integer.parseInt(afiliado_id.getText()))));
                    System.out.println("Medicamento con revisión Básica creado");
                } else if (tipo_autorización.equals("Especializada")) {
                    objectController.listarRevisiones(new RevisionesEspecializadas(revision_id, revision_date, estado_revision,
                            new RevisionesEspecializadasMedicamento(Integer.parseInt(medicamento_id.getText()), nombre_medicamento.getText(),
                                    descripcion_medicamento.getText(), Integer.parseInt(diagnostico_id.getText()),
                                    dosis.getText(), frecuencia.getText(), Integer.parseInt(afiliado_id.getText()))));
                    System.out.println("Medicamento con revisión Especializada creado");
                } else {
                    System.out.println("Tipo de autorización inexistente");
                }
            }
        });

        setContentPane(viewMedicamentos);
        setTitle("View");
        setSize(800, 800);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}

package views;

import Model.Diagnosticos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class viewAutorización {
    private JPanel viewAutorización;
    private JButton diagnósticoButton;
    private JButton exámenButton;
    private JButton medicamentoButton;

    public viewAutorización(int revision_id, String revision_date, String estado_revision, String tipo_autorización) {

        diagnósticoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewDiagnosticos(revision_id, revision_date, estado_revision, tipo_autorización);
            }
        });

        exámenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewExamenes(revision_id, revision_date, estado_revision, tipo_autorización);
            }
        });

        medicamentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewMedicamentos(revision_id, revision_date, estado_revision, tipo_autorización);
            }
        });
    }
}

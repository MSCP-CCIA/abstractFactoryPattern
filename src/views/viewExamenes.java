package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewExamenes {
    private JTextField examen_id;
    private JTextField nombre_examen;
    private JTextField descripcion_examen;
    private JTextField fecha_examen;
    private JTextField resultado_examen;
    private JTextField afiliado_id;
    private JButton crearButton;
    private JPanel viewExamen;

    public viewExamenes(int revision_id, String revision_date, String estado_revision, String tipo_autorización) {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

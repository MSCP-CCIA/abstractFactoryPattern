package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewMedicamentos {
    private JTextField medicamento_id;
    private JTextField nombre_medicamento;
    private JTextField descripcion_medicamento;
    private JTextField diagnostico_id;
    private JTextField dosis;
    private JTextField frecuencia;
    private JTextField afiliado_id;
    private JButton crearButton;


    public viewMedicamentos(int revision_id, String revision_date, String estado_revision, String tipo_autorización) {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

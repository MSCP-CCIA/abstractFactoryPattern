package Model;

public interface Revisiones<T> {

    Object crearAutorizacion(int diagnostico_id, String descripcion_diagnostico, int cita_id, int examen_id,
                             int medico_id, String fecha_diagnostico, int afiliado_id);

    Object crearAutorizacion(int examen_id, String nombre_examen, String descripcion_examen, String fecha_examen,
                             String resultado_examen, int afiliado_id);

    Object crearAutorizacion(int medicamento_id, String nombre_medicamento, String descripcion_medicamento,
                             int diagnostico_id, String dosis, String frecuencia, int afiliado_id);
}

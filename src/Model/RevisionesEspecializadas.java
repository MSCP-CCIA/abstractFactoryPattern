package Model;

public class RevisionesEspecializadas implements Revisiones{
    public int revision_id;
    public String revision_date;
    public String estado_revision;
    public Object servicio_asignado;

    public RevisionesEspecializadas() {
    }

    @Override
    public Object crearAutorizacion(int diagnostico_id, String descripcion_diagnostico, int cita_id, int examen_id,
                                    int medico_id, String fecha_diagnostico, int afiliado_id) {
        return new RevisionesEspecializadasDiagnostico(diagnostico_id,descripcion_diagnostico,cita_id,examen_id,
                medico_id,fecha_diagnostico,afiliado_id);
    }

    @Override
    public Object crearAutorizacion(int examen_id, String nombre_examen, String descripcion_examen,
                                    String fecha_examen, String resultado_examen, int afiliado_id) {
        return new RevisionesEspeializadasExamen(examen_id,nombre_examen,descripcion_examen,fecha_examen,
                resultado_examen,afiliado_id);
    }

    @Override
    public Object crearAutorizacion(int medicamento_id, String nombre_medicamento, String descripcion_medicamento,
                                    int diagnostico_id, String dosis, String frecuencia, int afiliado_id) {
        return new RevisionesEspecializadasMedicamento(medicamento_id,nombre_medicamento,descripcion_medicamento,
                diagnostico_id,dosis,frecuencia,afiliado_id);
    }

    public int getRevision_id() {
        return revision_id;
    }

    public void setRevision_id(int revision_id) {
        this.revision_id = revision_id;
    }

    public String getRevision_date() {
        return revision_date;
    }

    public void setRevision_date(String revision_date) {
        this.revision_date = revision_date;
    }

    public String getEstado_revision() {
        return estado_revision;
    }

    public void setEstado_revision(String estado_revision) {
        this.estado_revision = estado_revision;
    }

    public Object getServicio_asignado() {
        return servicio_asignado;
    }

    public void setServicio_asignado(Object servicio_asignado) {
        this.servicio_asignado = servicio_asignado;
    }

    @Override
    public String toString() {
        return "RevisionesEspecializadas{" +
                "revision_id=" + revision_id +
                ", revision_date='" + revision_date + '\'' +
                ", estado_revision='" + estado_revision + '\'' +
                ", servicio_asignado=" + servicio_asignado +
                '}';
    }
}

package Model;

public class RevisionesBasicasDiagnostico implements Diagnosticos{
    public int diagnostico_id;
    public String descripcion_diagnostico;
    public int cita_id;
    public int examen_id;
    public int medico_id;
    public String fecha_diagnostico;
    public int afiliado_id;

    public RevisionesBasicasDiagnostico(int diagnostico_id, String descripcion_diagnostico, int cita_id, int examen_id,
                                        int medico_id, String fecha_diagnostico, int afiliado_id) {
        this.diagnostico_id = diagnostico_id;
        this.descripcion_diagnostico = descripcion_diagnostico;
        this.cita_id = cita_id;
        this.examen_id = examen_id;
        this.medico_id = medico_id;
        this.fecha_diagnostico = fecha_diagnostico;
        this.afiliado_id = afiliado_id;
    }

    @Override
    public void autorizacionDiagnostico() {
        System.out.println("AUTORIZACIÓN CREADA");
    }
}

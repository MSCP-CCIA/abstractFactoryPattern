package Model;

public class RevisionesBasicasMedicamento implements Medicamentos{
    public int medicamento_id;
    public String nombre_medicamento;
    public String descripcion_medicamento;
    public int diagnostico_id ;
    public String dosis;
    public String frecuencia ;
    public int afiliado_id;

    public RevisionesBasicasMedicamento(int medicamento_id, String nombre_medicamento, String descripcion_medicamento,
                                        int diagnostico_id, String dosis, String frecuencia, int afiliado_id) {
        this.medicamento_id = medicamento_id;
        this.nombre_medicamento = nombre_medicamento;
        this.descripcion_medicamento = descripcion_medicamento;
        this.diagnostico_id = diagnostico_id;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.afiliado_id = afiliado_id;
    }

    @Override
    public void autorizacionMedicamento() {
        System.out.println("AUTORIZACION CREADA");
    }
}

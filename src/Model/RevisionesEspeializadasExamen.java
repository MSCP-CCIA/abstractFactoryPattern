package Model;

public class RevisionesEspeializadasExamen implements Examenes{
    public int examen_id;
    public String nombre_examen;
    public String descripcion_examen;
    public String fecha_examen;
    public String resultado_examen;
    public int afiliado_id;

    public RevisionesEspeializadasExamen(int examen_id, String nombre_examen, String descripcion_examen,
                                         String fecha_examen, String resultado_examen, int afiliado_id) {
        this.examen_id = examen_id;
        this.nombre_examen = nombre_examen;
        this.descripcion_examen = descripcion_examen;
        this.fecha_examen = fecha_examen;
        this.resultado_examen = resultado_examen;
        this.afiliado_id = afiliado_id;
    }

    @Override
    public void autorizacionExamen() {
        System.out.println("AUTORIZACION CREADA");
    }
}

package Controller;

import Model.Revisiones;
import Model.RevisionesBasicas;
import Model.RevisionesEspecializadas;

import java.util.ArrayList;
import java.util.List;

public class ObjectController {
    public List<Revisiones> listaRevisiones = new ArrayList<>();

    public ObjectController() {
    }
    public void listarRevisiones(Revisiones revision){
        listaRevisiones.add(revision);
    }
    public Revisiones busquedaRevisiones(int revision_id){
        for(Revisiones revision : listaRevisiones){
            if (revision instanceof RevisionesBasicas){
                if(((RevisionesBasicas)revision).getRevision_id()==revision_id){
                    return revision;
                }
            } else if (revision instanceof RevisionesEspecializadas) {
                if(((RevisionesEspecializadas)revision).getRevision_id()==revision_id){
                    return revision;
                }

            }
        }
        System.out.println("Autorización no existe");
        return null;
    }
}

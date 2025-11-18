package service;

import model.Adotante;

import java.util.ArrayList;
public class AdotanteService {
    private ArrayList<Adotante> adts = new ArrayList<>();

    public void inserirAdotante (Adotante a){
        adts.add(a);
    }
}

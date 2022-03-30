/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.bean.Chave;
import Model.bean.Monitor;
import Model.bean.Professor;
import Model.bean.Terciario;
import java.util.ArrayList;
import view.TelaInicial;

/**
 *
 * @author anton
 */
public class Controller {

    ArrayList<Chave> listaChave = new ArrayList<>();
    ArrayList<Monitor> listaMonitor = new ArrayList<>();
    ArrayList<Professor> listaProfessor = new ArrayList<>();
    ArrayList<Terciario> listaTerciario = new ArrayList<>();

    public static void main(String[] args) {
        TelaInicial telaInicial = new TelaInicial(null);
        telaInicial.setVisible(true);
    }

    public boolean validarPreenchido(String nome) {
        if (nome.trim().equals("")) {
            return false;
        }
        return true;
    }

}

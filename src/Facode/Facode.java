package Facode;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Informacion.Dolares;
import Informacion.Euros;
import Informacion.MonedasConver;
import TemplateWebScrap.Algorithm;
import TemplateWebScrap.WebEbay;

public class Facode {
    private MonedasConver webScrap;
    private ArrayList<MonedasConver> paginas;

    public void menu() {
        int op = 0, op2 = 0;
        String[] opciones = { "Tecnologica", "General" };
        String[] opciones2 = { "Euros", "Dolares", "PesosCol" };
        op2 = JOptionPane.showOptionDialog(null, "En que moneda desea el resultado", "Bienvenido al menu principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[0]);
        op = JOptionPane.showOptionDialog(null, "Seleccione una opcion de busqueda", "Bienvenido al menu principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        String palabraSep[] = JOptionPane.showInputDialog(null, "Ingerese la busqueda: ").split(" ");
        switch (op2) {
            case 0:
                paginas=new ArrayList<>();
                paginas.add(new Euros(new  WebEbay(), palabraSep));
                break;
            case 1:

                break;
            case 2:

                break;
        }
    }
}

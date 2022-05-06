package Facode;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Informacion.Dolares;
import Informacion.Euros;
import Informacion.MonedasConver;
import Informacion.PesosCol;
import TemplateWebScrap.Algorithm;
import TemplateWebScrap.WebFlipkart;
import TemplateWebScrap.WebOlx;
import TemplateWebScrap.WebEbay;

public class Facode {
    private ArrayList<MonedasConver> paginas;

    public void menu() {
        paginas=new ArrayList<>();
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
                paginas.add(new PesosCol(new  WebOlx(), palabraSep));
                if(op==1){
                    //se pone la que sea solo de tecnologia, la del adapter
                }
                System.out.println("Precio Euros: "+paginas.get(0).Euros());
                break;
            case 1:
                paginas.add(new PesosCol(new WebEbay(), palabraSep));
                System.out.println(paginas.get(0).Dolares());
                break;
            case 2:
                paginas.add(new PesosCol(new WebEbay(), palabraSep));
                System.out.println(paginas.get(0).PesosCol());
                break;
        }
    }
}

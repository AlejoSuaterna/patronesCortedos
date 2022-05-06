package Facode;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Informacion.MonedasConver;
import Informacion.PesosCol;
import TemplateWebScrap.Algorithm;
import TemplateWebScrap.WebAliExpress;
import TemplateWebScrap.WebAlkosto;
import TemplateWebScrap.WebFlipkart;
import TemplateWebScrap.WebOlx;
import TemplateWebScrap.WebEbay;

public class Facode {

    private ArrayList<MonedasConver> paginas;

    public void menu() {
        paginas = new ArrayList<>();
        double matriz[][] = new double[5][2];
        int op = 0, op2 = 0;
        String[] opciones = {"Tecnologica", "General"};
        String[] opciones2 = {"Euros", "Dolares", "PesosCol"};
        op2 = JOptionPane.showOptionDialog(null, "En que moneda desea el resultado", "Bienvenido al menu principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[0]);
//        op = JOptionPane.showOptionDialog(null, "Seleccione una opcion de busqueda", "Bienvenido al menu principal",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        String palabraSep[] = JOptionPane.showInputDialog(null, "Ingerese la busqueda: ").split(" ");
        switch (op2) {
            case 0:
                paginas.add(new PesosCol(new WebAliExpress(), palabraSep));
                paginas.add(new PesosCol(new WebAlkosto(), palabraSep));
                paginas.add(new PesosCol(new WebEbay(), palabraSep));
                paginas.add(new PesosCol(new WebFlipkart(), palabraSep));
                paginas.add(new PesosCol(new WebOlx(), palabraSep));
                matriz[0][0] = paginas.get(0).Euros();
                matriz[0][1] = 0;
                System.out.println("Precio Euros: " + matriz[0][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[1][0] = paginas.get(1).Euros();
                matriz[1][1] = 1;
                System.out.println("Precio Euros: " + matriz[1][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[2][0] = paginas.get(2).Euros();
                matriz[2][1] = 2;
                System.out.println("Precio Euros: " + matriz[2][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[3][0] = paginas.get(3).Euros();
                matriz[3][1] = 3;
                System.out.println("Precio Euros: " + matriz[3][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[4][0] = paginas.get(4).Euros();
                matriz[4][1] = 4;
                System.out.println("Precio Euros: " + matriz[4][0]);
                System.out.println("\n------------------------------------------\n");
                System.out.println("\n------------------------------------------\n\n");
                System.out.println("EL ARTICULO CON EL MEJOR PRECIO ES :");
                System.out.println("Precio en euros : " + paginas.get(compararPrecios(matriz, op2)).Euros());

                break;
            case 1:
                paginas.add(new PesosCol(new WebAliExpress(), palabraSep));
                paginas.add(new PesosCol(new WebAlkosto(), palabraSep));
                paginas.add(new PesosCol(new WebEbay(), palabraSep));
                paginas.add(new PesosCol(new WebFlipkart(), palabraSep));
                paginas.add(new PesosCol(new WebOlx(), palabraSep));
                matriz[0][0] = paginas.get(0).Dolares();
                matriz[0][1] = 0;
                System.out.println("Precio Dolares: " + matriz[0][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[1][0] = paginas.get(1).Dolares();
                matriz[1][1] = 1;
                System.out.println("Precio Dolares: " + matriz[1][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[2][0] = paginas.get(2).Dolares();
                matriz[2][1] = 2;
                System.out.println("Precio Dolares: " + matriz[2][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[3][0] = paginas.get(3).Dolares();
                matriz[3][1] = 3;
                System.out.println("Precio Dolares: " + matriz[3][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[4][0] = paginas.get(4).Dolares();
                matriz[4][1] = 4;
                System.out.println("Precio Dolares: " + matriz[4][0]);
                System.out.println("\n------------------------------------------\n");
                System.out.println("\n------------------------------------------\n\n");
                System.out.println("EL ARTICULO CON EL MEJOR PRECIO ES :");
                System.out.println("Precio en dolares : " + paginas.get(compararPrecios(matriz, op2)).Dolares());
                break;
            case 2:
                paginas.add(new PesosCol(new WebAliExpress(), palabraSep));
                paginas.add(new PesosCol(new WebAlkosto(), palabraSep));
                paginas.add(new PesosCol(new WebEbay(), palabraSep));
                paginas.add(new PesosCol(new WebFlipkart(), palabraSep));
                paginas.add(new PesosCol(new WebOlx(), palabraSep));

                matriz[0][0] = paginas.get(0).PesosCol();
                matriz[0][1] = 0;
                System.out.println("Precio PesosCol: " + matriz[0][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[1][0] = paginas.get(1).PesosCol();
                matriz[1][1] = 1;
                System.out.println("Precio PesosCol: " + matriz[1][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[2][0] = paginas.get(2).PesosCol();
                matriz[2][1] = 2;
                System.out.println("Precio PesosCol: " + matriz[2][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[3][0] = paginas.get(3).PesosCol();
                matriz[3][1] = 3;
                System.out.println("Precio PesosCol: " + matriz[3][0]);
                System.out.println("\n------------------------------------------\n");
                matriz[4][0] = paginas.get(4).PesosCol();
                matriz[4][1] = 4;
                System.out.println("Precio PesosCol: " + matriz[4][0]);
                System.out.println("\n------------------------------------------\n");
                System.out.println("\n------------------------------------------\n\n");
                System.out.println("EL ARTICULO CON EL MEJOR PRECIO ES :");
                System.out.println("Precio en PesosCol : " + paginas.get(compararPrecios(matriz, op2)).PesosCol());
                break;
        }
    }

    public int compararPrecios(double matriz[][], int valor) {
        int index = 0;
        double precio = matriz[0][0];
        for (int i = 0; i < 5; i++) {
            if (matriz[i][0] < precio) {
                index = i;
            }
        }
        return index;

    }
}

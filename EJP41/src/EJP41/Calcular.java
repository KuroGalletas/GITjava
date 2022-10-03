package EJP41;

import javax.swing.JOptionPane;

public class Calcular {
    
    static double mayor = 0;
    
    public static void borrarLista(){
        mayor = 0;
    }
    public static void evaluar(double numero){
        if(numero > mayor){
            mayor = numero;
        }
    }
    public static String calcular(){
        JOptionPane.showMessageDialog(null, ("El número mas grade es "+mayor));
        return String.valueOf(mayor);
    }
}

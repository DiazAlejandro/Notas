import javax.swing.*;
import java.io.*;
public class Main{
    public static void main() throws FileNotFoundException, IOException{
        
        String title = JOptionPane.showInputDialog("Título:");
        String cont  = JOptionPane.showInputDialog("Contenido:");
        Write.escribir("notas.txt",title,cont);
        Write.imprimir("notas.txt");
        String word  = JOptionPane.showInputDialog("Palabra a buscar:");
        StdOut.println("\nCoincidencias:");
        Write.buscar("notas.txt",word);
    }
    }


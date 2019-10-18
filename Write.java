import java.io.*;
public class Write{
    public static void escribir(String arch, String title, String cont){
        File file = new File(arch);
        try{
            FileWriter fileW = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter buffer = new BufferedWriter(fileW);
            PrintWriter write = new PrintWriter(buffer);
            write.write("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
            write.append("Titulo: \n\t"+title+"\n");
            write.append("Contenido: \n\t"+cont+"\n");
            
            write.close();
            buffer.close();
        }catch(IOException e){
        
        }
        
    } 
    
    public static void imprimir(String arch) throws FileNotFoundException, IOException{
        String cad;
        FileReader fileR = new FileReader(arch);
        BufferedReader buffer = new BufferedReader(fileR);
        while ((cad = buffer.readLine())!=null){
            StdOut.println(cad);
        }
        buffer.close();
    }
    
    public static void buscar(String arch, String palabra)throws FileNotFoundException, IOException{
        String cad;
        FileReader fileR = new FileReader(arch);
        BufferedReader buffer = new BufferedReader(fileR);
        try{
        while ((cad = buffer.readLine())!=null){
            if (cad.toUpperCase().contains(palabra.toUpperCase()))
            StdOut.println(cad);
        }
        }catch(Exception e){
            
        }
        buffer.close();
    }
}
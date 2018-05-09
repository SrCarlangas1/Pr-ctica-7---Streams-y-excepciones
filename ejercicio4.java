/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_ficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author infor12
 */
public class ejercicio4 {
    public static void main(String[] args) {

// Fichero del que queremos leer
		File fichero = new File("lista.txt");
		Scanner s = null;
		try {
                    s = new Scanner(fichero);
                    FileWriter fichero2;
                    
                    String sl = System.lineSeparator();
                    fichero2 = new FileWriter("ejercicio5.txt");
                    personas alumno = new personas();
                    while (s.hasNextLine()) {
                        String linea = s.nextLine();
                        String[] contenido = linea.split(" ");// Aqui le estamos diciendo que nos coja el stream hasta el espacio.
                        String nombre = contenido[0];
                        alumno.setNombre(nombre);
                        
                        String apellido = contenido[1];
                        alumno.setApellidos1(apellido);
                        
                        String apellido2 = contenido[2];
                        alumno.setApellido2(apellido2);
                        
                        String nota1 = contenido[3];
                        alumno.setNotalenguaje(nota1);
                        
                        String nota2 = contenido[4];
                        alumno.setNotapro(nota2);
                        
                        String nota3 = contenido[5];
                        alumno.setNotaentornos(nota3);
                        
                        String nota4 = contenido[6];
                        alumno.setNotasbases(nota4);
                        
                        String nota5 = contenido[7];
                        alumno.setNotassistemas(nota5);
                        
                        String nota6 = contenido[8];
                        alumno.setNotasfol(nota6);
                         
                        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ejercicio5.txt"));
                        out.writeObject(alumno);                                                                                          
                    }
                    fichero2.close();
		} catch (IOException ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
                
	}
}

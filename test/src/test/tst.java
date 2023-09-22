package test;

import java.util.Scanner;
import java.io.*;

public class tst {

	public static void main(String[] args) throws IOException {
		
			try {
				FileWriter fw=new FileWriter("prodotti.txt"); //crea un file di nome prodotti.txt
				fw.write("Pane\n");  //scrive una riga nel file
				fw.write("Pasta\n");
				fw.write("grissini");
				fw.close();  //chiude il file
			    
				System.out.println("File corretamente creato");
				
						
			} catch (IOException e) {
				System.out.println("Si è verificato un errore in fase di scrittura");
				e.printStackTrace();
			}
		File f=new File("prodotti.txt");
		
		try {
			Scanner sc=new Scanner(f);  //questo scnnner non legge dalla tastiera bensi dal file f
			String riga;
			while (sc.hasNextLine()){  //ripeti finche ci sono righe nel file
				riga=sc.nextLine();    //leggi una riga dal file
				
				System.out.println("Trovato prodotto:"+riga);
			}
			sc.close(); //chiudi il file
			System.out.println("\n\n Lettura terminata");
		} catch (FileNotFoundException e) {
			System.out.println("Si è verificato un errore in fase di lettura");
		e.printStackTrace();
		
		}
		
				
				
		
		
		
		

	}

}

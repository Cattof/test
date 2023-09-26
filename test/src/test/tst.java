package test;

import java.util.Scanner;
import java.io.*;

public class tst {

	public static void main(String[] args) throws IOException {
		
			try {
				FileWriter fw=new FileWriter("prodotti.txt"); //crea un file di nome prodotti.txt
				fw.write("Pane;3.50;20\n");  //scrive una riga nel file
				fw.write("Pasta;1.60;45\n");
				fw.write("Biscotti;4.70;80\n");
				fw.write("Salame;35;37\n");;
				fw.close();  //chiude il file
			    
				System.out.println("File corretamente creato");
				
						
			} catch (IOException e) {
				System.out.println("Si è verificato un errore in fase di scrittura");
				e.printStackTrace();
			}
		File f=new File("prodotti.txt");
		String[] dati;
		
		try {
			Scanner sc=new Scanner(f);  //questo scnnner non legge dalla tastiera bensi dal file f
			String riga;
			while (sc.hasNextLine()){  //ripeti finche ci sono righe nel file
				riga=sc.nextLine();    //leggi una riga dal file
				dati=riga.split(";");  //divide la stringa in piu pezzi usando la stringa come separatore
				System.out.println("Trovato prodotto:");
				System.out.println("Nome:"+dati[0]);
				System.out.println("Prezzo:"+dati[1]);
				System.out.println("quantità:"+dati[2]);
				System.out.println("\n");
			}
			sc.close(); //chiudi il file
			System.out.println("\n\n Lettura terminata");
		} catch (FileNotFoundException e) {
			System.out.println("Si è verificato un errore in fase di lettura");
		e.printStackTrace();
		
		}
		
				
				
		
		
		
		

	}

}

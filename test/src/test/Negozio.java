package test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Negozio {
 ArrayList<Prodotto> elencoProdotti=new ArrayList<Prodotto>();
 
 public void aggiungiProdotto(Prodotto p) {
	 elencoProdotti.add(p);}
 
 public void salva(String nomeFile) {

		try {
			FileWriter fw=new FileWriter("prodotti.txt");//crea un file di nome prodotti.txt
			for(Prodotto p:elencoProdotti)
			 fw.write( p.getDescrizione()+";"+
			p.getPrezzo()+";"+
			p.getQuantita()+"/n");
			fw.close();  //chiude il file
		    
			System.out.println("File corretamente creato");
			
					
		} catch (IOException e) {
			System.out.println("Si è verificato un errore in fase di scrittura");
			e.printStackTrace();
		}
	 
 }
 }


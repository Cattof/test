package test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Portfolio {
 private ArrayList<Cliente> elencoClienti=new ArrayList<Cliente>();
 
 public void aggiungiCliente(Cliente c) {
	 elencoClienti.add(c);
	 if (c.getNumero()>0 &&
			 c.getNome().length()>0 &&
			 c.getCognome().length()>0)
		 elencoClienti.add(c);
 }
 
 public void salva(String nomeFile) {
	 
		 try {
			FileWriter fw=new FileWriter(nomeFile);
			 for(Cliente c:elencoClienti)
				 fw.write(
						 c.getNumero()+";"+
			             c.getNome()+";"+
						 c.getCognome()+"\n");
			 fw.close();
			 System.out.println("File correttamente creato");
		} catch (IOException e) {
			System.out.println("Errore nella creazione del file");
			e.printStackTrace();
		}
	 
	 
 }

 
 public void carica(String nomeFile) {
	 File f=new File(nomeFile);
	 String[] dati;
	 
	
		try {
			Scanner sc=new Scanner(f);
			 String riga;
			 while(sc.hasNextLine()) {
				 riga=sc.nextLine();
				 dati=riga.split(";");
				 Cliente c=new Cliente();
				 
				 c.setNome(dati[0]);
				 c.setCognome(dati[1]);
				 c.setNumero(Integer.parseInt(dati[3]));
				 elencoClienti.add(c);}
			 sc.close();
			 System.out.println("\n\n lettura terminata");
		} catch (NumberFormatException e) {
			System.out.println("errore in fase di lettura");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	
	
	 
 }
 
 public Iterable<Cliente> elencoClienti(){
	 return this.elencoClienti;
 }
 
}

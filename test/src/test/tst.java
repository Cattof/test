package test;

import java.util.Scanner;





public class tst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String risp;
		Negozio n=new Negozio();
		Portfolio po=new Portfolio();
		
		
		do {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Gestione prodotti\n");
			System.out.println("1 - visualizza prodotti");
			System.out.println("2 - carica prodotti");
			System.out.println("3 - salva prodotti");
			System.out.println("4 - aggiungi prodotto");
			System.out.println("5 - visualizza clienti");
			System.out.println("6 - carica cliente");
			System.out.println("7 - salva cliente");
			System.out.println("8 - aggiungi cliente");
			System.out.println("\n9 - esci");
			System.out.print("Inserisci la tua scelta: ");
			risp=sc.nextLine();
			switch(risp) {
			case "1":
				System.out.println("Elenco prodotti:");
				for(Prodotto p:n.elencoProdotti())
				{
					System.out.println("Prodotto: "+p.getDescrizione());
					System.out.println(" Prezzo: "+p.getPrezzo());
					System.out.println(" Quantità: "+p.getQuantità()+"\n");
				}
				// n.elencoProdotti=null;   //non si può fare!!!
				
				break;
			case "2":
				n.carica("prodotti.csv");
				break;
			case "3":
				n.salva("prodotti.csv");
				break;
			case "4":
				Prodotto nuovoProd=new Prodotto();
				System.out.print("Inserisci la descrizione: ");
				nuovoProd.setDescrizione(sc.nextLine());
				System.out.print("Inserisci il prezzo: ");
				nuovoProd.setPrezzo(Double.parseDouble(sc.nextLine()));
				System.out.print("Inserisci la quantità: ");
				nuovoProd.setQuantità(Integer.parseInt(sc.nextLine()));
				n.aggiungiProdotto(nuovoProd);
				break;
			case "5":
				System.out.println("elenco clienti");
				
				For(Cliente po:c.elencoClienti()){
					
					System.out.println("Numero:"+c.getNumero());
					System.out.println("Nome:"+c.getNome());
					System.out.println("Cognome:"+c.getCognome());
				}
			case "6":
				po.carica("clienti.csv");
				break;
			case "7":
				po.salva("clienti.csv");
				break;
			case "8":
				Cliente nuovoClien=new Cliente();
				System.out.println("inserisci il numero: ");
				nuovoClien.setNumero(Integer.parseInt(sc.nextLine()));
				System.out.println("inserisci il nome ");
				nuovoClien.setNome(sc.nextLine());
				System.out.println("inserisci il cognome ");
				nuovoClien.setCognome(sc.nextLine());
				po.aggiungiCliente(nuovoClien);
			case "9":
				System.out.println("Arrivederci!");
				break;
			default:
				System.out.println("Scelta non valida!");
			}
			System.out.println("Premi Enter per continuare...");
			sc.nextLine();
		} while (!risp.equals("9"));
		sc.close();
	}

}

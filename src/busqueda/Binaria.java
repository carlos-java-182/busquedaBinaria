package busqueda;

import javax.swing.JOptionPane;

public class Binaria {

	public static void main(String[] args) {
		
		int arreglo [] = {1,2,3,4,5};
		int dato, inf, sup, mitad, i;
		boolean band = false;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digita un dato"));
		
		
		i=0;
		inf=0;
		sup=5;
		mitad=(inf+sup)/2;
		
		while(inf<=sup && i<5) {
			
			if(arreglo[mitad] == dato) {
				
				band = true;
				break;
			}
			
			if(arreglo[mitad]>dato) {
				sup = mitad;
				mitad = (inf + sup)/2;
			}
			
			if(arreglo[mitad]<dato) {
				inf = mitad;
				mitad = (inf + sup)/2;
			}
			
			i++;
		}
		
		if(band == true) {
			
			System.out.println("El número ha sido encontrado en la posición: "+mitad);
		}
		
		else {
			System.out.println("El número no se encuentra");
		}
		
		
		

	}

}

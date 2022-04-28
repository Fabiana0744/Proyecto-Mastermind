package logic;

import java.util.ArrayList;
import java.util.Random;

public class Randoms {
	
	public Randoms() {}
	/**
	 * 
	 * @param cantidad cantidad de numeros no repetidos a crear. Debe ser menor al limite del Random
	 * @return arreglo de numeros no repetidos.
	 */
	public ArrayList<Integer> generarAleatoriosNoRepetidos (int cantidad) {
		ArrayList<Integer> respuesta = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			respuesta.add(gen(respuesta));
		}			
		return respuesta;
	}
	
	/**
	 * Metodo recursivo que crea un numero aleatorio, pero primero verifica si existe en el arreglo del parametro.
	 * Si el numero ya existe, el metodo se llama a si mismo para hacer otro intento y asi sucesivamente hasta
	 * encontrar un numero aleatorio que no exista en el arreglo
	 * @param a Arreglo de numeros aleatorios que previamente guarados
	 * @return numero que no existe en el arreglo a dado.
	 */
	public int gen(ArrayList<Integer>a) {
		Random ra = new Random();	
		int numero = ra.nextInt(4);
		if (!a.contains(numero)) {
			return numero;
		}else {
			return gen(a);
		}
	}
	

	/**
	 * Este metodo solo imprime la respuesta
	 * @param num arreglo a imprimir
	 */
	public void imprimir (ArrayList<Integer>num) {
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}
}

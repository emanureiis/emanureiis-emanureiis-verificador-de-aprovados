package br.com.prova;
import java.util.Arrays;
import java.util.Collection;

public class Questao1 {
	public static void main(String[] args) {
		
//		int[] numeros = {7,5,3,2,0,1};
		
//		//Ordem
//		Arrays.sort(numeros);
//		for (int numero : numeros) {
//			System.out.println(numero);
//		}
		
		int[] a={7,5,3,2,0,1};
		for (int i=0; i<a.length; i++) {
		        for (int j=i+1; j<a.length; j++) {
		              if (a[i] > a[j]) {
		                    a[i]=a[j];
		                    a[j]=a[i];
		                    System.out.println(a[i]);
		               }
		        }
		  }
//		System.out.println(a);
	}
}


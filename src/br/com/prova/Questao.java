package br.com.prova;

public class Questao {
		
		public static void main(String[] args) {
	    
			//a) (1,0 ponto)
			// Comentário do Programador: Este trecho de programa ordena os elementos do vetor em ordem crescente */
		
			int aux1;
			
			int[] a={7,5,3,2,0,1};
			
			for (int i=0; i<a.length; i++) {
				
			        for (int j=i+1; j<a.length; j++) {
			        	
			              if (a[i] > a[j]) {
			            	  aux1=a[i];
			            	  a[i]=a[j];
			            	  a[j]=aux1;
			               }
			        }
			        
			        System.out.println(a[i]);
			  }
			System.out.println();
	//b) (1,0 ponto)
	// Comentário do Programador: Este trecho de programa ordena os elementos do vetor em ordem decrescente */

	    
			int aux2;
			

			
			for (int i=0; i<a.length; i++) {
				
			        for (int j=i+1; j<a.length; j++) {
			        	
			              if (a[i] < a[j]) {
			            	  aux2=a[i];
			            	  a[i]=a[j];
			            	  a[j]=aux2;
			               }
			        }
			        
			        System.out.println(a[i]);
			  }
			System.out.println();
	//c) (1,0) ponto
	// Comentário do Programador: Este trecho de programa ordena os elementos do vetor de forma que todos os elementos ímpares estão a esquerda (ocupam as posições mais baixas do vetor) e todos os elementos pares estão a direita (ocupam as posições mais altas do vetor)  */

		
		
	    
			int aux3=0;
			

	        
	        for (int i=0; i<a.length; i++) {
	            for (int j=i+1; j<a.length; j++) {
	                if (a[i]%2 != 0) {
	                    aux3 = a[i];
	                    a[i]=a[j];
	                    a[j]=aux3;
	               }
	            }
	            System.out.println(a[i]);
	            
	        }
	        System.out.println();

	//d) //(1,0) ponto
	// Comentário do Programador: Este trecho de programa ordena os elementos do vetor de forma que todos os elementos pares estão a esquerda (ocupam as posições mais baixas do vetor) e todos os elementos ímpares estão a direita (ocupam posições mais altas do vetor)  */

	    
			int aux4=0;
			

	        
	        for (int i=0; i<a.length; i++) {
	            for (int j=i+1; j<a.length; j++) {
	                if (a[i]%2 == 0) {
	                    aux4 = a[i];
	                    a[i]=a[j];
	                    a[j]=aux4;
	               }
	            }
	            System.out.println(a[i]);
	            
	        }
	        System.out.println();
	    }
	}
	//e) (1,0 ponto)
	/* Comentário do Programador: Este trecho de programa inverte a ordem dos elementos no vetor */

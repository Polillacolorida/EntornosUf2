package practica1;
import java.util.Scanner;

/**
 * 
 * @author Anna Cristina
 * @version 1.0
 * @since 18/12/2023
 * 
 * */

/**
 * 
 * Este programa sirve para calcular
 * si unalumno ha aprobado o suspendido
 * una asignatura en funcion a su nota
 * 
 * */

	//Declaramos las variables

	public class notas {
		
		double uf1, uf2, uf3;
		double acu1, acu2, acu3, def;
		
		Scanner entrada = new Scanner(System.in);
		
		///vamos ca crear un metodo para ingresar 
		
		
		public void IngresaNotas() {
			
			System.out.println("ingrese las notas del estudiante");
			
			System.out.print("ingrese nota 1: ");
			
			uf1= entrada.nextDouble(); //almacena variable 1

			
			System.out.print("ingrese nota 2: ");
			
			uf2= entrada.nextDouble(); //almacena variable 2
			
			System.out.print("ingrese nota 3: ");
			
			uf3= entrada.nextDouble();//almacena variable 3
			
		
		}
		
		/**
		 * Métodos de control para comprobar que
		 * estén bien introducidos los valores
		 *
		 **/
		
		public void comprobarcion(){
			
			if (uf1>10) {
				System.out.println(" nota1 mal introducida");
				
			}else {
				System.out.println(" nota1 correcta");
			}
			
			if (uf2>10) {
				System.out.println(" nota2 mal introducida");
				
			}else {
				System.out.println(" nota2 correcta");
			}
			if (uf3>10) {
				System.out.println(" nota3 mal introducida");
				
			}else {
				System.out.println(" nota3 correcta");
			}
			
				
			
			
		}
		/**
		 * Esta funcion calcula las notas
		 * pero no las muesta aún
		 * 
		 * */
		
		public void Calculonotas() {
			acu1= uf1*0.35;
			acu2 = uf2 * 0.35;
			acu3 = uf3 * 0.30;
			
			def = acu1 + acu2+ acu3;
			
		}
		
		/**
		 * Esta función muestra todas las notas introducidas
		 * y la nota definitiva
		 * */
		
		public void Mostrar() {
			
			System.out.println(" notas introducidas son:");
			System.out.println(" nota1 = " + uf1);
			System.out.println(" nota2 = " + uf2);
			System.out.println(" nota3 = " + uf3);
			
			System.out.println(" acumuado 1 = "+ acu1);
			System.out.println(" acumuado 2 = "+ acu2);
			System.out.println(" acumuado 3 = "+ acu3);
			
			System.out.println(" nota definitiva es = "+ def);
			
		}
	
		/**
		 * 
		 *Función que determina si está aprobado o suspendido 
		 *
		 * */
		
		public void aprobado() {
				
				if(def<5 && def>=0) {
					System.out.println("suspendio");
				}else {
					if (def>=5 && def<=10 ) {
					System.out.println("aprobado");
					}else {
						System.out.println(" error en la notas");
					}
				}
			}
			
			
		public static void main(String[] args) {
			//Creamos mecanismos para llamar a cada una de las funciones cuando sea necesario
			notas fc= new notas();
			
			fc.IngresaNotas();
			
			fc.comprobarcion();
			

			fc.Calculonotas();
			
			fc.Mostrar();
			
			fc.aprobado();
			
		}

	}



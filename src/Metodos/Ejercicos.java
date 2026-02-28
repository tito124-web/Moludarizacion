package Metodos;

import java.util.Scanner;
import java.util.Random;
public class Ejercicos {

	static  Scanner sc = new Scanner(System.in);
	 static  Random rand = new Random();
	final static String CONTRA = "1234";
	public static void main(String[] args) {
		
		

		      
		    int opcion = 0;
		    
 
		    do {
		    	
		    	

		       
		        System.out.println("       MENÚ PRINCIPAL         ");
		        System.out.println("  1. Calculadora básica       ");
		        System.out.println("  2. Validación de contraseña ");
		        System.out.println("  3. Números primos           ");
		        System.out.println("  4. Suma de números pares    ");
		        System.out.println("  5. Conversión de temperatura");
		        System.out.println("  6. Contador de vocales      ");
		        System.out.println("  7. Cálculo de factorial     ");
		        System.out.println("  8. Juego de adivinanza      ");
		        System.out.println("  9. Paso por referencia      ");
		        System.out.println("  10. Tabla de multiplicar    ");
		        System.out.println("  0. Salir ");
		        System.out.print("Elige una opción: ");

		        try {
		            opcion = Integer.parseInt(sc.nextLine());
		        } catch (NumberFormatException e) {
		            System.out.println(" Opción inválida. Ingresa un número del 0 al 10.");
		            continue;
		        }

		        switch (opcion) {
		            case 1:  calculadora();           break;
		            case 2:  validacioncontraseña();  break;
		            case 3:  numeroprimo();           break;
		            case 4:  sumaPares();             break;
		            case 5:  conversionTemperatura(); break;
		            case 6:  contadorVocales();       break;
		            case 7:  calcularFactorial();     break;
		            case 8:  juegoAdivinanza();       break;
		            case 9:  pasoPorReferencia();     break;
		            case 10: tablaMultiplicar();      break;
		            case 0:  System.out.println("¡Hasta luego!"); break;
		            default: System.out.println(" Opción inválida.");
		        }

		    } while (opcion != 0);
		}
		
		
		
	
	
		
		
		
	
         public static void calculadora() {
		
		    System.out.println("ingrese el primer numero");
		    int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("ingrese el segundo numero");
			int num2 = Integer.parseInt(sc.nextLine());
			System.out.println("Elige la operacion:  1)suma, 2)resta, 3)multiplicacion, 4)divicion, 5)Salir");
			int dato = Integer.parseInt(sc.nextLine());
			switch (dato) {
			
			case 1: System.out.println("la suma es " + suma(num1,num2));
			break;
			
			case 2: System.out.println("la resta es " + resta(num1,num2));
			break;
			
			case 3: System.out.println("la multiplicacion es" + multi(num1,num2));
			break;
			
			case 4:try {
				System.out.println("la divicion es " + divi(num1,num2));
			}
			
			catch (ArithmeticException e) {
		        System.out.println("Error: " + e.getMessage());
		        
		    } 
			break;
			
			default: System.out.println("opcion incorrecta");
			
			
			
			
			
			
			
			}
         }
	
	public static double suma(int num1, int num2) 
	{ return num1 + num2; }
	
	public static double resta(int num1, int num2) {
		return num1 - num2;
	}
	public static double multi( int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divi(int num1, int num2) {
		 
			if (num2 == 0) {
				throw new ArithmeticException("No se puede dividir entre cero");
				
			 }
			return num1 / num2;
			}
	
	//ejercicio 2
		
	public static void validacioncontraseña() {
		
		
	        String ingresada;
		
		
	do {
		System.out.println("ingresa la contraseña");
		ingresada = sc.nextLine();
		if (!ingresada.equals(CONTRA)) {
			System.out.println("contraseña incorrecta intenta de nuevo");
			
		} }
		
		while (!ingresada.equals(CONTRA)); {
			System.out.println("bienvenido");
		}
			
		
	}
	
	//ejercicio 3
	public static void numeroprimo() {
		
      System.out.println("ingresa el numero para saber si es primo o no ");
      int primo = Integer.parseInt(sc.nextLine());
       
     if (esprimo(primo)) {
    	 System.out.println(primo + " es primo");
    	 
     }
     else {
    	 System.out.println(primo + " no es primo");
    	 
     }
		
	}
	
	public static boolean esprimo(int primo) {
		if (primo <= 1) return false;
		if (primo == 2) return true;
		
		 for (int i = 2; i <= Math.sqrt(primo); i++) {
	            if (primo % i == 0) return false;
	        }
	        return true;
		
	}
	
	
	//ejercico 4
	public static void sumaPares () {
		
		int suma = 0;
		int num;

		System.out.println("ingresa los numeros (0 para terminar):");

		while (true) {
		    System.out.print("Número: ");
		    num = Integer.parseInt(sc.nextLine()); // leer AQUÍ adentro
		    
		    if (num == 0) break;
		    if (espar(num)) suma += num;
		}

		System.out.println("la suma es " + suma);
	
	}
	
	
	public static boolean espar(int num) {
		return num % 2 == 0;
	}
	
	
	//ejercicio 5
	public static void  conversionTemperatura() {
		System.out.println("ingresa una opcion");
		System.out.println("opcion uno Celsius a Fahrenheit");
		System.out.println("opcion dos Fahrenheit a Celsius");
		int op = Integer.parseInt(sc.nextLine());
		System.out.println("ingrese la temperatura");
		double temp = sc.nextDouble();
		
		switch (op) {
		case 1:  System.out.printf( "%.2f °C = %.2f °F%n", temp, celsiusAFahrenheit(temp)); break;
		case 2: System.out.printf("%.2f °F = %.2f °C%n", temp, fahrenheitACelsius(temp)); break;
		
		}
		
		
	}
	 public static double celsiusAFahrenheit(double c) { return (c * 9 / 5) + 32; }
	    public static double fahrenheitACelsius(double f) { return (f - 32) * 5 / 9; }	
	    
	    
	    
	    //ejercicio 6
	    public static void contadorVocales() {
	        
	        System.out.print("Ingresa una cadena de texto: ");
	        String texto = sc.nextLine();
	        int vocales = contarVocales(texto);
	        System.out.println("Vocales encontradas: " + vocales);
	    }

	    public static int contarVocales(String texto) {
	        int contador = 0;
	        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
	        for (char c : texto.toCharArray()) {
	            if (vocales.indexOf(c) != -1) contador++;
	        }
	        return contador;
	    }
	    
	    //ejercico7 
	    public static void calcularFactorial() {
	    	
	    	System.out.println("ingresa un nunmero entero que no sea negativo");
	    	int num = Integer.parseInt(sc.nextLine());
	    	
	    	if (num < 0)  System.out.println("Error el numero es neh¿gativo");
	    	
	    	else { System.out.println("el numero factorial es " + numfac(num));
	    	}
	    }
	    
	    public static long numfac(int num) {
	    	long resultado = 1;
	    
	    	for ( int i = 2; i <= num; i++) {
	    		resultado *= i;
	    	}
	    	return resultado;
	    	
	    }
	
	    //ejercicio8
	    public static void juegoAdivinanza() {
	        
	       
	        int numeroSecreto = rand.nextInt(100) + 1;
	        int intento;
	        int intentos = 0;

	        System.out.println("Adivina el número entre 1 y 100.");

	        do {
	            System.out.print("Tu intento: ");
	            intento = Integer.parseInt(sc.nextLine());
	            intentos++;

	            if (intento < numeroSecreto) {
	                System.out.println("El número es MAYOR.");
	            } else if (intento > numeroSecreto) {
	                System.out.println(" El número es MENOR.");
	            } else {
	                System.out.println("¡Correcto! Lo lograste en " + intentos + " intentos.");
	            }
	        } while (intento != numeroSecreto);
	    }
	    
        //ejercicio 9
	    public static void pasoPorReferencia() {
	       
	        int[] valores = new int[2];
	    
	        System.out.print("Ingresa el primer número: ");
	        valores[0] = Integer.parseInt(sc.nextLine());

	        System.out.print("Ingresa el segundo número: ");
	        valores[1] = Integer.parseInt(sc.nextLine());
	        System.out.println("Antes del intercambio → A: " + valores[0] + ", B: " + valores[1]);
	        intercambiar(valores);
	        System.out.println("Después del intercambio → A: " + valores[0] + ", B: " + valores[1]);
	    }

	    public static void intercambiar(int[] arr) {
	        int temp = arr[0];
	        arr[0] = arr[1];
	        arr[1] = temp;
	    }
	    //ejercico10
	    public static void tablaMultiplicar() {
	        System.out.println("\n--- 📊 TABLA DE MULTIPLICAR ---");
	        System.out.print("Ingresa un número: ");
	        int numero = Integer.parseInt(sc.nextLine());
	        mostrarTabla(numero);
	    }

	    public static void mostrarTabla(int n) {
	        System.out.println("\nTabla del " + n + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%d x %2d = %d%n", n, i, n * i);
	        }
	    }
	    
	    
	    
	}



package com.nttdata.mvn;

import java.util.Scanner;

import org.apache.commons.lang3.math.Fraction;

/**
 * @author Miguel Duran Gonzalez
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	int a;
    	int b;
    	System.out.println("Introduce el numerador: ");
    	try (Scanner leer = new Scanner(System.in)) {
			a = leer.nextInt();
			System.out.println("---------------------------");
			System.out.println("Introduce el denominador: ");
			b = leer.nextInt();
		}
    	System.out.println("Fracción: " + Fraction.getFraction(a, b));
    	System.out.println("Fracción reducida: " + Fraction.getReducedFraction(a, b));
    	
    	
    }
}

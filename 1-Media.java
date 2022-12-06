/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// Este programa calcula a média ponderada de 3 notas com pesos pré definidos em 2, 3 e 5

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	   Scanner ler = new Scanner(System.in);
	   int a, b, c, con;
	   
		System.out.println("Informe o primeiro valor:  ");
		a = ler.nextInt();
		
		System.out.println("Informe o segundo valor:  ");
		b = ler.nextInt();
		
		System.out.println("Informe o terceiro valor:  ");
		c = ler.nextInt();
		
		con = (a * 2 + b * 3 + c * 5)/10;
		
		System.out.println("A média ponderada é:  \n" + con);
		
		
	}
}

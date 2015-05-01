package Circulares;

public class Circular {
	private Nodo primerNodo;
	   private String nombre;  
	   // nombre es una cadena tal como "lista" usada en impresion

	   // construye una  Lista vac�a con un nombre
	   public Circulares( String cadena )
	   {
	      nombre = cadena;
	      primerNodo = null;
	   }

	   // construye una Lista vac�a con el nombre "lista"
	   public Circulares() 
	   { 
	      this( "lista circular simplemente enlazada" ); 
	   }  

	   // Inserta un Object delante de la Lista. Si la Lista esta vac�a, 
	   
	   public synchronized void insertar( Object elementoAInsertar )
	   {
	      if ( Vacia() ) {
	         primerNodo = new Nodo( elementoAInsertar);
	         primerNodo.proximoNodo=primerNodo;
	      }
	      else {
	      	 Nodo ultimoNodo;
	      	 Nodo actual = primerNodo;
	      	 while(actual.proximoNodo != primerNodo) {

}

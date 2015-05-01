package Circulares;

public class Nodo {
	Object dato;    
	   Nodo proximoNodo;

	   // Constructor para crear a NodoLista
	   	   Nodo( Object objeto ) 
	   { 
	      this( objeto, null ); 
	   }

	   // Constructor para crear a Nodo
	  
	   Nodo( Object objeto, NodoLista nodo )
	   {
	      dato = objeto;    
	      proximoNodo = nodo;  
	   }

	   // devuelve el Objeto en este nodo
	   Object obtenerObjeto() 
	   { 
	      return dato; 
	   }

	   // devuelve  el proximo nodo
	   Nodo obtenerProximo() 
	   { 
	      return proximoNodo; 
	   }

	}  




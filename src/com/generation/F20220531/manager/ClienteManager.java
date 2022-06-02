package com.generation.F20220531.manager;

import java.util.List;

import com.generation.F20220531.Cliente;

public class ClienteManager {
//PACKAGE DENTRO DEL PACKAGE 31
//logica de negocio	
	//recorrer el arreglo tipo List de datos main 31-05
	public void recorrerArreglo(List<Cliente> listaCliente) {//1° crear funcion public void + nombre variabe + List <nombre> + variable
	
		//for(int i=0;i < listaCliente.size(); i++) {// recorrer arreglo listaCliente
		//System.out.println(listaClientes.get(i))
			for (Cliente cliente : listaCliente) {
				System.out.println("ID ES: " + cliente.getId() + " "+ "NOMBRE: " + cliente.getNombre()+" "+ "CORREO: " + cliente.getCorreo()+ " "+ "RUT: " + cliente.getRut());//impresion lista cliente desde tostring clase cliente
				
					
		}
		
	//como pasar lista a esta clase
		
		
	}
}

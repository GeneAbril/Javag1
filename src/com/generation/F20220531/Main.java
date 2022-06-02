package com.generation.F20220531;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.generation.F20220531.manager.ClienteManager;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//agregar scanner para pedir datos
		
		//ARREGLO DE CLIENTES
		List <Cliente> listaClientes = new ArrayList<>();//crear lista de clientes
		
		//INSTANCIA DE CLIENTE
		//POR CADA OBJETO SE DEBE CREAR UNA INSTANCIA
		//sin datos constructor vacio por default
		//se recomienda agregar construtor vacio a menos que se cree con parametro
		
		Cliente cliente = new Cliente();//instancia
		
		int opcion =0;//crear variable fuera del do- linea 77
		
		//cliente.id = 1234;//se puede asignar valor a variable directo si se asigna como default en la otra clase
	//cliente.setNombre(null);//asignar dato
	//get: obtener o consultar dato
		
		//asignacion de manera estatica
		cliente.setId(1234);//se llama la variable para asignar valor
		cliente.setNombre("gene");//se llama la variable para asignar valor
		cliente.setRut("19656531-0");//se llama la variable para asignar valor
		cliente.setCorreo(null);
		
		do {
		//EXCEPCIONES
		//PEDIR DATOS MEDIANTE SCANNER
		Cliente clienteDatosDinamicos = new Cliente();
		System.out.println("Ingrese id de cliente");
		//Integer id = sc.nextInt(); //CAPTURAR VALOR, CREAR VARIABLE + SCANNER
		String idString = sc.nextLine();
		
		//SIRVE PARA CONTROLAR ERROR DE CONVERSION,ENVIA MENSAJE DE ERROR MAS CLARO
		try {//EJ: si se ingresa dato abc, no se puede transformar a int
			Integer id = Integer.parseInt(idString);//transformar string a inter
			//id+1 para verifica error
			clienteDatosDinamicos.setId(id);//ASIGNAR CON SET VARIABLE ID
			
		}catch(NumberFormatException nfe) {//informa error especifico
			System.out.println("No puede ingresar letra como identificador" + nfe);
			
		} catch (Exception e) {//e es una variable tipo excepcion, es generico
			System.out.println("Comuniquese con el administrador" + e);
			//System.out.println("No puede ingresar letra como identificador" + e.getMessage());//getMessage acorta mensaje a indicar
		}
		 sc.nextLine();//finalizar con sc.next
	
		
		System.out.println("Ingrese nombre de cliente");
		String nombre = sc.nextLine(); //CAPTURAR VALOR, CREAR VARIABLE + SCANNER
		clienteDatosDinamicos.setNombre(nombre);//ASIGNAR CON SET VARIABLE NOMBRE
	    sc.nextLine(); //agregar en caso de que no tome la instrucion 
		
		
		System.out.println("Ingrese correo de cliente");
		String correo= sc.nextLine();//CAPTURAR VALOR, CREAR VARIABLE + SCANNER
		clienteDatosDinamicos.setCorreo(correo);//ASIGNAR CON SET VARIABLE CORREO o Integer.parseInt(sc.nextLine();

		
		System.out.println("Ingrese rut de cliente");
		String rut = sc.nextLine();//CAPTURAR VALOR, CREAR VARIABLE + SCANNER
		clienteDatosDinamicos.setRut(rut);//ASIGNAR CON SET VARIABLE CORREO
		
		//Integer division = 100/0;
		//System.out.println(division);
		
		listaClientes.add(clienteDatosDinamicos);//AGREGAR CLIENTES A LA LISTA
		
		//Dar opcion al cliente con sysou
		System.out.println("Desea ingresar un nuevo cliente (1) si (0) no");
		opcion = sc.nextInt();//crear variable de opcion para pedir datos
		sc.nextLine();
		} while(opcion == 1);
		
		//acceder un metodo a otra clase: SE DEBE CREAR INSTANCIA DE LA CLASE
		ClienteManager cm = new ClienteManager();//importar primero, clientemanager es otra clase
		cm.recorrerArreglo(listaClientes);// cm + ctrl + espacio, llamar al metodo
		
	} 
		 
	}



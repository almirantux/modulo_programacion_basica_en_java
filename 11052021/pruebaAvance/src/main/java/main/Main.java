package main;

import java.util.List;
import java.util.Scanner;

import model.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		while(opcion != 5) {
			menuPrincipal();
			
		}
		


	}
	
	public static void menuPrincipal() {
		String menu = "1 Registro de pacientes\r\n" + 
				"2 Editar datos paciente\r\n" + 
				"3 Trazabilidad general\r\n" + 
				"4 Generación de certificado \r\n" +
				"5 Salir \r\n";
		System.out.println(menu);
	}
	public static Paciente crearPaciente(int id, String rut, String nombre, String apellido, int edad, String estado, String region, String comuna, List<Contacto> contactos, Diagnostico diagnostico) {
		Paciente paciente = new Paciente();
		paciente.setId(id);
		paciente.setRut(rut);
		paciente.setNombre(nombre);
		paciente.setApellido(apellido);
		paciente.setEdad(edad);
		paciente.setEstado(estado);
		paciente.setRegion(region);
		paciente.setComuna(comuna);
		paciente.setContactos(contactos);
		paciente.setDiagnostico(diagnostico);
		return paciente;
	}
}
//objetivo general, específicos, procesos, más de un rol
//alcance del proyecto, 'que se espera lograr'.
//planificación Gantt

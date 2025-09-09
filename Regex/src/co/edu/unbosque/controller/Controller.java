package co.edu.unbosque.controller;

import co.edu.unbosque.model.EstudianteDes2;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.persistance.FileHandler;
import co.edu.unbosque.view.Consola;

public class Controller {
	
	//facade
	private ModelFacade mf;
	
	private Consola con;
	
	public Controller() {
		mf = new ModelFacade();
		con = new Consola();
	}
	
	public void run() {
		mainloop:while(true) {
			con.printMenu();
			int op = con.readInt();
			con.quemarLinea();
			switch (op) {
			case 1:{
				con.printWithLine("Ingrese el nombre del estudiante: ");
				String name = con.readLine();
				con.printWithLine("Ingrese la edad del estudiante: ");
				int age = con.readInt();
				con.quemarLinea();
				con.printWithLine("Ingrese la escuela del estudiante: ");
				String school = con.readLine();
				con.printWithLine("Ingrese si el estudiante tiene pareja (Si/No) : ");
				boolean hasCouple = con.readBoolean();
				
				EstudianteDes2 newdata = new EstudianteDes2(name, age, school, hasCouple);
				mf.getEstDes2Dao().create(newdata);
				
				break;
			}
			case 2:{
				con.printWithLine("Ingrese el indice del estudiante que desea eliminar: ");
				int index = con.readInt();
				con.quemarLinea();
				mf.getEstDes2Dao().delete(index);
				con.printWithLine("Eliminado exitosamente! ");
				break;
			}
			case 3:{
				FileHandler.escribirEnArchivoTexto("miarchivito.txt", mf.getEstDes2Dao().showAll());
				break;
			}
			
			
			case 99: {
				con.printWithLine("Hasta luego!!!");
				break mainloop;
			}
			default:
				con.printWithLine("Valor no valido, intente de nuevo.");
			}
			
		}
	}
	
}

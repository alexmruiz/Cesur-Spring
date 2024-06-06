package managers;


public class PrincipalAcceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tarea3

		Acceso Setup = new Acceso();
		Setup.setup();
		
		Acceso acceder = new Acceso();
		acceder.create();
		
		Acceso salida = new Acceso();
		salida.exit();

	}

}

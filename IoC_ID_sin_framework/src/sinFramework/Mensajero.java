package sinFramework;

public class Mensajero {

	public static void main(String[] args) {
		AppContainer contenedor = new AppContainer();
		
		IMensaje mensaje = contenedor.getIMensaje(false);
		
		mensaje.enviarMensaje("Hola");
	}

}

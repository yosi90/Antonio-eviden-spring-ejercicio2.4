package sinFramework;

public class mensajeNegativo implements IMensaje {

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Mensaje negativo: " + mensaje);
	}

}

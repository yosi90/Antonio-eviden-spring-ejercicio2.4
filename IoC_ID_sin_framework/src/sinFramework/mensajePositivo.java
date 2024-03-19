package sinFramework;

public class mensajePositivo implements IMensaje {

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Mensaje positivo: " + mensaje);
	}

}

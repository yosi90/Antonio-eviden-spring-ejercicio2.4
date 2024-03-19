package sinFramework;

public class AppContainer {
	
	public IMensaje getIMensaje(boolean tipo) {
		return tipo ? new mensajePositivo() : new mensajeNegativo();
	}
}

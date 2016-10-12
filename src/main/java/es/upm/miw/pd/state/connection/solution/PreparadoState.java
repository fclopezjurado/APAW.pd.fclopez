package es.upm.miw.pd.state.connection.solution;

public class PreparadoState extends State {

	@Override
	public void abrir(Conexion conexion) {
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setState(new CerradoState());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setState(new ParadoState());
	}

	@Override
	public void iniciar(Conexion conexion) {
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setState(new EsperandoState());
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException(State.UNSUPPORTED_OPERATION_EXCEPTION);
	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}

}

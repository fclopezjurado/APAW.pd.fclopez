package es.upm.miw.pd.state.connection.solution;

public class CerradoState extends State {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setState(new PreparadoState());
	}

	@Override
	public void cerrar(Conexion conexion) {
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException(State.UNSUPPORTED_OPERATION_EXCEPTION);
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException(State.UNSUPPORTED_OPERATION_EXCEPTION);
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException(State.UNSUPPORTED_OPERATION_EXCEPTION);
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException(State.UNSUPPORTED_OPERATION_EXCEPTION);
	}

	@Override
	public Estado getEstado() {
		return Estado.CERRADO;
	}

}

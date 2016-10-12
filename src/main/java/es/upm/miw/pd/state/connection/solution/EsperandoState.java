package es.upm.miw.pd.state.connection.solution;

public class EsperandoState extends State {

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException(State.UNSUPPORTED_OPERATION_EXCEPTION);
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException(State.UNSUPPORTED_OPERATION_EXCEPTION);
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
		if (respuesta == 0)
			conexion.setState(new PreparadoState());
		else
			conexion.setState(new CerradoState());
	}

	@Override
	public Estado getEstado() {
		return Estado.ESPERANDO;
	}

}

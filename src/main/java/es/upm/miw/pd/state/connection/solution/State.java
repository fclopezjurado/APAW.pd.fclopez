package es.upm.miw.pd.state.connection.solution;

public abstract class State {
	
	protected static final String UNSUPPORTED_OPERATION_EXCEPTION = "[UnsupportedOperationException]: Forbidden action";

	public abstract void abrir(Conexion conexion);

	public abstract void cerrar(Conexion conexion);

	public abstract void parar(Conexion conexion);

	public abstract void iniciar(Conexion conexion);

	public abstract void enviar(Conexion conexion, String msg);

	public abstract void recibir(Conexion conexion, int respuesta);

	public abstract Estado getEstado();

}

package es.upm.miw.pd.state.connection.solution;

public abstract class State {

	public abstract void abrir();

	public abstract void cerrar();

	public abstract void parar();

	public abstract void iniciar();

	public abstract void enviar(Conexion conexion, String msg);

	public abstract void recibir(Conexion conexion, int respuesta);

	public abstract Estado getEstado();

}

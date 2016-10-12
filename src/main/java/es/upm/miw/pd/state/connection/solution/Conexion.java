package es.upm.miw.pd.state.connection.solution;

public class Conexion {
	private State state;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.state = new CerradoState();
	}

	public Link getLink() {
		return link;
	}

	protected void setState(State state) {
		this.state = state;
	}

	public Estado getEstado() {
		return this.state.getEstado();
	}

	public void abrir() {
		this.state.abrir(this);
	}

	public void cerrar() {
		this.state.cerrar(this);
	}

	public void parar() {
		this.state.parar(this);
	}

	public void iniciar() {
		this.state.iniciar(this);
	}

	public void enviar(String msg) {
		this.state.enviar(this, msg);
	}

	public void recibir(int respuesta) {
		this.state.recibir(this, respuesta);
	}

}

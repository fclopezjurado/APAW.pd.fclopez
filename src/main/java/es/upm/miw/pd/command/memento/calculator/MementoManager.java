package es.upm.miw.pd.command.memento.calculator;

import java.util.SortedMap;
import java.util.TreeMap;

public class MementoManager {
	private SortedMap<String, Memento> lista = new TreeMap<String, Memento>();

	public void addMemento(String key, Memento memento) {
		this.lista.put(this.lista.size() + ":" + key, memento);
	}

	public Memento getMemento(String key) {
		return this.lista.get(key);
	}

	public String[] keys() {
		return this.lista.keySet().toArray(new String[0]);
	}

}

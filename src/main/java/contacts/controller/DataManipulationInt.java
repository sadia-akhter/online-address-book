package contacts.controller;

import java.util.List;

public interface DataManipulationInt<T> {
	List<T> getAll();
	T getById(int id);
}

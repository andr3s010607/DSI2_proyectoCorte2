package co.edu.unbosque.model.persistance;

import java.util.ArrayList;

import co.edu.unbosque.model.EstudianteDes2;

public class EstudianteDes2DAO implements DAO<EstudianteDes2>{
	private ArrayList<EstudianteDes2> estudianteList;
	
	public EstudianteDes2DAO() {
		estudianteList = new ArrayList<>();
	}
	
	@Override
	public void create(EstudianteDes2 newData) {
		estudianteList.add(newData);
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= estudianteList.size()) {
			return false;
		}
		else {
			estudianteList.remove(index);
			return true;
		}
	}

	@Override
	public boolean update(int index, EstudianteDes2 newData) {
		if (index < 0 || index >= estudianteList.size()) {
			return false;
		}
		else {
			estudianteList.set(index, newData);
			return true;
		}
	}

	private String content = "";
	@Override
	public String showAll() {
		estudianteList.forEach((estudiante) ->{
			content += estudiante.toString();
		});
		return content;
		}
	

	@Override
	public int count() {
		return estudianteList.size();
	}
	
	
}

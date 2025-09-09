package co.edu.unbosque.model.persistance;

public interface DAO <E>{
	
	public void create(E newData);
	public boolean delete(int index);
	public boolean update(int index, E newData);
	public String showAll();
	public int count();
}

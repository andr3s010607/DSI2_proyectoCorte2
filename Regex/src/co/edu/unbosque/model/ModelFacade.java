package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.EstudianteDes2DAO;

public class ModelFacade {
	private EstudianteDes2DAO estDes2Dao;
	
	public ModelFacade() {
		estDes2Dao = new EstudianteDes2DAO();
	}

	public EstudianteDes2DAO getEstDes2Dao() {
		return estDes2Dao;
	}

	public void setEstDes2Dao(EstudianteDes2DAO estDes2Dao) {
		this.estDes2Dao = estDes2Dao;
	}
	
	
	
}

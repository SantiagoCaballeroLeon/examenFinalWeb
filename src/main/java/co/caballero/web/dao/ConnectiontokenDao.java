package co.caballero.web.dao;

import co.caballero.web.util.Conexion;
import co.caballero.web.modelo.Connectiontoken;

public class ConnectiontokenDao extends Conexion<Connectiontoken> implements GenericDao<Connectiontoken> {

	private static final long serialVersionUID = 1L;

	public ConnectiontokenDao() {
		super(Connectiontoken.class);
	}

}
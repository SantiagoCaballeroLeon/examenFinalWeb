package co.caballero.web.dao;

import co.caballero.web.modelo.Rol;
import co.caballero.web.util.Conexion;

public class RolDao extends Conexion<Rol> implements GenericDao<Rol> {

	private static final long serialVersionUID = 1L;

	public RolDao() {
		super(Rol.class);
	}

}

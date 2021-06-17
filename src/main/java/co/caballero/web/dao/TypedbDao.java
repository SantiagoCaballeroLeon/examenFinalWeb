package co.caballero.web.dao;

import co.caballero.web.modelo.Typedb;
import co.caballero.web.util.Conexion;

public class TypedbDao extends Conexion<Typedb> implements GenericDao<Typedb> {

	private static final long serialVersionUID = 1L;

	public TypedbDao() {
		super(Typedb.class);
	}

}

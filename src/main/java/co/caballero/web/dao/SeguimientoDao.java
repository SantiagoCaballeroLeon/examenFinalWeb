package co.caballero.web.dao;

import co.caballero.web.modelo.Seguimiento;
import co.caballero.web.util.Conexion;

public class SeguimientoDao extends Conexion<Seguimiento> implements GenericDao<Seguimiento> {

	private static final long serialVersionUID = 1L;

	public SeguimientoDao() {
		super(Seguimiento.class);
	}

}

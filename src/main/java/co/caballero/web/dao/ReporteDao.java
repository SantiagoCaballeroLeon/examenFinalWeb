package co.caballero.web.dao;

import co.caballero.web.modelo.Reporte;
import co.caballero.web.util.Conexion;

public class ReporteDao extends Conexion<Reporte> implements GenericDao<Reporte> {

	private static final long serialVersionUID = 1L;

	public ReporteDao() {
		super(Reporte.class);
	}

}
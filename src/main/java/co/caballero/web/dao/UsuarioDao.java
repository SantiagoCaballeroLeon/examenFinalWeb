package co.caballero.web.dao;

import co.caballero.web.modelo.Usuario;
import co.caballero.web.util.Conexion;

public class UsuarioDao extends Conexion<Usuario> implements GenericDao<Usuario> {

	private static final long serialVersionUID = 1L;

	public UsuarioDao() {
		super(Usuario.class);
	}

}

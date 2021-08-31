package imgStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import imgStore.DB.ConexaoDB;
import imgStore.entidades.Usuario;

public class usuarioDAO {
	
	public static void cadastrarUsuario(Usuario usuario)  {
		
		//boolean ok=false;
		Connection con;
		
		try {
		
		
		con = ConexaoDB.createConnection();
		String sql = "insert into USUARIO values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,usuario.getUSER_NAME());
		ps.setString(2,usuario.getSENHA());
		ps.setString(3,usuario.getEMAIL());
		ps.execute();
		
		
		
		
		
	 } catch (SQLException ex) {
         Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
		//return ok;	
	}

}

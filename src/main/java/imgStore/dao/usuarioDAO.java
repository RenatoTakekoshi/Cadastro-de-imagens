package imgStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import imgStore.DB.ConexaoDB;
import imgStore.entidades.Usuario;

public class usuarioDAO {
	
	public static void cadastrarUsuario(Usuario usuario)  {
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
	
	public static Usuario buscarUsuario(String nome) {
		Usuario usuario = new Usuario();
		Connection con;
		
		
		try {
			con = ConexaoDB.createConnection();
			String sql = " SELECT * FROM Usuario where USER_NAME = '" + nome + "';";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()){			
			usuario.setUSER_NAME(rs.getString("USER_NAME"));
			usuario.setSENHA(rs.getString("SENHA"));
			usuario.setEMAIL(rs.getString("EMAIL"));
			System.out.println("oi");
			}
			
			
			
		}catch (SQLException ex) {
			System.out.println("usuario nao encontrado");
            Logger.getLogger(ImagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return usuario;
		
	}

}

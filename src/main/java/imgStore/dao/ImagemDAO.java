package imgStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import imgStore.DB.ConexaoDB;
import imgStore.entidades.Imagem;

public class ImagemDAO {
	
	public static void CadastrarImagem(Imagem imagem, String usuario) {		
		Connection con;
		
		try {
			
		con = ConexaoDB.createConnection();
		String sql = "insert into IMAGENS values (DEFAULT,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,imagem.getIMG_URL());
		ps.setString(2,imagem.getIMG_TITULO());
		ps.setString(3,usuario);
		ps.execute();
		

	 } catch (SQLException ex) {
         Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
		
	}
	
	

}

package imgStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
	
	public static List<Imagem> ListarImagem(String nome) {

		List<Imagem> imagens = new ArrayList<Imagem>();
		Connection con;
		try {
			con= ConexaoDB.createConnection();
			String sql = "select * from imagens where USUARIO_USER_NAME = '" + nome + "';";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();		
					while(rs.next()) {
						int id = rs.getInt("ID_IMG");
						String titulo = rs.getString("IMG_TITULO");
						String url = rs.getString("IMG_URL");
						imagens.add(new Imagem(id,url,titulo));
						
					}
						
					}catch (SQLException ex) {
						System.out.println("Imagens nao encontradas");
			            Logger.getLogger(ImagemDAO.class.getName()).log(Level.SEVERE, null, ex);
			        }
		
					
		
		return imagens;
		
	}
	
	

}

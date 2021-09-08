package imgStore.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoDB {
	

	
	  static {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
	        }
	  }
	  

	
	public static Connection createConnection() throws SQLException{
		
		 String username = "root";
		 String senha = "";
		 String bancoURL = "jdbc:mysql://localhost:3306/imgstore";
		Connection connection = DriverManager.getConnection(bancoURL,username,senha);
		return connection;
		
	}
	
/////////////////Testando a conexao/////////////////////////////////////	
	public static void main(String args[]) throws Exception{
		Connection con = createConnection();
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso");
			con.close();
		}
	}
	
	

}

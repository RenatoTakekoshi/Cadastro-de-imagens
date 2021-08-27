package imgStore.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {
	
	private static String username = "root";
	private static String senha = "";
	private static String bancoURL = "jdbc:mysql://localhost:3306/imgstore";
	
	public static Connection createConnection() throws Exception{
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

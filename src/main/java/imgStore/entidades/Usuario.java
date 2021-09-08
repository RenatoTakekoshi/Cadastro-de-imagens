package imgStore.entidades;

public class Usuario {
	
	String USER_NAME;
	String SENHA;
	String EMAIL;
	
	
	

	public Usuario() {
		super();
	}

	public Usuario(String USER_NAME, String SENHA) {
		this.USER_NAME = USER_NAME;
		this.SENHA = SENHA;
	}
	
	public Usuario(String USER_NAME, String SENHA, String EMAIL) {
		super();
		this.USER_NAME = USER_NAME;
		this.SENHA = SENHA;
		this.EMAIL = EMAIL;
	}

	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getSENHA() {
		return SENHA;
	}
	public void setSENHA(String sENHA) {
		SENHA = sENHA;
	}
	
	

}

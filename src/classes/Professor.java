package classes;

public class Professor {
	private String nome;
	private String cpf;
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String cadastrar() {
		String msg = "O professor "+nome+" foi cadastrado";
		return msg;
	}
}

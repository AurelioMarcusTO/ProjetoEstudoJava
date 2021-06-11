package cursojava.interfaces;

/*Essa interface sera nosso contrato de autenticação*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);/*Apenas declaraçao do método*/
	
	public boolean autenticar();
	

}

package cursojava.interfaces;

/*Essa interface sera nosso contrato de autentica��o*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);/*Apenas declara�ao do m�todo*/
	
	public boolean autenticar();
	

}

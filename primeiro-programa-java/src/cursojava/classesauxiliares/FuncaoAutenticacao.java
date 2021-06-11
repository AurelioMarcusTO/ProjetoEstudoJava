package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente receber alguem que tem o contrato e PermitirAcesso ee chamar o autenticado.*/
public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
		
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		
		this.permitirAcesso = acesso;
		
	}

}

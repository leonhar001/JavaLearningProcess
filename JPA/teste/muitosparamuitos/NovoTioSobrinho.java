package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Sobrinho;
import modelo.muitosparamuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio1 = new Tio("João");
		Tio tio2 = new Tio("Carlos");
		
		Sobrinho sobrinho1 = new Sobrinho("Carlinhos");
		Sobrinho sobrinho2 =  new Sobrinho("Joãozinho");
		
		DAO<Object> dao = new DAO<>();
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		dao
			.abrirTransacao()
			.incluir(tio1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinho2)
			.fecharTransacao()
			.fechar();
	}

}

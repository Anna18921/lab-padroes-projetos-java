package one.digitalInnovation.gof.Facade;

import one.digitalInnovation.gof.singleton.SingletonLazyHolder;
import one.digitalInnovation.gof.subsistema1.crm.CrmService;
import one.digitalInnovation.gof.subsistema2.cep.CepApi;

public class Facade {
    private static class InstanceFacade {
        public static Facade instance = new Facade();
    }

    private Facade (){
        super();
    }

    public static Facade getInstance(){
        return InstanceFacade.instance;
    }
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

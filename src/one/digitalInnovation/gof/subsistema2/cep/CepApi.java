package one.digitalInnovation.gof.subsistema2.cep;

import one.digitalInnovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Petrolina";
    }
    public String recuperarEstado(String cep){
        return "Pernambuco";
    }
}

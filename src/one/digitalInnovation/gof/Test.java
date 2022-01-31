package one.digitalInnovation.gof;

import one.digitalInnovation.gof.Facade.Facade;
import one.digitalInnovation.gof.singleton.SingletonEager;
import one.digitalInnovation.gof.singleton.SingletonLazy;
import one.digitalInnovation.gof.singleton.SingletonLazyHolder;
import one.digitalInnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        Facade facade = Facade.getInstance();

        facade.migrarCliente("Anna", "5630000");


    }
}

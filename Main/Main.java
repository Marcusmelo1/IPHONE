package Main;

import Navegar_na_net.Aplicativo_on;

import SmartFone.SmartFone;


public class Main {
    public static void main(String[] args) {
        SmartFone meuSmartFone = new SmartFone();
        Aplicativo_on appNet = new Aplicativo_on("Wi-Fi Conectado");
        meuSmartFone.Mensagem();
        meuSmartFone.Começar_ligacao();
        meuSmartFone.Terminar_ligacao();

        meuSmartFone.internet(appNet);
        
    }
}

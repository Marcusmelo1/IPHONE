package SmartFone;

import Aparelho_telefonico.Aparelho_telefonico;
import Navegar_na_net.Navegar_na_net;
import Navegar_na_net.Aplicativo_on;
import Reprodutor_Musica.Reprodutor_Musica;

public class SmartFone implements Aparelho_telefonico, Reprodutor_Musica, Navegar_na_net {

    @Override
    public void Mensagem() {
        System.out.println("O Reprodutor de música está a funcionar");
    }

    @Override
    public void Começar_ligacao() {
        System.out.println("A ligação começou");
    }

    @Override
    public void Terminar_ligacao() {
        System.out.println("A ligação terminou");
    }

    @Override
    public void navegar_internet() {
        System.out.println("O celular está a navegar na net");
    }

    @Override
    public void internet(Aplicativo_on conecao) {
        conecao.conecao();
    }
}
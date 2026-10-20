package Navegar_na_net;

public class Aplicativo_on {
    private String conecao;  

    public Aplicativo_on(String conecao){
        this.conecao = conecao; 
    }

    public void conecao(){
        System.out.println("O aplicativo está conectado na internet");
    }
    
}

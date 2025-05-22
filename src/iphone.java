public class iphone {

    public static void main(String[] args) {
        // Criando instâncias dos objetos
        aparelhoTelefonico telefone = new aparelhoTelefonico();
        navegadorInternet navegador = new navegadorInternet();
        reprodutorMusical reprodutor = new reprodutorMusical();

        
        telefone.ligar();
        telefone.atender();
        telefone.desligar();

       
        navegador.abrirPagina("www.google.com");
        navegador.fecharPagina();
        navegador.atualizarPagina();
        navegador.navegarPara("www.github.com");

        reprodutor.tocarMusica();
        reprodutor.pausarMusica();
        reprodutor.pararMusica();
        reprodutor.selecionarMusica("Musica 1");
    }
}

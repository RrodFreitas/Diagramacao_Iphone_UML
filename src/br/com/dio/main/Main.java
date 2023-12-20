package br.com.dio.main;

import br.com.dio.entity.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
        
		System.out.println("========================  Iphone Navegador Internet =====================");
        iphone.exibirPagina("www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
        System.out.println("\n========================  Iphone Funcionamento Ligações =====================");
        iphone.ligar("65209991829182");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        System.out.println("\n========================  Iphone Reprodutor de Musicas =====================");
        iphone.selecionarMusica("Enter Sandman - Metallica");
        iphone.tocar();
        iphone.pausar();

	}

}

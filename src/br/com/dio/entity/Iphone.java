package br.com.dio.entity;

import br.com.dio.interfaces.AparelhoTelefonico;
import br.com.dio.interfaces.NavegadorInternet;
import br.com.dio.interfaces.ReprodutorMusica;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica{

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica);
	}

	@Override
	public void exibirPagina(String pagina) {
		System.out.println("Acessando: " + pagina);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Chamando numero: " + numero);		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligacao");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando chamada correio de voz");
	}

}

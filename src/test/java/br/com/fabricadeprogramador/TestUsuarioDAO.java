package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testExcluir() {
		Usuario usu = new Usuario();
		usu.setId(1);
		
		UsuarioDAO usuDao = new UsuarioDAO();
		usuDao.excluir(usu);
		
		System.out.println("Excluido com sucesso!");
	}
	
	public static void testAlterar() {
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("breno");
		usu.setLogin("breno");
		usu.setSenha("breno");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso!");
	}
	
	public static void testCadastrar() {
		Usuario usu = new Usuario();

		usu.setNome("Jão");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}

}

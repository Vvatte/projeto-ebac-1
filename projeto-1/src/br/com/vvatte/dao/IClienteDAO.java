package br.com.vvatte.dao;

import br.com.vvatte.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public  void excluir (Long cpf);

    public Cliente consultar (Long cpf);

    public void alterar (Cliente cliente);

    public Collection<Cliente> buscarTodos();
}

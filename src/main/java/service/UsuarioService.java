package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;

public class UsuarioService {

    private UsuarioRepository repository = new UsuarioRepository();

    public List<Usuario> listarTodos() {
        return repository.listarTodos();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    public Usuario criar(Usuario usuario) {
        return repository.salvar(usuario);
    }

    public void deletar(Long id) {
        repository.deletar(id);
    }

    public Optional<Usuario> atualizar(Long id, Usuario usuario) {
        return repository.atualizar(id, usuario);
    }
}

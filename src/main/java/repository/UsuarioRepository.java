package com.example.demo.repository;

import com.example.demo.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();
    private AtomicLong contadorId = new AtomicLong(1);

    public List<Usuario> listarTodos() {
        return usuarios;
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    public Usuario salvar(Usuario usuario) {
        usuario.setId(contadorId.getAndIncrement());
        usuarios.add(usuario);
        return usuario;
    }

    public Optional<Usuario> atualizar(Long id, Usuario usuarioAtualizado) {
        return buscarPorId(id).map(usuario -> {
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            return usuario;
        });
    }

    public void deletar(Long id) {
        usuarios.removeIf(u -> u.getId().equals(id));
    }
}
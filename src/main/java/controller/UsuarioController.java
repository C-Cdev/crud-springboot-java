package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService service = new UsuarioService();

    @GetMapping
    public List<Usuario> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return service.criar(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public Optional<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        return service.atualizar(id, usuario);
    }
}
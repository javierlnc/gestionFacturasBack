package co.javierLeon.gestionFacturas.service.impl;

import co.javierLeon.gestionFacturas.repository.UserRepository;
import co.javierLeon.gestionFacturas.service.UserService;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class UserImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMao) {
        return null;
    }
}

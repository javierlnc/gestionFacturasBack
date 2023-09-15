package co.javierLeon.gestionFacturas.repository;

import co.javierLeon.gestionFacturas.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findById(@Param(("id"))String id);
    User findByUsername(@Param(("username"))String username);

}

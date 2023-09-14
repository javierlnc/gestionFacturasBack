package co.javierLeon.gestionFacturas.repository;

import co.javierLeon.gestionFacturas.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findById(@Param(("id"))String Id);
    User findByUsername(@Param(("username")) String Username);

}

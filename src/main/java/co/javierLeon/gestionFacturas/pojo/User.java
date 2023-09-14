package co.javierLeon.gestionFacturas.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
@NamedQuery(name="User.findById", query="select u from Users where u.Id=Id")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="users")
public class User implements Serializable {
    @Id
    private String Id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="numeroCelular")
    private String numeroCelular;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="role")
    private String role;
    @Column(name="status")
    private String status;

}

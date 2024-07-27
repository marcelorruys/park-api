package com.marcelo.park_api.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @EqualsAndHashCode(of = "id") @ToString(of = {"id"})
@Entity
@Table(name = "users")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false, unique = true, length = 150)
    private String username;
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 25)
    private Role role;
    @Column(name = "created_date", nullable = false)
    private LocalDateTime CreatedDate;
    @Column(name = "modified_date", nullable = false)
    private LocalDateTime ModifiedDate;
    @Column(name = "created_by", nullable = false)
    private String CreatedBy;
    @Column(name = "modified_by", nullable = false)
    private String ModeifiedBy;

    public enum Role {

        ROLE_ADMIN, ROLE_CUSTOMER
    }
}

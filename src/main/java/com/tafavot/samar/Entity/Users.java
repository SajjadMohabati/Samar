package com.tafavot.samar.Entity;

import com.tafavot.samar.Converter.EventStatusConverter;
import com.tafavot.samar.Converter.UserStatusConverter;
import com.tafavot.samar.constants.USER_STATUS;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_uname", unique = true, nullable = false)
    private String username;

    @Column(name = "user_nCode", unique = true, nullable = false)
    private String nationalCode;

    @Column(name = "user_active")
    private Boolean active;

    @Convert(converter = UserStatusConverter.class)
    @Column(name = "user_status")
    private USER_STATUS status;

    @Column(name = "user_birth_date")
    private Long birthDate;

    @Column(name = "user_register_date")
    private Long registerDate;

    @Column(name = "user_active_date")
    private Long activeDate;

    @Column(name = "user_last_login")
    private Long lastLogin;

    @Column(name = "user_last_ip")
    private String lastIp;

    @Column(name = "user_fisrt_name")
    private String firstName;

    @Column(name = "user_last_name")
    private String lastName;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_cell",length = 10)
    private String cell;

    @Column(name = "user_otp")
    private String otp;

    @Column(name = "user_shenasnameh")
    private String shenasnameh;
}

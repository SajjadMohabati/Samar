package com.example.samar.Entity;

import jakarta.persistence.*;

@Table(name = "users")
@Entity
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

    @Column(name = "user_status")
    private Status status;

    public enum Status {
        ACTIVE, INACTIVE, SUSPENDED
    }

    @Column(name = "user_birth_date")
    private Long dateOfBirth;

    @Column(name = "user_register_date")
    private Long registrationDate;

    @Column(name = "user_active_date")
    private Long activeDate;

    @Column(name = "user_last_login")
    private Long lastLoginDate;

    @Column(name = "user_last_ip")
    private String lastIp;

    @Column(name = "user_fname")
    private String firstName;

    @Column(name = "user_lname")
    private String lastName;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_cell",length = 10)
    private String phoneNumber;

    @Column(name = "user_otp")
    private String OTP;

    @Column(name = "user_shenasnameh")
    private String birthCertificate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Long registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Long getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Long activeDate) {
        this.activeDate = activeDate;
    }

    public Long getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Long lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    public String getBirthCertificate() {
        return birthCertificate;
    }

    public void setBirthCertificate(String birthCertificate) {
        this.birthCertificate = birthCertificate;
    }

    public Users() {
    }
}

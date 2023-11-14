package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class RegistraceForm {


    @NotBlank(message = "Jméno musí být vyplněno.")
    private String jmeno;
    @NotBlank(message = "Příjmení musí být vyplněno.")
    private String prijmeni;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull(message = "Datum narození musí být vyplněno.")
    private LocalDate datumNarozeni;

    @NotNull(message = "Vyberte pohlaví.")
    private Pohlavi pohlavi;
    @NotBlank(message = "Vyberte turnus.")
    private String turnus;
    @Email
    private String email;
    private String telefon;

    @AssertTrue
    private boolean podminky;
    @AssertTrue
    private boolean rad;


    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public Pohlavi getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(Pohlavi pohlavi) {
        this.pohlavi = pohlavi;
    }

    public String getTurnus() {
        return turnus;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public boolean isPodminky() {
        return podminky;
    }

    public void setPodminky(boolean podminky) {
        this.podminky = podminky;
    }

    public boolean isRad() {
        return rad;
    }

    public void setRad(boolean rad) {
        this.rad = rad;
    }
}
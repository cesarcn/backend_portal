package com.example.backendh93p1.entity;


import javax.persistence.*;

@Entity
@Table(name = "examenAlumno")
public class examenAlumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iduserexamen;

    @ManyToOne(fetch = FetchType.EAGER)
    private UsuariosEntity oneexamen;
    @ManyToOne
    private Examen usersusuario;


    public Integer getIduserexamen() {
        return iduserexamen;
    }

    public void setIduserexamen(Integer iduserexamen) {
        this.iduserexamen = iduserexamen;
    }

    public UsuariosEntity getOneexamen() {
        return oneexamen;
    }

    public void setOneexamen(UsuariosEntity oneexamen) {
        this.oneexamen = oneexamen;
    }

    public Examen getUsersusuario() {
        return usersusuario;
    }

    public void setUsersusuario(Examen usersusuario) {
        this.usersusuario = usersusuario;
    }
}

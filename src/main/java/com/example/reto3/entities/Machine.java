package com.example.reto3.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.List;
/*
Historia de usuario Nro.	1
Título:	Creación de Máquinas
Descripción
COMO:	Usuario
QUIERO:	Ingresar los valores de marca, nombre, año, descripción y categoría
PARA:	Poder crear un máquina en el sistema
Criterios de aceptación
Los valores de marca y nombre deben ser un texto de no más de 45 caracteres.
Los valores de año deben ser un número de 4 dígitos que representa un año calendario.
Los valores de descripción deben ser un texto de máximo 250 caracteres.
El valor de categoría debe ser un número entero que representa el id de cada una de las categorías.
El usuario debe seleccionar la categoría viendo el nombre de la misma, no el número.
 */

@Entity
@Table(name = "machine")
public class Machine {
    /* Creo los atributos de la tabla*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*El valor de categoría debe ser un número entero que representa el id de cada una de las categorías.*/
    private Integer id;
    /*Los valores de marca y nombre deben ser un texto de no más de 45 caracteres.*/
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String brand;
    /*Los valores de marca y nombre deben ser un texto de no más de 45 caracteres.*/
    @Column(name = "year")
    private Integer years;
    /*Los valores de descripción deben ser un texto de máximo 250 caracteres.*/
    @Column(length = 250)
    private String description;
   /* private Integer category; aqui tenia el error:->*/
    /* Creación de relaciones- ****/
    @ManyToOne
    @JoinColumn(name="categoryId")
    @JsonIgnoreProperties("machines")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "machine")
    @JsonIgnoreProperties({"machine","client"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "machine")
    @JsonIgnoreProperties({"machine", "message"})
    private List<Reservation> reservations;


    /*creación de get y set*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
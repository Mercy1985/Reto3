package com.example.reto3.entities;
/* Reto 3 Ciclo 3
Historia de usuario Nro.	2
Título:	Creación de Categorías
Descripción
COMO:	Usuario
QUIERO:	Ingresar los valores de nombre y descripción
PARA:	Poder crear una categoría en el sistema
Criterios de aceptación
Los valores de nombre deben ser un texto de no más de 45 caracteres.
Los valores de descripción deben ser un texto de máximo 250 caracteres.
* */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   /*Los valores de nombre deben ser un texto de no más de 45 caracteres.*/
    @Column(length = 45)
    private String name;
/*Los valores de descripción deben ser un texto de máximo 250 caracteres.*/
    @Column(length = 250)
    private String description;
/*Relaciones con otras tables*/
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Machine> machines;

/*creación de getter y setter*/

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}

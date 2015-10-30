/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.modelo;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author bboyrap
 */
@Entity
@NamedQuery(name ="Funcionario.findAll", query = "SELECT f FROM Funcionario f")
@PrimaryKeyJoinColumn(name="ID")
public class Funcionario extends Usuario{
    private int matricula;
    private String cargo;
    private String setor;
    
    //entrega(1:N)
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Entrega> entregas;
    
    public Funcionario(){
        
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return the entregas
     */
    public Collection<Entrega> getEntregas() {
        return entregas;
    }

    /**
     * @param entregas the entregas to set
     */
    public void setEntregas(Collection<Entrega> entregas) {
        this.entregas = entregas;
    }
    
    
    
}

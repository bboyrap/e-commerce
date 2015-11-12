/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.controller;

import java.util.List;
import projeto.dao.DAOFactory;
import projeto.modelo.Carrinho;

/**
 *
 * @author aluno
 */
public class CtrlCarrinho {
    public void cadastrar(Carrinho car){
        DAOFactory.getCarrinhoDAO().inserir(car);
    }
    public List<Carrinho> carrinhoListar(int idUsuario){
        return DAOFactory.getCarrinhoDAO().carrinhoListar(idUsuario);
    }
    public int quantidadeItemTotal(int id) {
        return DAOFactory.getCarrinhoDAO().quantidadeItemTotal(id);
    }

    public double valorTotalCarrinho(int id) {
        return DAOFactory.getCarrinhoDAO().valorTotalCarrinho(id);
    }
    
    public boolean carrinhoExiste(int idUsuario){
        return DAOFactory.getCarrinhoDAO().carrinhoExiste(idUsuario);
    }

    public Carrinho getCarrinho(int idUsuario){
        return DAOFactory.getCarrinhoDAO().getCarrinho(idUsuario);
    }
    
    public void alterar(Carrinho car){
        DAOFactory.getCarrinhoDAO().alterar(car);
    }
}

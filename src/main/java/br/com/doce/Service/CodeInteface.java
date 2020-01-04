/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Service;

import br.com.doce.Model.Post;
import java.util.List;

/**
 *
 * @author Convidado
 */
public interface CodeInteface {
    
    List<Post> listAll();

    Post getById(Long id);

    Post saveOrUpdate(Post p);

    void delete(Long id);

    Post saveOrUpdateCadastro(Post p);
}

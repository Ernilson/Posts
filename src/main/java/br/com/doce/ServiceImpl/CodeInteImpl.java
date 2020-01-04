/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.ServiceImpl;

import br.com.doce.Model.Post;
import br.com.doce.Repository.CodeblogRepository;
import br.com.doce.Service.CodeInteface;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Convidado
 */
@Service
public class CodeInteImpl implements CodeInteface{

 private CodeblogRepository cr;   

    @Autowired
    public CodeInteImpl(CodeblogRepository cr) {
        this.cr = cr;
    }
    
    @Override
    public List<Post> listAll() {
        List<Post> cm = new ArrayList<>();
        cr.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }

    @Override
    public Post getById(Long id) {
       return cr.findById(id).orElse(null);
    }

    @Override
    public Post saveOrUpdate(Post p) {
        cr.save(p);
        return p;
    }

    @Override
    public void delete(Long id) {
         cr.deleteById(id);
    }

    @Override
    public Post saveOrUpdateCadastro(Post p) {
        cr.save(p);
        return p;
    }
    
}

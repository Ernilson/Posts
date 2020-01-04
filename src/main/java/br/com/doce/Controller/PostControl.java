/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Controller;

import br.com.doce.Model.Post;
import br.com.doce.ServiceImpl.CodeInteImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Convidado
 */
@Controller
public class PostControl {
    
    @Autowired
    private CodeInteImpl serve;

    
    @RequestMapping(value="/posts", method = RequestMethod.GET)
    public ModelAndView getPosts(){        
        ModelAndView mv = new ModelAndView();
        List<Post> posts = serve.listAll();
        mv.addObject(posts);
        return mv;
    }
}

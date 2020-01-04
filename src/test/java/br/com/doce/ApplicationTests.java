package br.com.doce;

import br.com.doce.Model.Post;
import br.com.doce.ServiceImpl.CodeInteImpl;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private CodeInteImpl imp;
    
	@Test
	public void contextLoads() {
            Post p = new Post();
            p.setAutor("Lima");
            p.setTitulo("teste");
            p.setText("texto");
            p.setData(LocalDate.now());
            imp.saveOrUpdate(p);
	}

}

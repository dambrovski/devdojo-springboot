package br.com.devdojo.awesome.endpoint;


import br.com.devdojo.awesome.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentEndpoint {

    public List <Student> listAll {

        return asList(new Student())
    }
}

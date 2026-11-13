package biblioteca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {

    @GetMapping
    public String inicio() {
        return "livros/inicio";
    }

    @GetMapping("/autores")
    public String autores() {
        return "livros/inicio";
    }

    @GetMapping("/categorias")
    public String categorias() {
        return "livros/inicio";
    }

    @GetMapping("/usuarios")
    public String usuarios() {
        return "livros/inicio";
    }

    @GetMapping("/emprestimos")
    public String emprestimos() {
        return "livros/inicio";
    }
}

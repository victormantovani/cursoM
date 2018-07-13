package br.com.mantovs.cursoMc.resourses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mantovs.cursoMc.domain.Categoria;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResourse {
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat = new Categoria(1,"Mantovs Company");
		Categoria cat1 = new Categoria(2,"Catini Company");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat);
		lista.add(cat1);
		
		return lista;
	}
}

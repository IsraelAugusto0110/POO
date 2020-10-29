package com.fatec.testeSpring.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.testeSpring.modelo.Pessoa;
import com.fatec.testeSpring.repositorio.PessoaRepositorio;

@Controller
public class PessoaControle {
	
	@Autowired
	private PessoaRepositorio pr;
	
	@RequestMapping(value = "/cadastrar-pessoa", method = RequestMethod.POST)
	public String cadastrar(Pessoa pessoa) {
		pr.save(pessoa);
		return "redirect:/pessoas";
	}
	
	@RequestMapping(value = "/pessoas", method = RequestMethod.GET)
	public ModelAndView listaPessoas() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("pessoas");
		Iterable<Pessoa> pessoas= pr.findAll();
		mv.addObject("listaPessoas", pessoas);
		return mv;
	}
	
	@RequestMapping(value = "/excluir-pessoa/{id}", method = RequestMethod.GET)
	public String excluir(@PathVariable long id) {
		Pessoa qualquer = pr.findById(id);
		pr.delete(qualquer);
		return "redirect:/pessoas";
	}
}

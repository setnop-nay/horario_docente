package br.com.horario_docente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    
	@GetMapping("/") //nome que eu quiser colocar
	public String principal()
	{
		return "principal"; //caminho real do arquivo
	
	}
@GetMapping("/principal") //nome que eu quiser colocar
public String home()
{
	return "principal"; //caminho real do arquivo
}
@GetMapping("/docente") //nome que eu quiser colocar
public String docente()
{
	return "docente"; //caminho real do arquivo
}

@PostMapping("/salvar_docente")
public ModelAndView save(
		ModelMap model,
		@ModelAttribute("docenteEntity") DocenteEntity docenteEntity,
		 RedirectAttributes atributes) throws Exception
{



        System.out.printin("Nome :" + docenteEntity.getNome());
        ModelAndView mv = new ModelAndView("redirect:/docente");
        /*atributes.addFlashAttribute("mensagem" ,docenteService.save(docenteEntity));
       */
       return mv;
}



}
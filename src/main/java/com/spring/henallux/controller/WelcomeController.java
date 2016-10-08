package com.spring.henallux.controller;

//import org.apache.commons.logging.Log;
import java.util.logging.*;
//import org.eclipse.jdt.internal.compiler.batch.Main.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.MagicKeyForm;

@Controller
@RequestMapping(value="/welcome")
public class WelcomeController {
	private static final Logger LOGGER = java.util.logging.Logger.getLogger( WelcomeController.class.getName() );
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model){
		model.addAttribute("magicKeyForm", new MagicKeyForm());
		return "integrated:welcome";
	}
	@RequestMapping(value="/send",method=RequestMethod.POST)
	public String getFormData(Model model, @ModelAttribute(value="magicKeyForm") MagicKeyForm form){

		
		LOGGER.warning(form.getMagicKey());
		if(form.getMagicKey().equals("Hello")){
			return "redirect:/inscription";
		}
		return "integrated:keyError";
	}
}

package com.SkillsToLearn.onlinehotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SkillsToLearn.onlinehotel.dao.UserDao;
import com.SkillsToLearn.onlinehotel.formbean.UserFormBean;
import com.SkillsToLearn.onlinehotel.model.UserBean;
import com.SkillsToLearn.onlinehotel.repository.UserRepository;
import com.SkillsToLearn.onlinehotel.validator.UserValidator;
 


@Controller
@Component("userDao")
public class RegisterController {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserValidator userValidate;
	
	
	protected void initBinder(WebDataBinder dataBinder) {
	      // Form target
	      Object target = dataBinder.getTarget();
	      if (target == null) {
	         return;
	      }
	      System.out.println("Target=" + target);
	 
	      if (target.getClass() == UserFormBean.class) {
	    	  dataBinder.setValidator((org.springframework.validation.Validator) userValidate);
	      }
	   }
	
	@RequestMapping("/")
	public String viewHome(Model model) {
	      return "welcomePage";
	   }
	
	@RequestMapping("/members")
	public String viewMembers(Model model) {
	 
	      List<UserFormBean> list = userRepository.findAll();
	      model.addAttribute("members", list);
	      return "membersPage";
	   }
	
	@RequestMapping("/success")
	public String viewRegisterSuccessful(Model model) {
	      return "successPage";
	   }
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewRegister(Model model) {
	 
	      UserFormBean form = new UserFormBean();
	      model.addAttribute("appUserForm", form);
	      return "registerPage";
	   }
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	   public String saveRegisteration(Model model, @ModelAttribute("userFormBean") @Validated UserFormBean userFormBean, 
			   BindingResult result, final RedirectAttributes redirectAttributes) {
	 
	      
	      UserBean newUser= null;
	      try {
//	         newUser = userDao.createUser(userFormBean);
	    	  	userRepository.save(userFormBean);
	      }
	      // Other error!!
	      catch (Exception e) {
	         model.addAttribute("errorMessage", "Error: " + e.getMessage());
	         return "registerPage";
	      }
	 
	      redirectAttributes.addFlashAttribute("flashUser", newUser);
	       
	      return "redirect:/success";
	   }
	

}

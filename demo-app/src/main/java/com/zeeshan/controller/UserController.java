package com.zeeshan.controller;

import java.text.ParseException;
import java.time.Period;
import static com.zeeshan.util.DateUtil.calculateDate;
import java.util.Locale;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zeeshan.model.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String userForm(Locale locale, Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model)
			throws ParseException {

		if (result.hasErrors()) {
			return "userForm";
		}

		Period period = calculateDate(user.getDob());
		model.addAttribute("days", period.getDays());
		model.addAttribute("months", period.getMonths());
		model.addAttribute("years", period.getYears());
		
		return "success";
	}
}

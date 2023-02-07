package com.hasan.ninjaGoldGame;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {
	
	@RequestMapping("/activities")
	public String displayActivity() {
		return "activities.jsp";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/")
	public String index(HttpSession session,
			@RequestParam(value="farm",required=false) String farm,
			@RequestParam(value="cave",required=false) String cave,
			@RequestParam(value="house",required=false) String house,
			@RequestParam(value="quest",required=false) String quest
			) {
		ArrayList<String> activities = new ArrayList<String>();
		activities.add("Testing ArrayList ");
		for(String element:activities) {
			System.out.println(element);
		}
		int gold = 0;
		SimpleDateFormat simpleFormat = new SimpleDateFormat("MMMM d Y h:mm a");
		
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold",gold);
		} else {
			gold = (int) session.getAttribute("gold");
		}
		
		if(session.getAttribute("activities")==null) {
			session.setAttribute("activites", activities);
		} else {
			activities = (ArrayList<String>) session.getAttribute("activities");
		}
		
		if(farm !=null) {
			int change = (int)(Math.random()*11+10);
			gold+= change;
			activities.add("You entered a farm and earned "+change+" gold. ("+simpleFormat.format(new Date())+")");
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			return "redirect:/";
		}
		if(cave !=null) {
			int change = (int)(Math.random()*6+5);
			gold+= change;
			activities.add("You entered a cave and earned "+change+" gold. ("+simpleFormat.format(new Date())+")");
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			return "redirect:/";
		}
		if(house !=null) {
			int change = (int)(Math.random()*4+2);
			gold+= change;
			activities.add("You entered a house and earned "+change+" gold. ("+simpleFormat.format(new Date())+")");
			session.setAttribute("gold", gold);
			session.setAttribute("activities", activities);
			return "redirect:/";
		}
		if(quest !=null) {
			int change = (int)(Math.random()*101-50);
			gold+= change;
			session.setAttribute("gold", gold);
			if (change>=0) {
				activities.add("You completed a quest and earned "+change+" gold. ("+simpleFormat.format(new Date())+")");	
			} else {
				change*=-1;
				activities.add("You failed a quest and lost "+change+" gold. ("+simpleFormat.format(new Date())+")");	
			}
			session.setAttribute("activities", activities);
			return "redirect:/";
		}
		
		return "index.jsp";
	}
}

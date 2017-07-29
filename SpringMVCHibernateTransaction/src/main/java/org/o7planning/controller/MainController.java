package org.o7planning.controller;

import java.util.List;

import org.o7planning.dao.DepartmentDAO;
import org.o7planning.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@Autowired
	DepartmentDAO departmentDAO;

	@RequestMapping({ "/", "/home", "/index" })
	public String home(Model model) {
		return "index";
	}

	@RequestMapping(value="/deptList", method=RequestMethod.GET)
	public String deptList(Model model) {
		/*departmentDAO.createDepartment("Dept Name", "Dept Location");*/

		List<Department> list = departmentDAO.listDepartment();
		for (Department dept : list) {
			System.out.println("Dept No " + dept.getDeptNo());
		}
		model.addAttribute("departments", list);
		return "deptList";
	}
}


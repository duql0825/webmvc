package kr.mem.frontcontroller;

import java.util.HashMap;
import java.util.Map;

import kr.mem.controller.Controller;
import kr.mem.controller.MemberContentController;
import kr.mem.controller.MemberDeleteController;
import kr.mem.controller.MemberFormController;
import kr.mem.controller.MemberInsertController;
import kr.mem.controller.MemberListController;
import kr.mem.controller.MemberUpdateController;

public class HandlerMapping {
	// key value
	private Map<String, Controller> mappings;
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		initUrl();
	}
	public void initUrl() {
		mappings.put("/list.do", new MemberListController());
		mappings.put("/delete.do", new MemberDeleteController());
		mappings.put("/insert.do", new MemberInsertController())		
		mappings.put("/content.do", new MemberContentController());
		mappings.put("/update.do", new MemberUpdateController());
		mappings.put("/memberform.do", new MemberFormController());
	}
	public Controller getController(String key) {
		return mappings.get(key);
	}
}

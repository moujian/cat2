package org.unidal.cat.core.report.menu;

import java.util.List;

import org.unidal.web.mvc.ActionContext;

public interface MenuManager {
	public List<Menu> getMenus(ActionContext<?> ctx);

	public void register(String id, String title, String styleClasses, MenuLinkBuilder builder);
}

package com.soku.web;

import javax.servlet.http.HttpServletRequest;

public class Utils {

	public static int getParamInt(HttpServletRequest request, String key, int def) {

		return getParamInt(request, key) == 0 ? def : getParamInt(request, key);
	}

	public static int getParamInt(HttpServletRequest request, String key) {
		String param = request.getParameter(key);
		int result = parseStringToint(param);

		return result;
	}

	public static int parseStringToint(String val) {
		try {
			return Integer.parseInt(val);

		} catch (Exception e) {}

		return 0;
	}

}

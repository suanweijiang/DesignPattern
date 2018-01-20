package top.suanwj.designmode.chainofresponsibility;

public class SensitiveFilter implements Filter {

	public String doFilter(String str) {
		return str.replaceAll("敏感", "**");
	}

	public void doFilter(Request request, Response response) {
		request.setRequestStr(request.getRequestStr() + "---sensitiveFilter---");
		response.setResponseStr(response.getResponseStr() + "---sensitiveFilter---");
	}

	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequestStr(request.getRequestStr() + "---sensitiveFilter---");
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr() + "---sensitiveFilter---");
	}

}

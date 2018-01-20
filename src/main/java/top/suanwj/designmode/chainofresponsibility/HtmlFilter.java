package top.suanwj.designmode.chainofresponsibility;

public class HtmlFilter implements Filter {

	public String doFilter(String str) {
		return str.replaceAll("<", "[")
				.replaceAll(">", "]");
	}

	public void doFilter(Request request, Response response) {
		request.setRequestStr(request.getRequestStr() + "---htmlFilter---");
		response.setResponseStr(response.getResponseStr() + "---htmlFilter---");
	}

	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequestStr(request.getRequestStr() + "---htmlFilter---");
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr() + "---htmlFilter---");
		
	}

}

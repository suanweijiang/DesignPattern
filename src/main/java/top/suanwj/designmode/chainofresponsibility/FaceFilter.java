package top.suanwj.designmode.chainofresponsibility;

public class FaceFilter implements Filter {

	public String doFilter(String str) {
		return str.replaceAll(":\\)", "*w*");
	}

	public void doFilter(Request request, Response response) {
		request.setRequestStr(request.getRequestStr() + "---faceFilter---");
		response.setResponseStr(response.getResponseStr() + "---faceFilter---");
	}

	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequestStr(request.getRequestStr() + "---faceFilter---");
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr() + "---faceFilter---");
	}

}

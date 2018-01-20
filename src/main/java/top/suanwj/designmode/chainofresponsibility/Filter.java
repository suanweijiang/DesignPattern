package top.suanwj.designmode.chainofresponsibility;

public interface Filter {
	
	public String doFilter(String str);
	
	public void doFilter(Request request, Response response);
	
	public void doFilter(Request request, Response response, FilterChain chain);
}

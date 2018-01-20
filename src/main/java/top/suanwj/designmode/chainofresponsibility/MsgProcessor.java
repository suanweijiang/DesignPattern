package top.suanwj.designmode.chainofresponsibility;

public class MsgProcessor {
	
	public String process(String msg) {
		FilterChain fc = new FilterChain();
		fc.add(new HtmlFilter())
			.add(new SensitiveFilter());
		
		FilterChain fc2 = new FilterChain();
		fc2.add(new FaceFilter());
		
		fc2.add(fc);
		
		String r = fc2.doFilter(msg);
		return r;
	}

	public void process(Request request, Response response) {
		FilterChain fc = new FilterChain();
		fc.add(new HtmlFilter())
			.add(new SensitiveFilter());
			
		fc.doFilter(request, response, fc);
				
	}
	
}

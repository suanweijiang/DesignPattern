package top.suanwj.designmode.chainofresponsibility;

/**
 * ChainOfResponsibility 责任链
 * @author suanwj
 *
 */
public class Main {
	public static void main(String[] args) {
		String msg = String.format("字符串，<script>, :), 敏感，词汇");
		
		Request request = new Request();
		request.setRequestStr("request");
		Response response = new Response();
		response.setResponseStr("reponseStr");
		
		MsgProcessor mp = new MsgProcessor();
		
		String processMsg = mp.process(msg);
		
		mp.process(request, response);
		
		System.out.println(processMsg);
		
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
		
	}
}

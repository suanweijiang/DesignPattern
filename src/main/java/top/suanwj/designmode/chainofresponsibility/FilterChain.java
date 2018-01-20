package top.suanwj.designmode.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链可以当作一个Filter
 * @author suanwj
 *
 */
public class FilterChain implements Filter {

	private List<Filter> filters = new ArrayList<Filter>();
	
	private int index = 0;
	
	public FilterChain add(Filter filter) {
		filters.add(filter);
		return this;
	}
	
	public String doFilter(String str) {
		for (Filter f : filters) {
			str = f.doFilter(str);
		}
		return str;
	}

	public void doFilter(Request request, Response response) {
		for (Filter f : filters) {
			f.doFilter(request, response);
		}		
	}

	public void doFilter(Request request, Response response, FilterChain chain) {
		if (index == filters.size()) return;
		Filter f = chain.filters.get(index);
		index ++;
		f.doFilter(request, response, chain);
	}
	
}

package interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class IndexInterceptor extends HandlerInterceptorAdapter{
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) {
		System.out.println("preHandle(),在controller之前被调用");
		return true;
	}
	
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) {
		System.out.println("postHandle(),在访问controller之后，访问视图之前调用，这里可以注入object");
		modelAndView.addObject("date", "由拦截器生成的时间"+new Date());
	}
	
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception{
		System.out.println("afterCompletion(),在访问视图之后被调用");
		
	}

}

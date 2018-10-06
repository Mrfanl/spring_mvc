package interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class IndexInterceptor extends HandlerInterceptorAdapter{
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) {
		System.out.println("preHandle(),��controller֮ǰ������");
		return true;
	}
	
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) {
		System.out.println("postHandle(),�ڷ���controller֮�󣬷�����ͼ֮ǰ���ã��������ע��object");
		modelAndView.addObject("date", "�����������ɵ�ʱ��"+new Date());
	}
	
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception{
		System.out.println("afterCompletion(),�ڷ�����ͼ֮�󱻵���");
		
	}

}

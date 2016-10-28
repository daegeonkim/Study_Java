package sis.security;

import java.lang.reflect.*;
import java.util.*;

public class SecureProxy implements InvocationHandler{
	private List<String> secureMethods;
	private Object target;
	
	
	public SecureProxy(Object target, String... secureMethods) {
		this.target = target;
		this.secureMethods = Arrays.asList(secureMethods);
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try{
			if (isSecure(method))
				throw new PermissionException();
			return method.invoke(target, args);
		}
		catch(InvocationTargetException e){
			throw e.getTargetException();
		}
	}

	private boolean isSecure(Method method){
		return secureMethods.contains(method.getName());
	}


}



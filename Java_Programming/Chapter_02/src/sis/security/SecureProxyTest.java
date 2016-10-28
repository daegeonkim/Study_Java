package sis.security;

import junit.framework.TestCase;
import java.lang.reflect.*;

public class SecureProxyTest extends TestCase{
	private static final String secureMethodName = "secure";
	private static final String insecureMethodName = "insecure";
	private SecureProxy proxy;
	private Object object;
	private boolean secureMethodCalled;
	private boolean insecureMethodCalled;
	
	protected void setUp(){
		object = new Object(){
			public void secure(){
				secureMethodCalled = true;
			}
			public void insecure(){
				insecureMethodCalled = true;
			}
		};
		
		proxy = new SecureProxy(object, secureMethodName);
	}
	
	public void testSecureMethod() throws Throwable{
		Method secureMethod = 
				object.getClass().getDeclaredMethod(secureMethodName, new Class[]{});
		try{
			proxy.invoke(proxy, secureMethod, new Object[]{});
			fail("expected PermossionException");
		}catch(PermissionException expected){
			assertFalse(secureMethodCalled);
		}
	}

	public void testInsecureMethod()throws Throwable{
		Method insecureMethod = object.getClass().getDeclaredMethod(insecureMethodName, new Class[]{});
		proxy.invoke(proxy, insecureMethod, new Object[]{});
	}
}


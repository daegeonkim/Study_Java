package sis.studentinfo;

import java.lang.reflect.*;
import sis.security.*;

public class AccountFactory {
	public static Accountable create(Permission permission){
		switch(permission){
			case UPDATE:
				return new Account();
			case READE_ONLY:
				return createSecureAccount();
		}
		return null;
	}

	
	private static Accountable createSecureAccount(){
		SecureProxy secureAccount = new SecureProxy(new Account(), "credit", "setBankAba", "setBankAccountType", "transferFromBank");
		return (Accountable) Proxy.newProxyInstance(Accountable.class.getClassLoader(), new Class[]{Accountable.class}, secureAccount);
	}
	
}

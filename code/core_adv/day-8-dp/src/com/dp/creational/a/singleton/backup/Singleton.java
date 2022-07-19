package com.dp.creational.a.singleton.backup;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum
 */
public class Singleton {
	// lazy and eager initiization of ur singleton object
	private static Singleton mySingleton = new Singleton();

	private Singleton() {}
	
//	 lazy
//	 t1 and t2 wann to call this method at the same time
//	 Double-Checked Locking with Singleton
	public  static Singleton getSingleton() {
		if (mySingleton == null) {
			synchronized (Singleton.class) {
				if (mySingleton == null) {
					mySingleton = new Singleton();//3 steps
				}
			}
		}
		return mySingleton;
	}

//	private static class InstanceHolder{
//		private volatile  static Singleton mySingleton = new Singleton();
//		
//	}
//	
//	public  static Singleton getSingleton() {
//		return InstanceHolder.mySingleton;
//	}

}

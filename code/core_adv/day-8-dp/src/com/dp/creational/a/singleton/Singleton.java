package com.dp.creational.a.singleton;

import java.io.Serializable;

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
public class Singleton implements Serializable , Cloneable{
	private static final long serialVersionUID = 1L;

	private static Singleton mySingleton = new Singleton();

	private Singleton() {
		if(mySingleton!=null)
			throw new IllegalStateException();
	}

	public static Singleton getSingleton() {
		if (mySingleton == null) {
			synchronized (Singleton.class) {
				if (mySingleton == null) {
					mySingleton = new Singleton();// 3 steps
				}
			}
		}
		return mySingleton;
	}

    //hey programmer if u define this method i will give u 
	// gurantee to call this method before de-ser
	// i will by pass de-ser
	private Object readResolve() {
		return mySingleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return mySingleton;
	}
	
	
}

package org.apache.log4j.helpers;

import java.util.Enumeration;

public class NullEnumeration implements Enumeration {

	public boolean hasMoreElements() {
		return false;
	}

	public Object nextElement() {
		return null;
	}
}

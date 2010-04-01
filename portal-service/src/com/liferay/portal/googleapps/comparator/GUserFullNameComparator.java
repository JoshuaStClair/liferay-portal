/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.googleapps.comparator;

import com.liferay.portal.googleapps.GUser;

import java.util.Comparator;

/**
 * <a href="GUserFullNameComparator.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public class GUserFullNameComparator implements Comparator<GUser> {

	public GUserFullNameComparator() {
		this(true);
	}

	public GUserFullNameComparator(boolean ascending) {
		_ascending = ascending;
	}

	public int compare(GUser user1, GUser user2) {
		String fullName1 = user1.getFullName();
		String fullName2 = user2.getFullName();

		int value = fullName1.compareTo(fullName2);

		if (_ascending) {
			return value;
		}
		else {
			return -value;
		}
	}

	private boolean _ascending;

}
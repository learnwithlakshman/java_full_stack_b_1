package com.nubes.cj.cbook.util;

import java.util.UUID;

public final class ContactUtil {

	private ContactUtil() {

	}

	public static String generateId() {
		String prefix = "NUBES-";
		String suffix = "-IND";
		String uuid = UUID.randomUUID().toString();
		String id = prefix + uuid + suffix;
		return id;
	}
}

package com.javapractice.mypractice.immutable;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableUser {

	private final String userName;
	private final int age;
	private final Map<String, String> metadata;

	public ImmutableUser(String userName, int age, Map<String, String> metadata) {
		this.userName = userName;
		this.age = age;
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metadata = tempMap;
	}

	public String getUserName() {
		return userName;
	}

	public int getAge() {
		return age;
	}

	public Map<String, String> getMetadata() {
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
}

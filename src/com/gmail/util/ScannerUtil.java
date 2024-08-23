package com.gmail.util;

import java.util.Scanner;

public class ScannerUtil {
	private static ScannerUtil instance;
	private Scanner scanner = new Scanner(System.in);

	private ScannerUtil() {

	}

	public static ScannerUtil getInstance() {
		if (instance == null) {
			instance = new ScannerUtil();
		}
		return instance;
	}

	public byte getByteValue() {
		byte value;
		do {
			if (scanner.hasNextByte()) {
				value = scanner.nextByte();
				scanner.nextLine();
				break;
			} else {
				System.out.println("Enter valid value");
				scanner.nextLine();
			}
		} while (true);
		return value;
	}

	public String getStringValue() {
		return scanner.nextLine();
	}
}

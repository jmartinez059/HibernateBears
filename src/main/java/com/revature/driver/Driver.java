package com.revature.driver;

import java.util.Scanner;

import org.hibernate.Session;

import com.revature.entities.HoneyPot;
import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session sess = SessionUtil.getSession();
		System.out.println("Please enter id:");
		Scanner in = new Scanner(System.in);
		int next = in.nextInt();
		System.out.println(sess.get(HoneyPot.class, next));
		in.close();
	}

}

package com.epam.lab.hw3.Task3;

import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
	final static Logger LOG = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Task3.class);
		for (Failure failure : result.getFailures()) {
			LOG.info(failure.toString());
		}
		LOG.info(result.wasSuccessful());
	}
}

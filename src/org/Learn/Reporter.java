package org.Learn;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.internal.IResultListener;
import org.testng.xml.XmlSuite;

public class Reporter implements IReporter {

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		for (ISuite iSuite : suites) {
			
			
		}
	}
}

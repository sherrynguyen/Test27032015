package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class GigaTest {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox c:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "http://www.gigabyte.com/");
		selenium.start();
	}

	@Test
	public void testGiga() throws Exception {
		selenium.open("/");
		selenium.click("css=a.nivo-imageLink");
		selenium.click("id=header_3");
		selenium.waitForPageToLoad("30000");
		selenium.select("id=country_h", "label=Austria");
		selenium.click("id=classk_h");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}

package com.hectorlopezfernandez.pebble.time;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.loader.ClasspathLoader;
import com.mitchellbosecke.pebble.loader.Loader;

@RunWith(JUnit4.class)
public class TimeExtensionTests {

	private static PebbleEngine engine;

	@BeforeClass
	public static void setup() {
		TimeExtension e = new TimeExtension();
		Loader<String> l = new ClasspathLoader();
		engine = new PebbleEngine.Builder().loader(l).extension(e).build();
	}

}
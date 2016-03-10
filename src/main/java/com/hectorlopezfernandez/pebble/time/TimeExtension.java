package com.hectorlopezfernandez.pebble.time;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mitchellbosecke.pebble.extension.AbstractExtension;
import com.mitchellbosecke.pebble.extension.Filter;
import com.mitchellbosecke.pebble.extension.Function;
import com.mitchellbosecke.pebble.tokenParser.TokenParser;

public class TimeExtension extends AbstractExtension {

	public TimeExtension() {
	}

	@Override
	public Map<String, Filter> getFilters() {
		Map<String, Filter> filters = new HashMap<>();
		return filters;
	}

	@Override
	public Map<String, Function> getFunctions() {
		Map<String, Function> functions = new HashMap<>();
		return functions;
	}

	@Override
	public List<TokenParser> getTokenParsers() {
		List<TokenParser> parsers = new ArrayList<>();
		return parsers;
	}

}
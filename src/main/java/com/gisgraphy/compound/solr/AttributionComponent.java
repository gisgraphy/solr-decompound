package com.gisgraphy.compound.solr;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.solr.handler.component.ResponseBuilder;
import org.apache.solr.handler.component.SearchComponent;

public class AttributionComponent extends SearchComponent{
	
	@Override
	public void prepare(ResponseBuilder rb) throws IOException {
		
	}

	@Override
	public void process(ResponseBuilder rb) throws IOException {
		Map<String, String> attributions = new HashMap<String, String>();
		attributions.put("attribution", "http://www.gisgraphy.com/attributions.html");
		
		rb.rsp.add("attributions", attributions);
		
	}

	@Override
	public String getDescription() {
		return "Add Contributions to response";
	}

	@Override
	public String getSource() {
		return "Gisgraphy";
	}

	@Override
	public String getSourceId() {
		return "1.0.1";
	}

	@Override
	public String getVersion() {
		return "1.0.1";
	}

}

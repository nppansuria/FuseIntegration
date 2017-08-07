package com.java.camel;

import java.io.InputStream;
import java.util.zip.InflaterInputStream;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class UncompressProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-- In Uncompression Processor --");
		
		InputStream is = exchange.getIn().getBody(InputStream.class);
		InflaterInputStream UncompressStream = new InflaterInputStream(is);
		exchange.getIn().setBody(UncompressStream);

	}

}

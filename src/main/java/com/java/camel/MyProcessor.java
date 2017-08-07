package com.java.camel;

import java.io.InputStream;
import java.util.zip.DeflaterInputStream;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("++ In Compression Processor ++");

		InputStream is = exchange.getIn().getBody(InputStream.class);
		DeflaterInputStream CompressStream = new DeflaterInputStream(is);
        exchange.getIn().setBody(CompressStream);

	}

}

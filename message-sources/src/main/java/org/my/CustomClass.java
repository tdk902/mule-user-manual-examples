package org.my;

import org.mule.api.processor.MessageProcessor;
import org.mule.api.source.MessageSource;

public class CustomClass implements MessageSource {

	@Override
	public void setListener(MessageProcessor listener) {
		// intentionally empty
	}
	
	public void setThreads(int threads) {
		// intentionally empty		
	}

}

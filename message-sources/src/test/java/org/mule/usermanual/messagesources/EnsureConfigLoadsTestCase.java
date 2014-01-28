package org.mule.usermanual.messagesources;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class EnsureConfigLoadsTestCase extends FunctionalTestCase {

	@Override
	protected String getConfigResources() {
		return "src/main/app/message-sources.xml";
	}
	
	@Test
	public void ensureConfigLoads() {
	}

}

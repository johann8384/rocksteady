package com.admob.rocksteady.reactor;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class Console implements UpdateListener {
	private static final Logger logger = LoggerFactory
			.getLogger(Alerting.class);

	@Override
	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		// TODO Auto-generated method stub
		if (newEvents == null) {
			logger.debug("newEvents is null");
			return;
		}

		for (EventBean newEvent : newEvents) {
			try {
				String msg = newEvent.get("hostservicescritical").toString();
				logger.info(msg);
			} catch (Exception e) {
				logger.error("Error: " + newEvent.toString() + " - "
						+ e.getMessage());
			}

		}
		for (EventBean newEvent : oldEvents) {
			try {
				String msg = newEvent.get("hostservicescritical").toString();
				logger.info(msg);
			} catch (Exception e) {
				logger.error("Error: " + newEvent.toString() + " - "
						+ e.getMessage());
			}

		}
	}

}

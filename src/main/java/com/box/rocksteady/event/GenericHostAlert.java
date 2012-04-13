package com.box.rocksteady.event;

public class GenericHostAlert {
	private String type;
	private String hostname;
	private String hostaddress;
	private String comments;
	private String datetime;
	private Long hostservicescritical;

	private String hoststate;
	private String hostoutput;
	private Long hostsup;
	private Long hostsdown;

    public GenericHostAlert() {
    	
    }
}

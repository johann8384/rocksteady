package com.admob.rocksteady.event;
/**
 * POJO class to take on metrics
 * 
 */
public class Nagios {
	
	// HOST "$NOTIFICATIONTYPE$" "$HOSTNAME$" "$HOSTSTATE$" "$HOSTADDRESS$"
	// "$HOSTOUTPUT$" "$NOTIFICATIONCOMMENT$" "$LONGDATETIME$"
	// SERVICE "$NOTIFICATIONTYPE$" "$HOSTNAME$" "$SERVICEDESC$"
	// "$SERVICESTATE$" "$HOSTADDRESS$" "$SERVICEOUTPUT$"
	// "$NOTIFICATIONCOMMENT$" "$LONGDATETIME$"

	public String type;
	public String hostname;
	public String hostaddress;
	public Long duration;
	public String comments;
	public Long datetime;
	public Long hostservicescritical;

	public String desc;
	public String state;
	public String output;
	public Long critical;
	public Long ok;
	/*
	public String hoststate;
	public String hostoutput;
	public Long hostsup;
	public Long hostsdown;

	public String servicedesc;
	public String servicestate;
	public String serviceoutput;
	public Long servicesok;
	public Long servicescritical;
*/
	// Instantiate metric object with a piece of graphite metric
	public Nagios(String data) {
				// ComplexEventManager.getInstance().sendEvent(obj);
	}

	public Nagios() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getHostaddress() {
		return hostaddress;
	}

	public void setHostaddress(String hostaddress) {
		this.hostaddress = hostaddress;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Long getDatetime() {
		return datetime;
	}

	public void setDatetime(Long datetime) {
		this.datetime = datetime;
	}

	public Long getHostservicescritical() {
		return hostservicescritical;
	}

	public void setHostservicescritical(Long hostservicescritical) {
		this.hostservicescritical = hostservicescritical;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public Long getCritical() {
		return critical;
	}

	public void setCritical(Long critical) {
		this.critical = critical;
	}

	public Long getOk() {
		return ok;
	}

	public void setOk(Long ok) {
		this.ok = ok;
	}

	@Override
	public String toString() {
		return "Nagios [type=" + type + ", hostname=" + hostname
				+ ", hostaddress=" + hostaddress + ", duration=" + duration
				+ ", comments=" + comments + ", datetime=" + datetime
				+ ", hostservicescritical=" + hostservicescritical + ", desc="
				+ desc + ", state=" + state + ", output=" + output
				+ ", critical=" + critical + ", ok=" + ok + "]";
	}

}
package spittr;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spittle {
	private final Long id;
	private final String message;
	private final Date time;
	private Double latitude;
	private Double longitude;
	
	public Spittle(String message, Date time) {
		this(message, time, null, null);
	}
	
	public Spittle(String message, Date time, Double longitDouble, Double latitude) {
		this.id = null;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitDouble;
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "time");
	}

	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "id", "time");
	}
	
	
}

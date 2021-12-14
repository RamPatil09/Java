package com.xworkz.tasks.dto;

public class CastDTO {
	private int castId;
	private String actorName;
	private String directorName;
	private String producerName;
	private String actressName;
	
	

	public CastDTO(int castId, String actorName, String directorName, String producerName, String actressName) {
		this.castId = castId;
		this.actorName = actorName;
		this.directorName = directorName;
		this.producerName = producerName;
		this.actressName = actressName;
	}

	public int getCastId() {
		return castId;
	}

	public void setCastId(int castId) {
		this.castId = castId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getActressName() {
		return actressName;
	}

	public void setActressName(String actressName) {
		this.actressName = actressName;
	}

	@Override
	public String toString() {
		return "CastDTO [\nCastId=" + castId + ", \nActorName=" + actorName + ", \nDirectorName=" + directorName
				+ ", \nProducerName=" + producerName + ", \nActressName=" + actressName + "\n]";
	}

}


package com.xworkz.tasks.dto;

public class EquipmentsDTO {

	private int equipmentsId;
	private String equipmentsName;
	
	public EquipmentsDTO(int equipmentsId, String equipmentsName) {
		super();
		this.equipmentsId = equipmentsId;
		this.equipmentsName = equipmentsName;
	}

	public void setEquipmentsId(int equipmentsId) {
		this.equipmentsId = equipmentsId;
	}

	public int getEquipmentsId() {
		return equipmentsId;
	}

	public void setEquipmentsName(String equipmentsName) {
		this.equipmentsName = equipmentsName;
	}

	public String getEquipmentsName() {
		return equipmentsName;
	}

	@Override
	public String toString() {
		return "EquipmentsDTO--- {\nEquipmentsId=" + this.equipmentsId + ", \nEquipmentsName=" + this.equipmentsName
				+ "\n}";
	}

}

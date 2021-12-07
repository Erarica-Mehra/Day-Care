package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ImmunizationRecord {
	
	private List<Vaccine> immunizationRecord = new ArrayList<>();
	
	public List<Vaccine> getImmunizationRecord() {
		return immunizationRecord;
	}

	public void setImmunizationRecord(List<Vaccine> immunizationRecord) {
		this.immunizationRecord = immunizationRecord;
	}
	
	public List<Vaccine> getStudentImmunizationRecord(List<String> data){
		
		for(String vaccineDetails : data) {
			if(vaccineDetails != null) {
				immunizationRecord.add(new Vaccine(vaccineDetails));
			}
		}
		
		return immunizationRecord;
	}

	
}
package edu.neu.csye6200;

import java.time.LocalDate;
import java.util.List;

public class Vaccine {

	private String name;
	private int dosesCount; // counter to keep track of doses
	private List<LocalDate> vaccinationRecord;

	public Vaccine(String name, String ageGroup, boolean exempted, List<LocalDate> vaccinationRecord) {
		super();
		this.name = name;
		this.vaccinationRecord = vaccinationRecord;
	}

//constructor to parse from CSV
// data in the format (eg: "HepatatisB:2020-10-12|2020-11-12|2020-12-12")
	public Vaccine(String vaccine) {
		String[] vaccineData = vaccine.split(":");
		this.name = vaccineData[0];
		String vaccinationDates = vaccineData[1];
		String[] dates = vaccinationDates.split("|");
		for (String value : dates) {
			vaccinationRecord.add(LocalDate.parse(value));
		}
	}

	public boolean isVaccinationCompleted() {
		return (dosesCount == vaccinationRecord.size());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<LocalDate> getVaccinationRecord() {
		return vaccinationRecord;
	}

	public void setVaccinationRecord(List<LocalDate> vaccinationRecord) {
		this.vaccinationRecord = vaccinationRecord;
	}

}

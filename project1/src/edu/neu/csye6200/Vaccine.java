package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Vaccine {

	private int id;
	private String name;
	private int dosestaken;
	private int totalDoses;
	private LocalDate lastShotDate;
	private LocalDate nextShotDate;
	private int studentId;
	private boolean isVaccinated;
	private List<LocalDate> vaccinationRecord = new ArrayList<>();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Vaccine(String name, List<LocalDate> vaccinationRecord, int studentId, boolean isVaccinated) {
		super();
		this.name = name;
		this.vaccinationRecord = vaccinationRecord;
		this.studentId = studentId;
		this.isVaccinated = isVaccinated;
		this.dosestaken = vaccinationRecord.size();
	}

//constructor to parse from CSV
//data in the format (eg: "HepatatisB:2020-10-12|2020-11-12|2020-12-12")
	public Vaccine(String vaccine, int studentId) {
		String[] vaccineData = vaccine.split(":");
		this.name = vaccineData[0];
		String vaccinationDates = vaccineData[1];
		String[] dates = vaccinationDates.split("&");
		for (String value : dates) {
			this.vaccinationRecord.add(LocalDate.parse(value, formatter));
		}
		this.studentId = studentId;
		this.lastShotDate = vaccinationRecord.get(vaccinationRecord.size() - 1);
		// TODO for now next shot date is one month from now
		// TODO fix this
		this.nextShotDate = vaccinationRecord.get(vaccinationRecord.size() - 1).plus(1, ChronoUnit.MONTHS);
	}

	public boolean isVaccinationCompleted() {
		return (totalDoses == vaccinationRecord.size());
	}

	public int getTotalDoses() {
		return totalDoses;
	}

	public void setTotalDoses(int totalDoses) {
		this.totalDoses = totalDoses;
	}

	public LocalDate getLastShotDate() {
		return lastShotDate;
	}

	public void setLastShotDate(LocalDate lastShotDate) {
		this.lastShotDate = lastShotDate;
	}

	public LocalDate getNextShotDate() {
		return nextShotDate;
	}

	public void setNextShotDate(LocalDate nextShotDate) {
		this.nextShotDate = nextShotDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public DateTimeFormatter getFormatter() {
		return formatter;
	}

	public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
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

	public int getDosestaken() {
		return dosestaken;
	}

	public void setDosestaken(int dosestaken) {
		this.dosestaken = dosestaken;
	}

}

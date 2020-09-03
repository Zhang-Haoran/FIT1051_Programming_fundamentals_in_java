package week11.inheritancePlus;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by Haoran Zhang on 16/05/2018.
 */


public class SalariedPlusOnCallEmployee extends SalariedEmployee{
    private double[] schedule = new double[8];
    private ArrayList<WorkRecord> workRecords;
    Window myWindow; // For printing to main window

    public SalariedPlusOnCallEmployee(String first, String last, String ssn, double salary, double[] workerSchedule) {
        super(first, last, ssn, salary);
        workRecords = new ArrayList<WorkRecord>(10);
        schedule = workerSchedule;
    }

    public void addWorkRecord(double hours, double pay, int dayNumber) {
        WorkRecord workRecordToAdd = new WorkRecord(hours, pay, dayNumber);
        workRecords.add(workRecordToAdd);
    }

    public boolean checkWorkRecords() {
        boolean retVal = true;
        double total = 0.0;

        for (int i = 0; i < schedule.length - 1; i++) {
            for (int j = 0; j < workRecords.size(); j++) {
                if (i == workRecords.get(j).getDayCode()) {
                    total += workRecords.get(j).getHoursWorked();
                }
            }
            if (!(total <= schedule[i])) {
                retVal = false;
            }
            total = 0;
        }

        return retVal;
    }

    @Override
    public double earnings() {
        double retVal = 0.0;

        retVal += getWeeklySalary(); // Base salary

        for (int i = 0; i < workRecords.size(); i++) {
            WorkRecord recordToCheck = workRecords.get(i); // Used in multiple spots so easier to make a new variable.
            retVal += (recordToCheck.getHoursWorked() * recordToCheck.getHourlyRate());
        }

        return retVal;
    }

    @Override
    public String toString() {
        String retVal = "";

        retVal += super.toString() + "\n";
        

        retVal += scheduleToString();

        return retVal;
    }

    public String scheduleToString() {
        String retVal = "";

        for (int i = 1; i < schedule.length; i++) {
            retVal += "day " + i + ": " + schedule[i] + "  ";
        }

        return retVal;
    }
}

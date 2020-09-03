package week11.inheritancePlus;

public class WorkRecord {
    private double hoursWorked;
    private int dayCodeWorked;
    private double hourlyRate;

    public WorkRecord(double hours, double agreedHourlyRate, int dayCode) {
      setHourlyRate(agreedHourlyRate);
      setDayCodeWorked(dayCode);
      setHoursWorked(hours);
    }
    //Mutators
    public boolean setHourlyRate(double agreedHourlyRate) {
        boolean retVal= false;
        if (agreedHourlyRate > 0.0 && agreedHourlyRate <350.0) {
            hourlyRate = agreedHourlyRate;
            retVal = true;
        }
        return retVal;
    }

    public void setDayCodeWorked(int dayCode) {
        if (dayCode >= 1 && dayCode <= 7) {
            dayCodeWorked = dayCode;
        }

    }

    public void setHoursWorked(double hours) {
        if (hours > 0.0 && hours <= 8.0) {
            hoursWorked = hours;
        }
    }
    //Accessors
    public int getDayCode() {
        return dayCodeWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public String toString() {
        String retValue = "";

        retValue += "Hours worked: " + hoursWorked;
        retValue += "Hourly rate: " + hourlyRate;
        retValue += "Day Code: " + dayCodeWorked;

        return retValue;
    }
}

import java.util.ArrayList;
public class StepTracker
{
 private int minSteps;
 private int totalSteps;
 private int numDays;
 private int numActiveDays;
 public stepTracker(int threshold)
 {
  minSteps = threshold;
  totalSteps = 0;
  numDays = 0;
  numActiveDays = 0;
} 
 public void addDailySteps(int steps)
 {
  totalSteps += steps;
  numDays++;
  if (steps >= minSteps)
  {
   numActiveDays++;
  }
 }
 public double averageSteps()
 {
  return numActiveDays;
 }
 public double averageSTeps()
 {
  if (numDays == 0)
  {
   return 0.0;
  }
  else
  {
   return (double)totalSteps/numDays;
  }
 }


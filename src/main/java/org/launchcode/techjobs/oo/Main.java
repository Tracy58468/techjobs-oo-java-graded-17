package org.launchcode.techjobs.oo;
public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        System.out.println(job1.toString());

        Job job2 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));


//        System.out.println("job2.toString()");
//        System.out.println(job2.toString());
//        System.out.println(System.lineSeparator());
        System.out.println("String.valueOf(job2.getName())");
        System.out.println(String.valueOf(job2.getName()));
        System.out.println(System.lineSeparator());

        job2.employerString = "Data not available";
        System.out.println("Job2 getEmployerString:  + job2.employerString()");
        System.out.println("Job2 getEmployerString: " + job2.employerString);
//        System.out.println("Job2 getName:  + job2.getName()");
//        System.out.println("Job2 getName: " + String.valueOf(job2.getName()));
//        System.out.println("Job2 getEmployer: " + String.valueOf(job2.employerString));
//        System.out.println("Job2 getLocation: " + String.valueOf(job2.locationString));
//        System.out.println("Job2 getPositionType: " + String.valueOf(job2.positionTypeString));
//        System.out.println("Job2 getCoreCompetency: " + String.valueOf(job2.coreCompetencyString));

//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }
    }

}

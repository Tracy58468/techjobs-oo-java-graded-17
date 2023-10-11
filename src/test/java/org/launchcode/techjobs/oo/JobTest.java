package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {

        // Act
        Job job1 = new Job();
        Job job2 = new Job();

        // Assert
        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {

        // Act
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Assert
        assertTrue(job1 instanceof Job);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

        String actualName = job1.getName();
        String actualEmployer = String.valueOf(job1.getEmployer());
        String actualLocation = String.valueOf(job1.getLocation());
        String actualPositionType = String.valueOf(job1.getPositionType());
        String actualCoreCompetency = String.valueOf(job1.getCoreCompetency());

        assertEquals("Product tester", actualName);
        assertEquals("ACME", actualEmployer);
        assertEquals("Desert", actualLocation);
        assertEquals("Quality control", actualPositionType);
        assertEquals("Persistence", actualCoreCompetency);

    }

    @Test
    public void testJobsForEquality() {

        // Act
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Assert
        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        // Act
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Assert
        String msg = "Custom toString method returns correct string.";
        String expected = System.lineSeparator() +
                "ID: 1" +
                System.lineSeparator() +
                "Name: Product tester" +
                System.lineSeparator() +
                "Employer: ACME" +
                System.lineSeparator() +
                "Location: Desert" +
                System.lineSeparator() +
                "Position Type: Quality control" +
                System.lineSeparator() +
                "Core Competency: Persistence" +
                System.lineSeparator();

        String actual = job1.toString();

        assertEquals(msg, expected, actual);

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        // Act
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Assert
        String msg = "Custom toString method returns correct string.";
        String expected = System.lineSeparator() +
                "ID: " + job1.getNextId() +
                System.lineSeparator() +
                "Name: Product tester" +
                System.lineSeparator() +
                "Employer: ACME" +
                System.lineSeparator() +
                "Location: Desert" +
                System.lineSeparator() +
                "Position Type: Quality control" +
                System.lineSeparator() +
                "Core Competency: Persistence" +
                System.lineSeparator();

        String actual = System.lineSeparator() +
                "ID: " + Job.getNextId() +
                System.lineSeparator() +
                "Name: " + job1.getName() +
                System.lineSeparator() +
                "Employer: " + job1.getEmployer() +
                System.lineSeparator() +
                "Location: " + job1.getLocation() +
                System.lineSeparator() +
                "Position Type: " + job1.getPositionType() +
                System.lineSeparator() +
                "Core Competency: " + job1.getCoreCompetency() +
                System.lineSeparator();

        assertEquals(msg, expected, actual);

    }

    @Test
    public void testToStringHandlesEmptyField() {

        // Act
        Job job2 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        // Assert
        String msg = "Custom toString method returns 'Data not available' for empty string.";

//        String emptyId = "ID: Data not available";
        String emptyName = "Name: Data not available";
        String emptyEmployer = "Employer: Data not available";
        String emptyLocation = "Location: Data not available";
        String emptyPositionType = "Position Type: Data not available";
        String emptyCoreCompetency = "Core Competency: Data not available";

        String expected = System.lineSeparator() +
                "ID: " + job2.getId() +
                System.lineSeparator() +
                emptyName +
                System.lineSeparator() +
                emptyEmployer +
                System.lineSeparator() +
                emptyLocation +
                System.lineSeparator() +
                emptyPositionType +
                System.lineSeparator() +
                emptyCoreCompetency +
                System.lineSeparator();


//        System.out.println("JobTest labels and data");
//        System.out.println(job2.toString());

        String actual = job2.toString();

        assertEquals(msg, expected, actual);

    }

}

// String.valueOf(job2.getName())

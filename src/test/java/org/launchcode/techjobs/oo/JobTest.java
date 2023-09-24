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
//        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Assert
        String msg = "Custom toString method returns correct string.";
        String expected = System.lineSeparator() +
                "ID:  " + Job.getNextId() +
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

//        String emptyId = "Data not available";
//        String emptyName = "Data not available";
//        String emptyEmployer = "Data not available";
//        String emptyLocation = "Data not available";
//        String emptyPositionType = "Data not available";
//        String emptyCoreCompetency = "Data not available";

        String actual = System.lineSeparator() +
                "ID:  " + String.valueOf(Job.getNextId()) +
                System.lineSeparator() +
                "Name: " + String.valueOf(job1.getName()) +
                System.lineSeparator() +
                "Employer: " + String.valueOf(job1.getEmployer()) +
                System.lineSeparator() +
                "Location: " + String.valueOf(job1.getLocation()) +
                System.lineSeparator() +
                "Position Type: " + String.valueOf(job1.getPositionType()) +
                System.lineSeparator() +
                "Core Competency: " + String.valueOf(job1.getCoreCompetency()) +
                System.lineSeparator();

        assertEquals(msg, expected, actual);

        /** Need to add the non-existent data part of this test. **/

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        // Act
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Assert
        String msg = "Custom toString method returns correct string.";
        String expected = System.lineSeparator() +
                "ID:  " + Job.getNextId() +
                System.lineSeparator() +
                "Name: Product tester" +
                System.lineSeparator() +
                "Employer: ACME" +
                System.lineSeparator() +
                "Location: Data not available" +
                System.lineSeparator() +
                "Position Type: Quality control" +
                System.lineSeparator() +
                "Core Competency: Persistence" +
                System.lineSeparator();

//        String emptyId = "Data not available";
//        String emptyName = "Data not available";
//        String emptyEmployer = "Data not available";
//        String emptyLocation = "Data not available";
//        String emptyPositionType = "Data not available";
//        String emptyCoreCompetency = "Data not available";

        String actual = System.lineSeparator() +
                "ID:  " + String.valueOf(Job.getNextId()) +
                System.lineSeparator() +
                "Name: " + String.valueOf(job1.getName()) +
                System.lineSeparator() +
                "Employer: " + String.valueOf(job1.getEmployer()) +
                System.lineSeparator() +
                "Location: " + String.valueOf(job1.getLocation()) +
                System.lineSeparator() +
                "Position Type: " + String.valueOf(job1.getPositionType()) +
                System.lineSeparator() +
                "Core Competency: " + String.valueOf(job1.getCoreCompetency()) +
                System.lineSeparator();

        assertEquals(msg, expected, actual);

    }

}


package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {

        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

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

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job1.getId(), job2.getId());

    }

}

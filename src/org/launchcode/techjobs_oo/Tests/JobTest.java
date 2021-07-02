package org.launchcode.techjobs_oo.Tests;

import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

import static org.junit.Assert.*;



public class JobTest {
    Job test_jobOne;
    Job test_jobTwo;
    Job test_jobThree;
    Job test_jobFour;

    @Before
    public void createTestObjects () {
        test_jobOne = new Job();
        test_jobTwo = new Job();
        test_jobThree = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        test_jobFour = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId () {
        assertTrue(test_jobTwo.getId() == test_jobOne.getId()+1);
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        assertEquals(true, test_jobThree.getName() instanceof String);
        assertEquals("Product Tester", test_jobThree.getName());
        assertEquals(true, test_jobThree.getEmployer() instanceof Employer);
        assertEquals("ACME", test_jobThree.getEmployer());
        assertEquals(true, test_jobThree.getLocation() instanceof Location);
        assertEquals("Desert", test_jobThree.getLocation());
        assertEquals(true, test_jobThree.getPositionType() instanceof PositionType);
        assertEquals("Quality Control", test_jobThree.getPositionType());
        assertEquals(true, test_jobThree.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_jobThree.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality () {
        assertFalse(test_jobThree.equals(test_jobFour));
    }
}

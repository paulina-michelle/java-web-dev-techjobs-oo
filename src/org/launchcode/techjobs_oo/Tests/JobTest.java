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
        assertEquals("ACME", test_jobThree.getEmployer().getValue());
        assertEquals(true, test_jobThree.getLocation() instanceof Location);
        assertEquals("Desert", test_jobThree.getLocation().getValue());
        assertEquals(true, test_jobThree.getPositionType() instanceof PositionType);
        assertEquals("Quality Control", test_jobThree.getPositionType().getValue());
        assertEquals(true, test_jobThree.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_jobThree.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality () {
        assertFalse(test_jobThree.equals(test_jobFour));
    }

    @Test
    public void testBlankBeforeAndAfterJob () {
        assertTrue(test_jobThree.toString().startsWith("\n"));
        assertTrue(test_jobThree.toString().endsWith("\n"));
    //should return a string that contains a blank line before and after the job information)
    }

    @Test
    public void testToStringReturnsProperLabelsAndValues () {
        System.out.println(test_jobThree.toString());
        assertEquals("\nID: "+ test_jobThree.getId() +
                    "\nName: " + test_jobThree.getName() +
                    "\nEmployer: " + test_jobThree.getEmployer() +
                    "\nLocation: " + test_jobThree.getLocation() +
                    "\nPosition Type: " + test_jobThree.getPositionType() +
                    "\nCore Competency: " + test_jobThree.getCoreCompetency()+ "\n", test_jobThree.toString());
    }

    @Test
    public void addsMessageToEmptyField () {
        assertEquals("\nID: " + test_jobOne.getId() +
                "\nName: Data not available" +
                "\nEmployer: Data not available" +
                "\nLocation: Data not available" +
                "\nPosition Type: Data not available" +
                "\nCore Competency: Data not available" + "\n", test_jobOne.toString());
    }
}

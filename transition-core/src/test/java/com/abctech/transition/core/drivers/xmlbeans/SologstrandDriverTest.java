package com.abctech.transition.core.drivers.xmlbeans;

import com.abctech.mockland.runner.Mockland;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import com.abctech.transition.core.validate.XmlValidatorTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class SologstrandDriverTest {

    private static final Logger log = LoggerFactory.getLogger(SologstrandDriverTest.class);
    private Mockland mockland;
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();

    @Before
    public void testStartMockland() throws Exception {
        mockland = Mockland.createMockland();
        mockland.start();
    }

    @After
    public void testStopMockland() throws Exception {
        mockland.stop();
    }

    @Test
    public void testSologstrandDriver() throws IOException, UnknownCustomerFormatException, InvalidXMLException, DAOException {
        final String location = mockland.getBaseURI() + "xml/transition/sologstrand_ad.xml";
        XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
        iniValue.setFormat(CustomerFormat.SOLOGSTRAND);
        iniValue.setXmlInputStream(new URL(location).openStream());
        iniValue.setXmlFileLocation("/some/bogus/unused/file.txt");
        AXmlBeanDriver sologstrand = TransitionDriverManager.getXmlBeanDriver(iniValue);
        Assert.assertEquals("Bjerregård, Julianevej 33", sologstrand.getAdTitle());
        Assert.assertEquals("23-1247", sologstrand.getClientRef());
        Assert.assertEquals("OPEN", sologstrand.getTransactionStatus().toString());
        Assert.assertEquals("21946", sologstrand.getClientId().toString());
    }

}

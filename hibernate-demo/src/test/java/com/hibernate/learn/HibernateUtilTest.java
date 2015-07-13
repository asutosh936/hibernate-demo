package com.hibernate.learn;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by ashu936 on 7/12/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class HibernateUtilTest {

    @Test
    public void testHibernateUtil() throws Exception{
        assertNotNull(HibernateUtil.getSessionFactory());
    }
}

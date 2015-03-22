package com.ejushang.uams.client.api.test;

import com.ejushang.uams.api.dto.EmployeeDto;
import com.ejushang.uams.client.UamsClientContext;
import com.ejushang.uams.exception.UamsClientException;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

/**
 * User: liubin
 * Date: 14-3-19
 */
public class UamsClientTest {

    @Test
    public void testSyncFile() throws UamsClientException {
        boolean b = UamsClientContext.createUamsClient().syncPermissionFile();
        System.out.println(b);
    }

    @Test
    public void testLogin() throws UamsClientException {
        EmployeeDto employeeDto = UamsClientContext.createUamsClient().login("fdEmsHusername", null);
        print(employeeDto);
    }

    @Test
    public void testInit() throws Exception {
        UamsClientContext.init();
    }


    private void print(Object o) {
        if(o == null) {
            System.out.println("null");
        } else {
            System.out.println(ToStringBuilder.reflectionToString(o));
        }
    }

}

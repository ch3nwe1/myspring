package org.activiti.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RepositoryServiceTest {

    private Logger logger = LoggerFactory.getLogger(RepositoryServiceTest.class);

    @Test
    public void testDeploy(){

        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment()
                .addClasspathResource("org/activiti/test/VacationRequest.bpmn20.xml")
                .deploy();
        logger.info("Number of process definitions: " + repositoryService.createDeploymentQuery().count());

    }

}

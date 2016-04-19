package com.chrisgode.techtest.stories;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chrisgode.techtest.tests.AcceptanceTest;

@RunWith(SpringJUnit4ClassRunner.class)
@AcceptanceTest
public class StoryRunner extends AbstractSpringJBehaveConfig {

	@Override
	protected List<String> storyPaths() {
        String codeLocation = CodeLocations.codeLocationFromClass(this.getClass()).getFile();
        
        return new StoryFinder().findPaths(codeLocation, 
        		Arrays.asList("**/LoadAndSaveData.story"),
        		Arrays.asList(""), null);
	}
}

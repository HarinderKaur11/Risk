package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
				TestFortification.class, 
				TestMapFile.class, 
				TestMapValidation.class,
				TestPlayer.class,
				TestReinforcement.class
			})

public class AllTests {
}

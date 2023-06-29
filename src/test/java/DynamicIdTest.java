import org.testng.annotations.Test;

public class DynamicIdTest extends BaseTests {
    @Test
    public void initialTest() {

        homeSteps.getTopNavigationBar().
                clickOnHomeNavigationButton().
                openDynamicId();
    }
}

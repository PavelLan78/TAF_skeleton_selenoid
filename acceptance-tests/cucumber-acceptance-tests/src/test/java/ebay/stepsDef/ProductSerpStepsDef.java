/*
* Copyright 2002 - 2017 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package ebay.stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductSerpStepsDef extends AbstractStepsDef{
    /**
     * Check the following points:<br/>
     * <ul>
     *     <li>The host of URL if valid</li>
     *     <li>URL doesn`t have port</li>
     *     <li>Path of URL is "/sch/i.html"</li>
     * </ul>
     * @throws Throwable
     */
    @Then("^URL of product search page should be valid$")
    public void urlOfProductSearchPageShouldBeValid() throws Throwable {
        String expectedHost = new URI(siteUrl).getHost();
        assertThat(new URI(driver.getCurrentUrl())).hasHost(expectedHost)
                .hasNoPort()
                .hasPath("/sch/i.html");
    }

    @Then("^Check the number of snippets is \"([^\"]*)\"$")
    public void checkTheNumberOfSnippetsIs(int expected) throws Throwable {
        attachments.attachScreenShot("Check the number of snippets");
        assertThat(serpPage.getSnippets()).as("Check the number of snippets").hasSize(expected);
    }

    @And("^Check that Button 'Action' is present$")
    public void checkThatButtonActionIsPresent() throws Throwable {
        attachments.attachScreenShot("Check that Button 'Action' is present");
        assertThat(serpPage.getButtonAction()).as("Check that Button 'Action' is present").isTrue();
    }

    @And("^Check that Button 'Buy It Now' is present$")
    public void checkThatButtonBuyItNowIsPresent() throws Throwable {
        attachments.attachScreenShot("Check that Button 'Buy It Now' is presen");
        assertThat(serpPage.getButtonBuyItNow()).as("Check that Button 'Buy It Now' is present").isTrue();
    }
}

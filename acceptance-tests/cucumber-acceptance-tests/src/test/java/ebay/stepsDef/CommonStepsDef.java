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

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CommonStepsDef extends AbstractStepsDef{
    /**
     * Open home page by direct url
     * @throws Throwable
     */
    @Given("^I open home page$")
    public void iOpenHomePage() throws Throwable {
        homePage.open();
        attachments.attachScreenShot("Home page");
    }

    @And("^I change language of site to English$")
    public void iChangeLanguageOfSiteToEnglish() throws Throwable {
        homePage.changeLang();
        attachments.attachScreenShot("After language changes");
    }
}
